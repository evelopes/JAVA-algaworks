import java.util.Scanner;

public class exercicioAtacado {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Double quantidadeProduto = scanner.nextDouble();
		
		Double desconto = 1.0;  // valor inteiro sem desconto
		if(quantidadeProduto >= 10) {
			desconto = 0.9 ; // 10% de desconto
			}
		Double valorUnidades = valorProduto * quantidadeProduto; // valor total das unidades

		
		Double valorTotal = valorUnidades * desconto; // valor total com desconto, se houver
		System.out.println(valorTotal);
		
	}
}
;
