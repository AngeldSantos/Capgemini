
public class LacoRepeticao {

	public static void main(String[] args) {
		// comando WHILE - testa a condi��o, at� que n�o seja satisfeita a condi��o
		
		int qtdVezes = 1;
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + "� vez");
			qtdVezes++; // ++ = qtdvezes + 1
		}
		System.out.println("Sa� do la�o e executei " + (qtdVezes-1) + " vezes");
	
		//Do while - la�o po=�s-testado
		qtdVezes = 11;
		do {
			System.out.println("Estou fazendo a " + qtdVezes + " � vez");
			qtdVezes++;
		} while (qtdVezes <= 10);
		System.out.println("Sa� do la�o e executei " + (qtdVezes-1) + " vezes");

		//For
		System.out.println("Comando FOR ");
		qtdVezes = 0;
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes + " � vez");
			qtdVezes = qtdVezes1;
		}
		System.out.println("Sa� do la�o e executei " + (qtdVezes) + " vezes");

	}
		
		

}
