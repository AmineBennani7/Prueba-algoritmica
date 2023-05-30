import java.util.Random;
import java.util.Scanner;


public class Prueba {

//EJERCICIO 1

    private void ParImpar(Integer n){
     
        if  (n % 2 == 0){
            for (int i = n; i >= 0; i -= 2) {
                System.out.println(i);
        }}
        else{
            for (int i = n; i >= 1; i -= 2) {
                System.out.println(i);}}
        }

//EJERCICIO 2
    class Persona {
        char sexo;
         int edad;
        
        public Persona(char sexo, int edad) {
            this.sexo = sexo;
            this.edad = edad;
            }
        }
    
    //Primero se generan 50 personas de manera aleatoria (sexo y edad)
    private  Persona[] leePersonas(int cantidad) {
            Random random = new Random();
            Persona[] personas = new Persona[cantidad];
    
            for (int i = 0; i < cantidad; i++) {
                char sexo = random.nextBoolean() ? 'M' : 'F'; 
                int edad = random.nextInt(100); 
    
                personas[i] = new Persona(sexo, edad);
            }
    
            return personas;
        }

    private void estadisticasPersonas(){
           

            Persona[] personas = leePersonas(50);
            int totalPersonas = personas.length;
            int mayoresEdad = 0;
            int menoresEdad = 0;
            int mascMayores = 0;
            int femMenores = 0;
    
            for (Persona persona : personas) {
                if (persona.edad >= 18) {
                    mayoresEdad++;
                    if (persona.sexo == 'M') {
                        mascMayores++;
                    }
                } else {
                    menoresEdad++;
                    if (persona.sexo == 'F') {
                        femMenores++;
                    }
                }
            }

            double porcentajeMayores = (mayoresEdad / (double) totalPersonas) * 100;
            double porcentajeMujeres = (femMenores / (double) totalPersonas) * 100;
    
            System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
            System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
            System.out.println("Cantidad de personas masculinas mayores de edad: " + mascMayores);
            System.out.println("Cantidad de personas femeninas menores de edad: " + femMenores);
            System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
            System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
            
            }
    
    //EJERCICIO 3:
        private void calculaSalario(){
        Scanner scanner = new Scanner(System.in);
        Integer horasTrabajadas=0;
        Double tarifa = 0.0;
        Double salarioTotal= 0.0;
        Double salarioBase=0.0;
        
        Integer horasExtras=0;

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese la tarifa por hora: ");
        tarifa = scanner.nextDouble();


        if (horasTrabajadas > 40) {
             salarioBase = 40 * tarifa;
            horasExtras = horasTrabajadas - 40;
            double tarifaExtra = tarifa * 1.5; // Tarifa para horas extras
            salarioTotal = salarioBase + (horasExtras * tarifaExtra);
        } else {
            salarioTotal = horasTrabajadas * tarifa;
        }

       
        System.out.println(salarioTotal);
        



        }
    

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        System.out.println("EJERCICIO 1 :");
        System.out.println(" ");
        prueba.ParImpar(7);
        System.out.println("--------------------------------");


        System.out.println("EJERCICIO 2 :");
        System.out.println(" ");
        prueba.estadisticasPersonas();
        System.out.println("--------------------------------");

        System.out.println("EJERCICIO 3 :");
        System.out.println(" ");
        prueba.calculaSalario();
        System.out.println("--------------------------------");
        
        
    }
}
