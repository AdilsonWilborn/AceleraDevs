
public class BMW  extends Carro{
	
	// SOBREESCRITA:
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("SOBRESCRITA");
		return velocidadeFinal / tempoFinal;
	}
	

}
