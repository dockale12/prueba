package ejercicio01;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        String Sueldo = JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir ₡: ");
        Double Conversion = Double.parseDouble(Sueldo);
        Double Result = Conversion * .114;
        
        DecimalFormat Resultado = new DecimalFormat("#.00");
        String Mensaje = "La conversión es de $";
        JOptionPane.showMessageDialog(null, Mensaje + Resultado.format(Result));
         
        Ejercicio02.ejercicio2();
    }
}
