/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.util.ArrayList;

/**
 *
 * @author Miguel Angel
 */
public class Lexico {
    public ArrayList<String> compEspeciales = new ArrayList<>();
    public ArrayList<String> compSeparadores = new ArrayList<>();
    public ArrayList<String> compOperadores = new ArrayList<>();
    public ArrayList<String> compNumeros = new ArrayList<>();
    public ArrayList<String> compLetras = new ArrayList<>();
    public ArrayList<String> compErrores = new ArrayList<>();
    
    public ArrayList<String> comments = new ArrayList<>();
    
    public ArrayList<String> showComentarios() {
        return comments;
    }
    public ArrayList<String> showEspeciales(){
        return compEspeciales;
    }
    public ArrayList<String> showSeparadores(){
        return compSeparadores;
    }
    public ArrayList<String> showOperadores(){
        return compOperadores;
    }
    public ArrayList<String> showNumeros(){
        return compNumeros;
    }
    public ArrayList<String> showLetras(){
        return compLetras;
    }
    public ArrayList<String> showErrores(){
        return compErrores;
    }

    //Extrae los espacios del text
    public String quitEspacios(String text) {
        text = text.replaceAll("[\n\r]", "");
        text = text.replaceAll(" ", "");
        
        return text;
    }
    
    //Extraer comentarios
    public String comentarios(String text) {
        Database dbcomm = new Database();
        String startComentario = dbcomm.getCompuestas().get(0).toString();
        String endComentario = dbcomm.getCompuestas().get(1).toString();
        int beginIndex = 0;
        while (beginIndex != -1) {
            beginIndex = text.indexOf(startComentario);
            if (beginIndex != -1) {
                int endIndex = text.indexOf(endComentario, beginIndex);
                if (endIndex == -1) {
                    text = text.substring(0, beginIndex);
                } else {
                    comments.add(text.substring(startComentario.length() + beginIndex, endIndex));
                    String beforeComentario = text.substring(0, beginIndex);
                    String afterComentario = text.substring(endIndex+endComentario.length(), text.length());
                    text = beforeComentario + afterComentario;
                }
            }
        }
        return text;
    }

    //Lleva a cabo la comparacion entre el text sin espacios y la tabla de simbolos
    public void compareSimples(String text) {
        text = text.toLowerCase();
        Database dbcomp = new Database();
        for (int i = 0; i < text.length(); i++) {
            if (dbcomp.especiales.contains(Character.toString(text.charAt(i)))) {
                compEspeciales.add(Character.toString(text.charAt(i)));
            } else {
                if (dbcomp.separadores.contains(Character.toString(text.charAt(i)))) {
                    compSeparadores.add(Character.toString(text.charAt(i)));
                } else {
                    if (dbcomp.operadores.contains(Character.toString(text.charAt(i)))) {
                        compOperadores.add(Character.toString(text.charAt(i)));
                    } else {
                        if (dbcomp.numeros.contains(Character.toString(text.charAt(i)))) {
                            compNumeros.add(Character.toString(text.charAt(i)));
                        } else {
                            if (dbcomp.letras.contains(Character.toString(text.charAt(i)))) {
                                compLetras.add(Character.toString(text.charAt(i)));
                            } else {
                                compErrores.add(Character.toString(text.charAt(i)));
                            }
                        }
                    }
                }
            }
        }
    }  
}
