package imc;

import java.util.Scanner;

public class ImcMenu {

	void executar() {
		//Declara��o das vari�veis (Refatora��o)
		int pesoDoUsuario;
		double alturaDoUsuario, imc;
		
		//Ler o teclado do usu�rio
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual e o seu nome?");
		String nomeDoUsuario = leitor.nextLine();
		
		// Mostrar qual � o caractrete que est� na posi��o 3
		// System.out.println(nomeDoUsuario.charAt(2));
		
		// Criando as vari�veis para o c�lculo
		System.out.print(nomeDoUsuario + " Digite eu peso: "); //Concatenar
		pesoDoUsuario = leitor.nextInt();
		System.out.print("\nDigite sua altura: ");
		alturaDoUsuario = leitor.nextDouble();
		
		leitor.close();
		
		//Executar Method
		Imc classimc = new Imc();
		double calculoImc = classimc.calcularImc(pesoDoUsuario,alturaDoUsuario);
		
		imc = calculoImc;
		
		System.out.println("");
		System.out.println(nomeDoUsuario + ", seu imc � " + imc);
		
		classimc.classificarImc(imc);
	}
	
}
