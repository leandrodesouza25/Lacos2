package ExerciciosLacos;
import java.util.Scanner;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		int idade , soma = 0 , cont21 = 0 , cont51 = 0;
		Scanner ler = new Scanner(System.in);
		
		
		
		System.out.println("Digite sua idade" + " " + "O contador irá parar ao digitar -99");
		 idade = ler.nextInt();
		 
		do {  idade++;
		       
			
			}
		while ( idade <= 21 && idade == -99 );
		
		cont21 = idade + cont21;
			
			
			
		 System.out.println("sua soma é:" + cont21);

	
	   do { idade++;
		   
		   
		   
	   }
	   
	   while(idade >= 51 && idade == -99);

	   cont51 = idade + cont51 ;
	
	   
	   System.out.println("sua soma é:" + cont51);
	}
	
	
}


