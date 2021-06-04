package ExerciciosLacos;
import java.util.Scanner;

public class teclado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		int n , soma = 0 ;
		
		System.out.println("Leia os valores e finalize com 0");
		
		 
		do { 
		 n = ler.nextInt();
		 soma += n; 
		 
		 
		}
 
	    while (n != 0);
		
		  System.out.println("Sua soma é: "  + soma);
	}
	
       
       
       

}
