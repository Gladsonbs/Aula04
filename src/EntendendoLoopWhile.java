import java.util.Scanner;

public class EntendendoLoopWhile {

	public static void main(String[] args) {

		int idade;
		double media = 0;
		int quantidadeAlunos = 0;
		Scanner leitor = new Scanner(System.in);

		while (quantidadeAlunos < 5) {
			System.out.println("Informe a idade do " + (quantidadeAlunos + 1) + "� aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos += 1;
			//quantidadeAlunos++;
		}

		System.out.println("A m�dia das idades �: " + media);
		
		leitor.close();

	}

}
