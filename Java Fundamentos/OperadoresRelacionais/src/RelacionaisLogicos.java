
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Relacionais
		// > < <= >= != ==
		
		int num1, num2;
		num1 = 10;
		num2 = 10;
		//if quer dizer condi��o, SE
		//testando igualdade
		if (num1 == num2) {
			System.out.println("N�mero1 e n�mero2 s�o iguais");
	}
		//testando desigualdade
		num1 = 20;
		num2 = 50;
		
		if (num1 != num2) {
			System.out.println("N�mero1 e n�mero2 s�o diferentes");
	}
		//testando maior
		num1 = 20;
		num2 = 12;
		//if quer dizer condi��o, SE
		if (num1 > num2) {
			System.out.println("N�mero1 � maior que n�mero2");
	} else {
		System.out.println("N�mero1 � menor que n�mero2");
	}
		
		//Operadores l�gicos
		// && = e / and; || = ou / or
		num1 = 10;
		num2 = 5;
		int num3 = 10, num4  = 5;
		if ((num2 > num3) && (num2 == num4)) {
			System.out.println("Primeira op��o satisfeita");
		} else {
			System.out.println("Segunda op��o satisfeita");
	}
		
		num2 = 10;
		if ((num2 > num3) || (num2 == num4)) {
			System.out.println("Primeira op��o satisfeita");
		} else {
			System.out.println("Segunda op��o satisfeita");
	}
	}
}
