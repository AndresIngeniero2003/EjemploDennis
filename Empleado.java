public class Empleado {

    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int Edad;
    private String Cargo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public Empleado(String nombre, String apellido, String direccion, int edad, String cargo){

        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Direccion = direccion;
        this.Edad = edad;
        this.Cargo = cargo;

    }
}
