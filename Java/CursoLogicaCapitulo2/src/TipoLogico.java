
public class TipoLogico {
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Vari?vel verdadeira: " +  variavelVerdadeira);
		Boolean variavelFalsa = false;
		System.out.println("Vari?vel Falsa: " + variavelFalsa);
		
		
		Integer idade = 24;
		Boolean podeTirarCarteira = idade >= 18;
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode ter habilita??o!");
		}
		
		else{
			System.out.println("N?o! Ele(a) n?o pode ter habilita??o!");
		}
		
		
		//System.out.println("Pode tirar a carteira? " + podeTirarCarteira);
		
		
		
	}
}
