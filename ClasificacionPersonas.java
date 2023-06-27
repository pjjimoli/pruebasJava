import java.util.Scanner;

public class ClasificacionPersonas {
    public static void main(String[] args) {
        Scanner LEER_PERSONAS = new Scanner(System.in);
        int totalPersonas = 50;
        Persona[] PERSONAS = new Persona[totalPersonas];
        
        for (int i = 0; i < totalPersonas; i++) {
            System.out.print("Ingrese el sexo (M/F) de la persona " + (i + 1) + ": ");
            char sexo = LEER_PERSONAS.next().charAt(0);
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            int edad = LEER_PERSONAS.nextInt();
            
            PERSONAS[i] = new Persona(sexo, edad);
        }
        
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int hombresMayoresDeEdad = 0;
        int mujeresMenoresDeEdad = 0;
        int mujeresMayoresDeEdad = 0;
        int hombresMenoresDeEdad = 0;
        int cantidadMujeres = mujeresMenoresDeEdad + mujeresMayoresDeEdad;
        int cantidadHombres = hombresMenoresDeEdad + hombresMayoresDeEdad;
        
        for (int i = 0; i < totalPersonas; i++) {
            Persona persona = PERSONAS[i];
            
            if (persona.EDAD >= 18) {
                mayoresDeEdad++;
                
                if (persona.SEXO == 'M') {
                    hombresMayoresDeEdad++;
                }
                if (persona.SEXO == 'F') {
                    mujeresMayoresDeEdad++;
                }
            } else {
                menoresDeEdad++;
                
                if (persona.SEXO == 'F') {
                    mujeresMenoresDeEdad++;
                }
                if (persona.SEXO == 'M') {
                    hombresMenoresDeEdad++;
                }
            }
        }
        
        double porcentajeMayoresDeEdad = (mayoresDeEdad * 100.0) / totalPersonas;
        double porcentajeMujeres = (cantidadMujeres * 100.0) / totalPersonas;
        
        System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + hombresMayoresDeEdad);
        System.out.println("Cantidad de mujeres menores de edad: " + mujeresMenoresDeEdad);
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresDeEdad + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
    }
}

class Persona {
    char SEXO;
    int EDAD;
    
    public Persona(char sexo, int edad) {
        this.SEXO = SEXO;
        this.EDAD = SEXO;
    }
}
