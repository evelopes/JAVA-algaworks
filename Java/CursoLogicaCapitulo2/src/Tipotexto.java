import java.util.Scanner;

public class Tipotexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String mensagemSaudacao = "Ol?, Mundo!";
		String nome = scanner.nextLine();
		
		
		System.out.println("Ol? " + nome + "!");
		
		scanner.close();
		
		Character variavelChar = 'A';
		System.out.println("Ol? " + nome + "!" + variavelChar);
		
		scanner.close();
		
	}

}
