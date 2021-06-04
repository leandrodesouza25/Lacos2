package ExerciciosLacos;
import java.util.Scanner;
public class Psicologico {

	public static void main(String[] args) {
		
      Scanner ler = new Scanner(System.in);
      
      int idade , genero , pessoascalmas = 0, mulheresnervosas = 0, homensagressivos = 0 , outroscalmos = 0;
      int pessoasnervosas = 0 , pessoascalmasmenores = 0;
      int temperamento ;
      int i = 0;
      
      
      
      
      while ( i < 5) {
    	  
    	  System.out.println("Digite sua idade: ");
    	  idade = ler.nextInt();
    	  
    	  System.out.println("Insira seu gênero: " + "1 - masc. 2 - fem 3 - Outros");
    	  
    	  
    	  genero = ler.nextInt();
          
    	  System.out.println("Insira a numeração de seu temperamento: " + "1- calmo, 2 - nervoso , 3 - agressivo" );
    	  temperamento = ler.nextInt();
    	  
    	    if(temperamento == 1) {
    	    	pessoascalmas++; 
    	   	if	(genero == 2 && temperamento == 2){
    	   		
    	   		mulheresnervosas++;
    	   		
    	   	}
    	   	if(genero == 1 && temperamento == 3){}
    	   		homensagressivos++;
    	   	}
    	     if(genero == 3 && temperamento == 1 ){
    	    	 outroscalmos++;
    	     }
    	     if(idade >= 40 && temperamento == 2) { 
    	    	 pessoasnervosas++;
    	     }		
    	     
    	     if(idade <= 18 && temperamento == 1) {
    	    	 pessoascalmasmenores++;
    	    	}
    	     
    	     i++;
    	     
    	    
    	     System.out.println("O numero de pessoas calmas é: " + pessoascalmas);
    	     System.out.println("O número de mulheres nervosas é:" + mulheresnervosas);
    	     System.out.println("O numero de homens agressivos é: "+ homensagressivos);
    	     System.out.println("O numero de outros calmos é: " + outroscalmos);
    	     System.out.println("O numero de pessoas nervosas com mais de 40 anos é: "+ pessoasnervosas);
    	     System.out.println("O numero de pessoas calmas menores de idade é: " + pessoascalmasmenores);
    	    }
    	  
    	  
      }
		
		
		
	}


