package ExerciciosLacos;
import java.util.Scanner;

public class multiplos3 {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	
	int n  , soma = 0, contador = 0 ;
	double media = 0 ;
	
	System.out.println("Leia os valores e finalize com 0");
	
	 
	do { 
		
		
	 n = ler.nextInt();
	 
	 
	 
	  if(n % 3 == 0) {
		  soma = soma + n;
		  contador++;
	  }

	  
	  
	  
	}

    while (n != 0);
	 ler.close();
	 media = soma / contador;
	 
	  System.out.println("Seu resultado é : "  + media);
	  
	  
	  
}
	
}
