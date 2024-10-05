package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarNotas {
    // Método para insertar alumno
    public void insertarAlumno(String carnet, String nombre, String apellido, String grado) {
        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            // Conectar a la base de datos
            conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/controlnotas", "usuario", "contraseña");

            // Consulta SQL para insertar alumno
            String sql = "INSERT INTO alumno (carnet, nombre, apellido, grado) VALUES (?, ?, ?, ?)";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, carnet);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, grado);

            // Ejecutar la inserción
            ps.executeUpdate();
            System.out.println("Alumno insertado exitosamente");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para insertar promedios en la tabla materias
    public void insertarPromedios(String carnetAlumno, double promedioMatematicas, double promedioCiencias, double promedioIngles, double promedioArte) {
        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            // Conectar a la base de datos
            conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/controlnotas", "usuario", "contraseña");

            // Consulta SQL para insertar los promedios
            String sql = "INSERT INTO materias (carnet_alumno, matematica, ciencias, ingles, arte) VALUES (?, ?, ?, ?, ?)";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, carnetAlumno);
            ps.setDouble(2, promedioMatematicas);
            ps.setDouble(3, promedioCiencias);
            ps.setDouble(4, promedioIngles);
            ps.setDouble(5, promedioArte);

            // Ejecutar la inserción
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Promedios insertados exitosamente");
            } else {
                System.out.println("No se insertaron promedios");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprimir el error para ver qué puede estar mal
        } finally {
            // Cerrar recursos
            try {
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

