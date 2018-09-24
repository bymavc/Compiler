package compiler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class Database {

    private static final String dbDriver = "com.mysql.jdbc.Driver";
    private static final String dbURL = "jdbc:mysql://localhost:3306/compilerDatabase";
    private static final String dbUser = "root";
    private static final String dbPass = "mysql";
    public ArrayList<ArrayList> simbolos = new ArrayList<>();
    public ArrayList<ArrayList> reservadas = new ArrayList<>();
    public ArrayList<Object> especiales = new ArrayList<>();
    public ArrayList<Object> operadores = new ArrayList<>();
    public ArrayList<Object> separadores = new ArrayList<>();
    public ArrayList<Object> letras = new ArrayList<>();
    public ArrayList<Object> numeros = new ArrayList<>();
    public ArrayList<Object> simples = new ArrayList<>();
    public ArrayList<Object> compuestas = new ArrayList<>();
    
    private Connection conn;
    private Properties prop;

    public Database() {
        queryToTable("palabras_reservadas");
        queryToTable("simbolos");
        classifier();
    }

    public Properties getProps() {
        prop = new Properties();
        prop.setProperty("user", dbUser);
        prop.setProperty("password", dbPass);
        return prop;
    }

    public Connection getConn() {
        try {
            Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbURL, getProps());
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public ArrayList<ArrayList> getSimbolos() {
        return simbolos;
    }

    public ArrayList<ArrayList> getReservadas() {
        return reservadas;
    }

    public ArrayList<Object> getEspeciales() {
        return especiales;
    }

    public ArrayList<Object> getOperadores() {
        return operadores;
    }

    public ArrayList<Object> getSeparadores() {
        return separadores;
    }

    public ArrayList<Object> getLetras() {
        return letras;
    }

    public ArrayList<Object> getNumeros() {
        return numeros;
    }

    public ArrayList<Object> getSimples() {
        return simples;
    }

    public ArrayList<Object> getCompuestas() {
        return compuestas;
    }
    
    
    public final void queryToTable(String table) {
        try {
            Statement statement = getConn().createStatement();
            String query = "select * from " + table + ";";
            ResultSet resultSet = statement.executeQuery(query);
            try {
                resultSet = statement.executeQuery(query);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                while (resultSet.next()) {
                    ArrayList tablesRow = new ArrayList<>();
                    Object tablesColumn;
                    for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
                        tablesColumn = resultSet.getObject(i + 1);
                        tablesRow.add(tablesColumn);
                    }
                    if ("palabras_reservadas".equals(table)) {
                        reservadas.add(tablesRow);
                    } else {
                        simbolos.add(tablesRow);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public final void classifier() {
        for (int i = 0; i < getSimbolos().size(); i++) {
            String type = getSimbolos().get(i).get(1).toString();
            switch(type){
                case "separador":
                    separadores.add(getSimbolos().get(i).get(0));
                    break;
                case "operador":
                    operadores.add(getSimbolos().get(i).get(0));
                    break;
                case "letra":
                    letras.add(getSimbolos().get(i).get(0));
                    break;
                case "numero":
                    numeros.add(getSimbolos().get(i).get(0));
                    break;
                case "especial":
                    especiales.add(getSimbolos().get(i).get(0));
                    break;
            }
        }
        for(int i = 0; i<getReservadas().size();i++){
            String type = getReservadas().get(i).get(1).toString();
            if("simple".equals(type)){
                simples.add(getReservadas().get(i).get(0));
            }else{
                compuestas.add(getReservadas().get(i).get(0));
            }
        }
    }
}
