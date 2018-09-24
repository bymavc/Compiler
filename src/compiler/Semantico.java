package compiler;

import java.util.ArrayList;
import java.util.Arrays;

public class Semantico {
    /*Declaracion del nombre del programa fuera de lugar o inexistente
    Programa sin inicio y/o fin
    Variables mostradas y/o usadas en expresiones matematicas que no hayan sido declaradas.
    Sentencias fuera del inicio y/o fin
    No deben existir expresiones matematicas antes de las declaraciones de variables, 
    ni declaraciones despues de expresiones matematicas
    */
    
    //Lista para guardar errores detectados en el analisis
    public ArrayList<String> errores = new ArrayList<>();
    
    public void verifyOrden(String text){
        
        //Guarda las palabras para el analisis semantico
        Database dbor = new Database();
        String PRO = dbor.getSimples().get(4).toString();
        String STA = dbor.getSimples().get(2).toString();
        String END = dbor.getSimples().get(1).toString();
        String DEC = dbor.getSimples().get(0).toString();
        String SHO = dbor.getSimples().get(3).toString();
        String MAT = dbor.getCompuestas().get(3).toString();
        
        //Contadores
        int vPRO = 0, vSTA = 0, vEND = 0, vDEC = 0, vSHO = 0, vMAT = 0;
        
        //Llamo a la clase sintactico para utilizar sus metodos
        Sintactico sin = new Sintactico();
        text = sin.expresiones(text);
        sin.getPalabras(text);
        sin.compareReservadas();
        
        //Ciclo para busqueda de errores
        for (int i = 0; i < sin.allPalabras.size(); i++) {
            if (sin.allPalabras.get(i).equals(PRO)){
                if (vPRO == 1){ errores.add("Más de un nombre de programa declarado"); }
                if (vSTA != 0 || vEND != 0){ errores.add("Nombre del programa declarado fuera de lugar"); }
                vPRO = 1;
            } else {
                if (sin.allPalabras.get(i).equals(STA)){
                    if (vSTA == 1){ errores.add("Más de una declaración de inicio"); }
                    if (vEND != 0 || vDEC != 0 || vSHO != 0 || vMAT != 0){ errores.add("Declaración de inicio fuera de lugar"); }
                    vSTA = 1;
                } else {
                    if (sin.allPalabras.get(i).equals(END)){
                        if (vEND == 1){ errores.add("Más de una declaración de fin"); }
                        vEND = 1;
                    } else {
                        if (sin.allPalabras.get(i).equals(DEC)){
                            if (vSTA == 0 || vEND != 0){ errores.add("Declaración de variable fuera de lugar"); }
                            if (vMAT != 0 || vSHO != 0){ errores.add("Declaración de variable despues de operaciones"); }
                            vDEC = 1;
                        } else {
                            if (sin.allPalabras.get(i).equals(SHO)){
                                if (vSTA == 0 || vEND != 0){ errores.add("Mostrar variable fuera de lugar"); }
                                vSHO = 1;
                            } else {
                                if (sin.allPalabras.get(i).equals(MAT)){
                                    if (vSTA == 0 || vEND != 0){ errores.add("Operaciones fuera de lugar"); }
                                    vMAT = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (vPRO == 0){ errores.add("No se declaró nombre de programa"); }
        if (vSTA == 0){ errores.add("No se declaró inicio de programa"); }
        if (vEND == 0){ errores.add("No se declaró fin de programa"); }
        if (errores.isEmpty()){ errores.add("No se detectaron errores"); }
    }
}
