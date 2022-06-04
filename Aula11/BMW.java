
public class BMW  extends Carro{
	
	//SUPER
	
	public BMW() {
		super(); // SUPER É A SUPERCLASSE, A CLASSE PAI, QUE SERIA O CARRO.
					  //THIS TO FALANDO DA PROPRIA BMW, A PROPRIA CLASSE
	}
	
	// SOBREESCRITA:
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("SOBRESCRITA");
		return velocidadeFinal / tempoFinal;
	}
	

}
