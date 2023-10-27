package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Get {

    Conexcion conn = new Conexcion();

    public void Get() throws SQLException {
       
        Connection coneccion = conn.conectar();
        //registro
        String selectQuery = "SELECT * FROM persona WHERE id = ?";
        PreparedStatement statement =  coneccion.prepareStatement(selectQuery);

        //pedir datos por consola
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el name de la persona que desea consultar: ");
        int id = scanner.nextInt();
    
        //establecer parámetros en la sentencia SQL
        statement.setInt(1, id);
    
        //ejecutar la sentencia SQL y obtener los resultados
         ResultSet resultSet = statement.executeQuery(); 
    
        //procesar los resultados
        while (resultSet.next()){
        String name = resultSet.getString("name");
        String apellido = resultSet.getString("apellido");
        String roll = resultSet.getString("roll");
        String descripcion = resultSet.getString("descripcion");
        System.out.println("Nombre: " + name + "\nApellido: " + apellido + "\nRol: " + roll + "\nDescripción: " + descripcion);
        }  
        
    }
}
