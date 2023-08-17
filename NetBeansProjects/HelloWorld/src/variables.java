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
        System.out.println("3. SALIR");
        opcion = sc.nextInt();
        
        
        System.out.println("INGRESA EL PRIMER NÚMERO");
        x = sc.nextInt();
        System.out.println("INGRESA EL SEGUNDO NÚMERO");
        y = sc.nextInt();
        
        switch (opcion){
            case 1: 
                resultado = x+y;
                System.out.println("La respuesta es = "+resultado);
                break;
            case 2: 
                resultado = x-y;
                System.out.println("La respuesta es = "+resultado);
                break;
            default:
                System.out.println("NÚMERO INVÁLIDO");            
        }
        
              
     
    }
    
}
