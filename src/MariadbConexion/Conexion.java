package MariadbConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    Connection conn;
    private String host = "localhost";
    private String port = "3306"; 
    private String dbname = "controlnotas";
    private String username = "alexander";
    private String password = "0828";

    public Conexion() {
        try {
            String url = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.dbname + "?useSSL=false";
            conn = DriverManager.getConnection(url, this.username, this.password);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("Error, no se pudo conectar: " + e.getMessage());
        }
    }

    public void insertarAlumno(String carnet, String nombre, String apellido, String grado) {
        String sql = "INSERT INTO alumno (carnet, nombre, apellido, grado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            stmt.setString(1, carnet);
            stmt.setString(2, nombre);
            stmt.setString(3, apellido);
            stmt.setString(4, grado);

            // Ejecutar la inserción
            stmt.executeUpdate();
            System.out.println("Alumno insertado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al insertar alumno: " + e.getMessage());
        }
    }
    //metodo para insertar nota
    public void insertarNota(String carnet) {
        String sql = "INSERT INTO materias (carnet_alumno) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            stmt.setString(1, carnet);

            // Ejecutar la inserción
            stmt.executeUpdate();
            System.out.println("Nota insertada");
        } catch (SQLException e) {
            System.out.println("Error al insertar nota: " + e.getMessage());
        }
    }
    // Método para cerrar la conexión
    public void cerrarConexion() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
