import java.util.Scanner;

	public class testeDobro {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Digite o valor a dobrar: ");
		Double valor = scanner.nextDouble();
					
		Double valorQuadrado = valor * valor;	
		System.out.println(valorQuadrado);
				
		scanner.close();
		
		
				
	}
}
