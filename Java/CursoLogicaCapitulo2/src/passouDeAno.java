import java.util.Scanner;

public class passouDeAno {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
				
		System.out.println("Qual a nota final do aluno? ");		
		Double nota = scanner.nextDouble();
		
		Boolean passar = nota >= 7.0;
		
		if(passar) {
			System.out.println("Aluno passou de ano");
		}
		else {
			System.out.println("Aluno repetiu de ano");
		}
		
		
		scanner.close();
		
	}

}
