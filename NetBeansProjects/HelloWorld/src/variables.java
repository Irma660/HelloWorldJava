import java.util.Scanner; 
public class variables {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion;
        double resultado;
        double x;
        double y;
        System.out.println("-----BIENVENID@ A TU CALCULADORA-----");
        System.out.println("==========ELIGE UNA OPCIÓN===========");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        opcion = sc.nextInt();
        
        if (opcion == 1){
            System.out.println("ELIGIÓ LA OPCIÓN DE SUMAR");
        }else if (opcion <2){
            System.out.println("ESA OPCIÓN NO ESTA DISPONIBLE");   
        }
        System.out.println("INGRESA EL PRIMER NÚMERO");
        x = sc.nextInt();
        System.out.println("INGRESA EL SEGUNDO NÚMERO");
        y = sc.nextInt();
        
              
     
    }
    
}
