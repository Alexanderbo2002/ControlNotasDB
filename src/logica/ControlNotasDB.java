package logica;

import MariadbConexion.Conexion;
import igu.Pantalla;

public class ControlNotasDB {

    public static void main(String[] args) {
        Conexion c = new Conexion(); 
        // Creamos una instancia de la clase Pantalla que representa la ventana principal de la GUI
        Pantalla panta = new Pantalla(); 
        // Hacer visible la ventana de la GUI
        panta.setVisible(true);
        // Centrar la ventana en la pantalla
        panta.setLocationRelativeTo(null);
    }
    
}
