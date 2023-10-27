package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

    Conexcion conn = new Conexcion();

    public void Update() throws SQLException {

        Connection coneccion = conn.conectar();
            //Conexion
            
            //pedir datos por consola
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el id de la persona a actualizar: ");
            int idPersona = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea restante
    
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
    
            System.out.print("Ingrese el apellido: ");
            String apellido = scanner.nextLine();
    
            System.out.print("Ingrese el rol: ");
            String rol = scanner.nextLine();
    
            System.out.print("Ingrese la descripción: ");
            String descripcion = scanner.nextLine();
    
            //registro
            String updateQuery = "UPDATE persona SET name=?, apellido=?, roll=?, descripcion=? WHERE id=?";
            PreparedStatement preparedStatement = coneccion.prepareStatement(updateQuery);
    
            //establecer parámetros en la sentencia SQL
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, rol);
            preparedStatement.setString(4, descripcion);
            preparedStatement.setInt(5, idPersona);
    
            //ejecutar la sentencia SQL
            int filasAfectadas = preparedStatement.executeUpdate();
    
            System.out.println("Filas afectadas: " + filasAfectadas);
        }
    }
    


