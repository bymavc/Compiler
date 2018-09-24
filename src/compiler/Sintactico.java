/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author clases
 */
public class Sintactico {
    public ArrayList<String> compSimples = new ArrayList<>();
    public ArrayList<String> compCompuestas = new ArrayList<>();
    public ArrayList<String> compVariables = new ArrayList<>();
    public ArrayList<String> compMostradas = new ArrayList<>();
    public ArrayList<String> compErrores = new ArrayList<>();
    
    public ArrayList<String> expressions = new ArrayList<>();
    public ArrayList<String> allPalabras = new ArrayList<>();
    
    public String compNombre;
    
    public ArrayList<String> showExpresiones(){
        return expressions;
    }
    public ArrayList<String> showPalabras(){
        return allPalabras;
    }
    public ArrayList<String> showSimples(){
        return compSimples;
    }
    public ArrayList<String> showCompuestas(){
        return compCompuestas;
    }
    public ArrayList<String> showVariables(){
        return compVariables;
    }
    public ArrayList<String> showErrores(){
        return compErrores;
    }
    
    //Extrae las expresiones matematicas del text
    public String expresiones(String text) {
        Database dbexp = new Database();
        String startExpresion = dbexp.getCompuestas().get(3).toString();
        String endExpresion = dbexp.getCompuestas().get(2).toString();
        int beginIndex = 0;
        while (beginIndex != -1) {
            beginIndex = text.indexOf(startExpresion, 0);
            if (beginIndex != -1) {
                int endIndex = text.indexOf(endExpresion, beginIndex);
                if (endIndex == -1) {
                    text = text.substring(0, beginIndex);
                } else {
                  
                    expressions.add(text.substring(beginIndex + startExpresion.length(), endIndex));
                    String beforeExpresion = text.substring(0, beginIndex);
                    String afterExpresion = text.substring(endIndex+endExpresion.length(), text.length());
                    text = beforeExpresion + afterExpresion;
                    System.out.println(text);
                } 
            }
        }
        return text;
    }
    
    //Ordena palabra a palabra en ArrayList
    public void getPalabras(String text){
        text = text.replaceAll("\\s+",",");
        String[] str = text.split(",");
        allPalabras = new ArrayList<>(Arrays.asList(str));
        for (int i = 0; i < allPalabras.size(); i++){
            if (allPalabras.get(i).equals("")){
                allPalabras.remove(i);
            }
        }
    }
    
    //Comparacion con las palabras reservadas
    public void compareReservadas(){
        Database dbcomp = new Database();
        for (int i = 0; i < allPalabras.size(); i++){
            if (dbcomp.compuestas.contains(allPalabras.get(i))){
                compCompuestas.add(allPalabras.get(i));
            } else {
                if (dbcomp.simples.contains(allPalabras.get(i))){
                    compSimples.add(allPalabras.get(i));
                } else {
                    if(i > 0){
                        if (allPalabras.get(i-1).equals(dbcomp.simples.get(0))){
                            compVariables.add(allPalabras.get(i));
                        } else {
                            if (allPalabras.get(i-1).equals(dbcomp.simples.get(4))){
                                compNombre = allPalabras.get(i).toString();
                            } else {
                                if ((allPalabras.get(i-1).equals(dbcomp.simples.get(3))) && (compVariables.contains(allPalabras.get(i)))){
                                    compMostradas.add(allPalabras.get(i));
                                } else {
                                    compErrores.add(allPalabras.get(i));
                                }
                            }
                        }
                    } else {
                        compErrores.add(allPalabras.get(i));
                    }
                }
            }
        }
    }
}
