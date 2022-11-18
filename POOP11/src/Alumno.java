public class Alumno {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private int numCuenta;
    private int edad;
    private float promedio;
    
    public Alumno(String nombre, String aPaterno, String aMaterno, int numCuenta, int edad, float promedio) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.promedio = promedio;
    }

    public Alumno() {
    }

    /**
     * @return Regresa el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Método que modifica el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Regresa Apellido Paterno
     */
    public String getaPaterno() {
        return aPaterno;
    }

    /**
     * @param aPaterno Método que modifica el apellido paterno
     */
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    /**
     * @return Regresa apellido materno
     */
    public String getaMaterno() {
        return aMaterno;
    }

    /**
     * @param aMaterno Método que modifica el apellido materno
     */
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    /**
     * @return Regresa el número de cuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta Método que modifica el número de cuenta
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return Regresa la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad Método que modifica la edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return Regresa el promedio
     */
    public float getPromedio() {
        return promedio;
    }

    /**
     * @param promedio Método que modifica el promedio
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "\n" + nombre + "," + aPaterno + "," + aMaterno + "," + numCuenta + "," + edad + "," + promedio;
    }
}
