
public class Aritimeticos {

	public static void main(String[] args) {
		int num1, num2, num3;
		//soma
		num1 = 10;
		num2 = 20;
		num3 = num1 + num2;
		System.out.println("O resultado da soma �: " + num3);
		//subtra��o
		num1 = 10;
		num2 = 20;
		num3 = num1 - num2;
		System.out.println("O resultado da subtra��o �: " + num3);
		//multiplica��o
		num1 = 10;
		num2 = 20;
		num3 = num1 * num2;
		System.out.println("O resultado da multiplica��o �: " + num3);
		//divis�o
		num1 = 20;
		num2 = 2;
		num3 = num1 / num2;
		System.out.println("O resultado da divis�o �: " + num3);
		System.out.println("-----------------------------");
		
		// Incrementar = somar de 1 em 1
		num1 = 0;
		while (num1 <= 10) {
			num1++;
			System.out.println(num1);
			System.out.println("-----------------------------");
		}
		
		// Decementar = somar de 1 em 1
		num1 = 10;
		while (num1 > 0) {
			num1--;
			System.out.println(num1);
					
		}
	}

}
