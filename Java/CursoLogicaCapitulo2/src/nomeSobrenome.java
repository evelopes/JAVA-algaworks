import java.util.Scanner;

public class nomeSobrenome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Seu nome completo �: " + nome + " " + sobrenome );
		
		scanner.close();
	}

}
