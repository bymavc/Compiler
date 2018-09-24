/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Tree {

    //Toma los separadores y operadores de la base de datos
    Database dbmt = new Database();
    String EQL = dbmt.especiales.get(3).toString(),
            POW = dbmt.operadores.get(0).toString(),
            SUB = dbmt.operadores.get(1).toString(),
            MUL = dbmt.operadores.get(2).toString(),
            DIV = dbmt.operadores.get(3).toString(),
            ADD = dbmt.operadores.get(4).toString(),
            OP = dbmt.separadores.get(0).toString(),
            CP = dbmt.separadores.get(1).toString(),
            OB = dbmt.separadores.get(2).toString(),
            CB = dbmt.separadores.get(3).toString(),
            OK = dbmt.separadores.get(4).toString(),
            CK = dbmt.separadores.get(5).toString();

    //Crea el primer nodo, la raiz
    public DefaultMutableTreeNode raiz = new DefaultMutableTreeNode();
    
    public ArrayList<String> operations = new ArrayList<>();

    //Recibe el string de la operacion e inicia la creacion del arbol dandole valor al primer nodo
    public DefaultTreeModel getTree(String root) {
        raiz = new DefaultMutableTreeNode(root);
        getHojas(raiz, root);
        DefaultTreeModel modelo = new DefaultTreeModel(raiz);
        return modelo;
    }

    //Metodo recursivo constructor del Arbol
    public void getHojas(DefaultMutableTreeNode raiz, String op) {
        //Crea las listas para los analisis y recorridos del metodo
        ArrayList<String> nodo = new ArrayList<>();
        ArrayList<String> operands = new ArrayList<>();
        String operador;
        operations.add(op);
        //Llena la lista operands
        operands.add(EQL);
        operands.add(SUB);
        operands.add(ADD);
        operands.add(DIV);
        operands.add(MUL);
        operands.add(POW);

        //Llama al metodo para quitar espacios
        op = quitEspacios(op);
        //Llama al metodo para analizar separadores
        op = analisisSeparadores(op);
        //Declara los contadores para los separadores
        int nP = 0, nB = 0, nK = 0;

        //Identifica el ciclo for para poder terminarlo dentro del ciclo interno
        outerloop:
        for (int i = 0; i < operands.size(); i++) {
            operador = operands.get(i);
            int j = 0;
            //Verifica separadores
            while (j < op.length()) {
                if (Character.toString(op.charAt(j)).equals(OP)) {
                    nP++;
                } else {
                    if (Character.toString(op.charAt(j)).equals(CP)) {
                        nP--;
                    } else {
                        if (Character.toString(op.charAt(j)).equals(OB)) {
                            nB++;
                        } else {
                            if (Character.toString(op.charAt(j)).equals(CB)) {
                                nB--;
                            } else {
                                if (Character.toString(op.charAt(j)).equals(OK)) {
                                    nK++;
                                } else {
                                    if (Character.toString(op.charAt(j)).equals(CK)) {
                                        nK--;
                                    } else {
                                        if (nP == 0 && nB == 0 && nK == 0) {
                                            //Verifica operador y rompe el ciclo
                                            if (Character.toString(op.charAt(j)).equals(operador)) {
                                                String str1 = op.substring(0, j);
                                                String str2 = op.substring(j + operador.length(), op.length());
                                                nodo.add(str1);
                                                nodo.add(str2);
                                                break outerloop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                j++;
            }
        }
        //Llama nuevamente al metodo para seguir construyendo el arbol
        for (int i = 0; i < nodo.size(); i++) {
            DefaultMutableTreeNode hoja = new DefaultMutableTreeNode(nodo.get(i));
            getHojas(hoja, nodo.get(i));
            raiz.add(hoja);
        }
    }

    //Metodo Recursivo de analisis de parentesis
    public String analisisSeparadores(String op) {
        //Declara los contadores de los separadores
        //nO contara los caracteres fuera de los separadores
        int nP = 0, nB = 0, nK = 0, nO = 0;
        //Ciclo for para el analisis de los separadores
        for (int i = 0; i < op.length(); i++) {
            if (Character.toString(op.charAt(i)).equals(OP)) {
                nP++;
            } else {
                if (Character.toString(op.charAt(i)).equals(CP)) {
                    nP--;
                } else {
                    if (Character.toString(op.charAt(i)).equals(OB)) {
                        nB--;
                    } else {
                        if (Character.toString(op.charAt(i)).equals(CB)) {
                            nB--;
                        } else {
                            if (Character.toString(op.charAt(i)).equals(OK)) {
                                nK++;
                            } else {
                                if (Character.toString(op.charAt(i)).equals(CK)) {
                                    nK--;
                                } else {
                                    if (nP == 0 && nB == 0 && nK == 0) {
                                        nO++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //Si no existen caracteres fuera de los separadores
        //Eliminara el primero y ultimo y volvera a llamar el metodo
        if (nO == 0) {
            op = op.substring(1, op.length() - 1);
            op = analisisSeparadores(op);
        }
        //Regresa el String luego de terminar la operacion
        return op;
    }

    //Metodo para eliminar espacios
    public String quitEspacios(String text) {
        text = text.replaceAll("[\n\r]", "");
        text = text.replaceAll(" ", "");

        return text;
    }
    
    public void analisisOperaciones(){
        for (int i = 0; i < operations.size(); i++){
            if (3 > operations.get(i).length()){
                operations.remove(i);
                i--;
            }
        }
    }
}
