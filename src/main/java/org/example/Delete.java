package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

    Conexcion conn = new Conexcion();
  public void Delete() throws SQLException {

    Connection coneccion = conn.conectar();
    
      //registro
        String deleteQuery = "DELETE FROM persona WHERE id = ?";
        PreparedStatement preparedStatement = coneccion.prepareStatement(deleteQuery);

        //pedir datos por consola
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID de la persona que desea eliminar: ");
        int id = scanner.nextInt();

        //establecer parámetros en la sentencia SQL
        preparedStatement.setInt(1, id);

        //ejecutar la sentencia SQL
        int rowsDeleted = preparedStatement.executeUpdate();

      System.out.println
      ((rowsDeleted > 0) ? ("Se ha eliminado correctamente la persona con ID " + id) : 
      ("No se ha encontrado ninguna persona con ID " + id));
    }
}


