package logica;

public class Materias {

    /**
     * Calcula el promedio de cuatro notas de Matematicas
     * 
     * @param nota1 La primera nota de Matematicas
     * @param nota2 La segunda nota de Matematicas
     * @param nota3 La tercera nota de Matematicas
     * @param nota4 La cuarta nota de Matematicas
     * @return El promedio de las cuatro notas
     */
    public double calcularPromedioMatematicas(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    /**
     * Calcula el promedio de cuatro notas de Ciencias
     * 
     * @param nota5 La primera nota de Ciencias
     * @param nota6 La segunda nota de Ciencias
     * @param nota7 La tercera nota de Ciencias
     * @param nota8 La cuarta nota de Ciencias
     * @return El promedio de las cuatro notas
     */
    public double calcularPromedioCiencias(double nota5, double nota6, double nota7, double nota8) {
        return (nota5 + nota6 + nota7 + nota8) / 4;
    }

    /**
     * Calcula el promedio de cuatro notas de Ingles
     * 
     * @param nota9 La primera nota de Ingles
     * @param nota10 La segunda nota de Ingles
     * @param nota11 La tercera nota de Ingles
     * @param nota12 La cuarta nota de Ingles
     * @return El promedio de las cuatro notas
     */
    public double calcularPromedioIngles(double nota9, double nota10, double nota11, double nota12) {
        return (nota9 + nota10 + nota11 + nota12) / 4;
    }

    /**
     * Calcula el promedio de cuatro notas de Arte.
     * 
     * @param nota13 La primera nota de Arte
     * @param nota14 La segunda nota de Arte
     * @param nota15 La tercera nota de Arte
     * @param nota16 La cuarta nota de Arte
     * @return El promedio de las cuatro notas
     */
    public double calcularPromedioArte(double nota13, double nota14, double nota15, double nota16) {
        return (nota13 + nota14 + nota15 + nota16) / 4;
    }
}