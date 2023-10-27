package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Conexcion {
    
    
    Connection conn = null;
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String usuario = "postgres";
    String Pass = "arthas1234";


    public Connection conectar (){
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,usuario,Pass);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }


    public PreparedStatement prepareStatement(String insertQuery) {
        return null;
    }
}
