import java.util.Scanner;

public class ParImparDescendente {
    public static void main(String[] args) {
        Scanner LEER_NUMERO = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int NUMERO = LEER_NUMERO.nextInt();
        
        if (NUMERO % 2 == 0) {
            System.out.println("El número es par.");
            for (int i = NUMERO; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("El número es impar.");
            for (int i = NUMERO; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
    }
}
