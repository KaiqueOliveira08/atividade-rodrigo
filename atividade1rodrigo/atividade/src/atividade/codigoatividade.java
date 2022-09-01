package atividade;

import java.util.Scanner;

public class codigoatividade {
	  public static void main(String[] args) {
	
	Scanner atv = new Scanner (System.in);
	double media, nota1, nota2;
	
    
    System.out.println("Digite a primeira nota (Peso 2): ");
    nota1 = atv.nextDouble();
    
    System.out.println("Digite a segunda nota (Peso 3):");
    nota2 = atv.nextDouble();
    media=(nota1+nota2)/2;
    
    System.out.println("A média do aluno é: " + (((nota1*2)+(nota2*3)))/5);


	  }
}