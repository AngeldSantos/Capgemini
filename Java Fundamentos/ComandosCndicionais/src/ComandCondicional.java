import java.rmi.UnexpectedException;

public class ComandCondicional {

	public static void main(String[] args) {
		// IF
		
		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("if normal - N�mero 1 � menor que n�mero 2");
		}
		if (num1 > num2) {
			System.out.println("if com else - N�mero 1 � maior que n�mero 2");
		} else {
			System.out.println("N�mero 1 � menor que n�mero 2");
		}
		
		// condi��o composta - situa��o num1 < num2
		if (num1 > num2) {
			System.out.println("if normal - N�mero 1 � maior que n�mero 2");
		}
		if (num1 < num2) {
			System.out.println("condi��o composta - N�mero 1 � menor que n�mero 2");
		} else {
			System.out.println("N�mero 1 � igual que n�mero 2");
		}
		if (num1 < num2) {
			System.out.println("condi��o composta - N�mero 1 � menor que n�mero 2");
		}
		
		//condi��o composta - situa��o num1 = num2
		num1 = 10;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("N�mero 1 � maior que n�mero 2");
		} else if (num1 < num2) {
			System.out.println("N�mero 1 � menor que n�mero 2");
		} else {
			System.out.println("N�mero 1 � igual que n�mero 2");		}
	}

		//comando condicinal SWITCH
		char opcao = '4';
		
		switch (opcao) {
			case '1': {
				System.out.println("Chame programa de inclus�o");
				break;	
			}
			case '2': {
				System.out.println("Chame programa de altera��o");
				break;
			}
			case '3': {
				System.out.println("Chame programa de exclus�o");
				break;
			}
			case '4': {
				System.out.println("Chame programa de consulta");
				break;
		}
		}
	}
	
}
