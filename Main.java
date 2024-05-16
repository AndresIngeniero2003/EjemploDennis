import java.util.LinkedList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Empleado> lista = new LinkedList<>();
        ModificarEdad me = new ModificarEdad();
        imprimir im = new imprimir();

        for(int i=0; i<3; i++){
            Empleado item = new Empleado(null, null, null, i, null);
            System.out.print("Ingrese el Nombre:  ");
            item.setNombre(sc.next());
            System.out.print("Ingrese el Apellido:  ");
            item.setApellido(sc.next());
            System.out.print("Ingrese la Direccion:  ");
            item.setDireccion(sc.next());
            System.out.print("Ingrese la Edad:  ");
            item.setEdad(sc.nextInt());
            System.out.print("Ingrese el Cargo:  ");
            item.setCargo(sc.next());
            lista.add(item);

        }

        lista = me.Edad(lista);

        String cadena = im.mostrar(lista);
        
        System.out.println(cadena);
    }
}