import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner LEER_HORASTRABAJADAS = new Scanner(System.in);
        Scanner LEER_TARIFA = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        int HORASTRABAJADAS = LEER_HORASTRABAJADAS.nextInt();
        
        System.out.print("Ingrese la tarifa por hora: ");
        double TARIFA = LEER_TARIFA.nextDouble();
        
        double sueldo = 0.0;
        
        if (HORASTRABAJADAS > 40) {
            int horasExtras = HORASTRABAJADAS - 40;
            double tarifaExtra = TARIFA * 1.5;
            sueldo = (40 * TARIFA) + (horasExtras * tarifaExtra);
        } else {
            sueldo = HORASTRABAJADAS * TARIFA;
        }
        
        System.out.println("El sueldo recibido es: " + sueldo);
    }
}
