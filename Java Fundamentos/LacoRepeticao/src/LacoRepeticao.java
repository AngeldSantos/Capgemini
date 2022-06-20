
public class LacoRepeticao {

	public static void main(String[] args) {
		// comando WHILE - testa a condição, até que não seja satisfeita a condição
		
		int qtdVezes = 1;
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++; // ++ = qtdvezes + 1
		}
		System.out.println("Saí do laço e executei " + (qtdVezes-1) + " vezes");
	
		//Do while - laço po=ós-testado
		qtdVezes = 11;
		do {
			System.out.println("Estou fazendo a " + qtdVezes + " ª vez");
			qtdVezes++;
		} while (qtdVezes <= 10);
		System.out.println("Saí do laço e executei " + (qtdVezes-1) + " vezes");

		//For
		System.out.println("Comando FOR ");
		qtdVezes = 0;
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes + " ª vez");
			qtdVezes = qtdVezes1;
		}
		System.out.println("Saí do laço e executei " + (qtdVezes) + " vezes");

	}
		
		

}
