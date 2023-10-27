package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class Casos {
    public void funciones() throws SQLException {
        
    
    while (true) {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Crear una persona");
        System.out.println("2. Leer una persona");
        System.out.println("3. Actualizar una persona");
        System.out.println("4. Eliminar una persona");
        System.out.println("5. Salir");

        //Scanner scanner;
        Scanner reader = new Scanner(System.in);
        int opcion = reader.nextInt();
        reader.nextLine(); // para limpiar el buffer de entrada
    
    
   
    switch (opcion) {
        case 1:
            crearPersona();
            break;
        case 2:
            leerPersona();
            break;
        case 3:
            actualizarPersona();
            break;
        case 4:
            eliminarPersona();
            break;
        case 5:
            System.out.println("Gracias vuelva pronto");
            return;
        default:
            System.out.println("Opción inválida");
            break;
    }

    
}
}


private static void eliminarPersona() throws SQLException {
    Delete delete = new Delete();
    delete.Delete();
    
}

private static void actualizarPersona() throws SQLException {
    Update update = new Update();
    update.Update();
}

public static void leerPersona() throws SQLException {
    Get get = new Get();
    get.Get();
}

public  void crearPersona() throws SQLException { 
    Create create = new Create();
    create.Create();
}

}