import java.util.LinkedList;

public class ModificarEdad{

    public LinkedList<Empleado> Edad(LinkedList<Empleado> lista){

        for (Empleado item : lista) {
            if (item.getEdad() < 18) {
                item.setEdad(15);;
            }else{
                item.setEdad(20);
            }
        }

        return lista;
    }
}