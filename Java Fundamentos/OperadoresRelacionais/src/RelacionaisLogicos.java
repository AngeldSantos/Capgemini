
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Relacionais
		// > < <= >= != ==
		
		int num1, num2;
		num1 = 10;
		num2 = 10;
		//if quer dizer condição, SE
		//testando igualdade
		if (num1 == num2) {
			System.out.println("Número1 e número2 são iguais");
	}
		//testando desigualdade
		num1 = 20;
		num2 = 50;
		
		if (num1 != num2) {
			System.out.println("Número1 e número2 são diferentes");
	}
		//testando maior
		num1 = 20;
		num2 = 12;
		//if quer dizer condição, SE
		if (num1 > num2) {
			System.out.println("Número1 é maior que número2");
	} else {
		System.out.println("Número1 é menor que número2");
	}
		
		//Operadores lógicos
		// && = e / and; || = ou / or
		num1 = 10;
		num2 = 5;
		int num3 = 10, num4  = 5;
		if ((num2 > num3) && (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Segunda opção satisfeita");
	}
		
		num2 = 10;
		if ((num2 > num3) || (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Segunda opção satisfeita");
	}
	}
}
