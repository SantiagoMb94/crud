package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Create {
        
        Conexcion conn = new Conexcion();
        public void Create() throws SQLException {
        Connection coneccion = conn.conectar();
        //registro
        String insertQuery = "INSERT INTO persona (name,apellido,roll,descripcion) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = coneccion.prepareStatement(insertQuery);

        //pedir datos por consola
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el rol: ");
        String rol = scanner.nextLine();

        System.out.print("Ingrese la descripción: ");
        String descripcion = scanner.nextLine();

        //establecer parámetros en la sentencia SQL
        preparedStatement.setString(1, nombre);
        preparedStatement.setString(2, apellido);
        preparedStatement.setString(3, rol);
        preparedStatement.setString(4, descripcion);

        //ejecutar la sentencia SQL
        preparedStatement.executeUpdate();
}

}
