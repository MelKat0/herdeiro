package aula8herança;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		
		System.out.println("==================================");
		
		Veiculo veiculo = new Veiculo("Renault", "Fluence", 2007, "Branco");
		System.out.println("VEICULO:");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());

		System.out.println("==================================");
		
		Automovel automovel = new Automovel("Renault", "Fluence", 2007, "Preto",4,"2.0 flex");
		System.out.println("AUTOMOVEL:");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Numero de portas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		System.out.println("==================================");
		
		Moto moto = new Moto("Piaggio", "Vespa", 2000, "Azul",155);
		System.out.println("MOTO:");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindrada: " + moto.getCilindrada());
		
		System.out.println("==================================");
	}

}
