package imc;

public class Imc {

	double calcularImc(int peso, double altura) {
		
		System.out.println("Eu sei calcular IMC!!");
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC = " + imc);
		
		return imc;
		
	}
	
	void classificarImc(double imc) {
		
		System.out.println("Eu sei classificar o IMC!!");
		
		//Classificação do IMC
		System.out.println("-------------------------------------------------");
		System.out.println("CLASSIFICAÇÃO                 | IMC");
		System.out.println("-------------------------------------------------");
		System.out.println("ABAIXO DO PESO                | ABAIXO 18,5");
		System.out.println("PESO NORMAL                   | 18,5 - 24,9");
		System.out.println("SOBREPESO                     | 25 - 29,9");
		System.out.println("OBESIDADE GRAU I              | 30 - 34,9");
		System.out.println("OBESIDADE GRAU II             | 35 - 39,9");
		System.out.println("OBESIDADE GRAU III ou MÓRBIDA | MAIOR ou IGUAL 40");
		System.out.println("-------------------------------------------------");
		
		
		//Determinar a classificação do IMC
		if (imc < 18.5) {
			System.out.println("Você está ABAIXO DO PESO!!");
		}
		else if (imc >= 18.5 && imc < 25) {
			System.out.println("Você está com PESO NORMAL!!");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Você está com SOBREPESO!!");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Você está com OBESIDADE GRAU I !!");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Você está com OBESIDADE GRAU II !!");
		} else if (imc >= 40) {
			System.out.println("Você está com OBESIDADE GRAU III ou MÓRBIDA !!");
		}
		
	}
}
