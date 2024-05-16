import java.util.LinkedList;

public class imprimir {

    public String mostrar(LinkedList<Empleado> lista){

        String cadena = " ";
        for (Empleado empleado : lista) {

            cadena = cadena + "\n" + empleado.getNombre() + "\n" + empleado.getApellido() + "\n" + empleado.getDireccion() +
            "\n" + empleado.getEdad() + "\n" + empleado.getCargo() + "\n";
        }
        return cadena;
    }

}
