import java.rmi.UnexpectedException;

public class ComandCondicional {

	public static void main(String[] args) {
		// IF
		
		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("if normal - Número 1 é menor que número 2");
		}
		if (num1 > num2) {
			System.out.println("if com else - Número 1 é maior que número 2");
		} else {
			System.out.println("Número 1 é menor que número 2");
		}
		
		// condição composta - situação num1 < num2
		if (num1 > num2) {
			System.out.println("if normal - Número 1 é maior que número 2");
		}
		if (num1 < num2) {
			System.out.println("condição composta - Número 1 é menor que número 2");
		} else {
			System.out.println("Número 1 é igual que número 2");
		}
		if (num1 < num2) {
			System.out.println("condição composta - Número 1 é menor que número 2");
		}
		
		//condição composta - situação num1 = num2
		num1 = 10;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("Número 1 é maior que número 2");
		} else if (num1 < num2) {
			System.out.println("Número 1 é menor que número 2");
		} else {
			System.out.println("Número 1 é igual que número 2");		}
	}

		//comando condicinal SWITCH
		char opcao = '4';
		
		switch (opcao) {
			case '1': {
				System.out.println("Chame programa de inclusão");
				break;	
			}
			case '2': {
				System.out.println("Chame programa de alteração");
				break;
			}
			case '3': {
				System.out.println("Chame programa de exclusão");
				break;
			}
			case '4': {
				System.out.println("Chame programa de consulta");
				break;
		}
		}
	}
	
}
