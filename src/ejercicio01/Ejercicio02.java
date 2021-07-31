package ejercicio01;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio02 {
    
    
    public static void ejercicio2(){
     Scanner Teclado = new Scanner(System.in);
     double Sueldo, Result;
     String Nombre, Direccion, Telefono;
             
     System.out.print("\n\nPrograma del sueldo de un trabajador");
     System.out.print("\nIngrese el nombre del trabajador: ");
     Nombre = Teclado.next();
     System.out.print("Ingrese la direccion del trabajador: ");
     Direccion = Teclado.next();
     System.out.print("Ingrese el número de teléfono del trabajador: ");
     Telefono = Teclado.next();
     System.out.print("Ingrese el sueldo del trabajador $");
     Sueldo = Teclado.nextDouble(); 
     
     Result = Sueldo *.77;
     
     DecimalFormat Resultado = new DecimalFormat("#.00");
     System.out.println("\n\nEl nombre del trabajador es:" +Nombre);
     System.out.println("La dirección:" +Direccion);
     System.out.println("El teléfono del empleado es de:" +Telefono);
     System.out.println("El salario es de $"+Resultado.format(Result));
    }   
}
