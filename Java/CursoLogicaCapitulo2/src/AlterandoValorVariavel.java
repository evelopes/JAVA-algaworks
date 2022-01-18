import java.util.Scanner;

public class AlterandoValorVariavel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite forma de pagamento [1 = � vista / 2 = a prazo]:");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
			Double juros = 0.0;
			if(!pagamentoAVista) {
				juros = 10.0;				
			}

			System.out.println("Valor do juros: R$" + juros);
			Double acrescimo = valorProduto * juros / 100 ;
			System.out.println("Valor do acrescimo: R$" + acrescimo);
			Double valorTotal = acrescimo + valorProduto;
			System.out.println("Valor total: R$" + valorTotal);
		
		scanner.close();
	}
}
