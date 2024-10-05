package logica;

import MariadbConexion.Conexion;
import javax.swing.JTextField;

public class InsertarDatosU {

    private JTextField jTextFieldDato1;
    private JTextField jTextFieldDato2;
    private JTextField jTextFieldDato3;
    private JTextField jTextFieldDato4;

    // Constructor para recibir los campos de texto
    public InsertarDatosU(JTextField jTextField1, JTextField jTextField2, 
                                       JTextField jTextField3, JTextField jTextField4) {
        this.jTextFieldDato1 = jTextField1;
        this.jTextFieldDato2 = jTextField2;
        this.jTextFieldDato3 = jTextField3;
        this.jTextFieldDato4 = jTextField4;
    }

 public void MetodoInsertarDatosU() {
    // Obtener los datos desde los campos de texto
    String carnet = jTextFieldDato1.getText();
    String nombre = jTextFieldDato2.getText();
    String apellido = jTextFieldDato3.getText();
    String grado = jTextFieldDato4.getText();

    // Verificar que los campos no estén vacíos
    if (carnet.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || grado.isEmpty()) {
        System.out.println("Todos los campos deben estar llenos");
        return; // Salir del método si hay algún campo vacío
    }

    // Crear conexión y llamar al método para insertar el alumno
   // Crear conexión y llamar al método para insertar el alumno
    Conexion c = new Conexion();
    try {
        // Insertar el alumno
        c.insertarAlumno(carnet, nombre, apellido, grado);
        System.out.println("Alumno insertado exitosamente");

        // Insertar el carnet en la tabla materias
        c.insertarNota(carnet);
        System.out.println("Carnet del alumno agregado a materias");

    } catch (Exception e) {
        System.out.println("Error al insertar datos: " + e.getMessage());
    } finally {
        c.cerrarConexion(); // Cerrar la conexión
    }

    // Limpiar los campos de texto después de insertar
    jTextFieldDato1.setText("");
    jTextFieldDato2.setText("");
    jTextFieldDato3.setText("");
    jTextFieldDato4.setText("");
}
}
