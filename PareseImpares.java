package ExerciciosLacos;
import java.util.Scanner;



public class PareseImpares {
    public static void main(String[] args) {
    	
    	
    	Scanner ler = new Scanner(System.in);
    	
    	int n , par = 0 , impar = 0;
    	
    	
    	for( int i = 0 ; i <= 10; i++) {
    		
    		System.out.println("Digite o numero: ");
    		n = ler.nextInt();
    		

    		

   
    		if(n % 2 == 0) {
    			par++;
    			
    		}
    		
    		else  {
    			
    			impar++;
    		}
    	}
    		
    		System.out.println(par + " São pares");
    		System.out.println("\n" + impar + " São impares");
    		
    	
    	
    	
    	
    			
    			
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
