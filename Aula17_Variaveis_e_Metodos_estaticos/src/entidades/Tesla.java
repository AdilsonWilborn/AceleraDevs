package entidades;
import Carro;

public class Tesla extends Carro {
		private boolean dirigeSozinho;
		
		@Override
		public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
			System.out.println("TESLA SOBRESCRITA ");
			return velocidadeFinal * tempoFinal;
		}
		
		public boolean isDirigeSozinho() {
			return dirigeSozinho;
		}
		public void setDirigeSozinho(boolean dirigeSozinho) {
			this.dirigeSozinho = dirigeSozinho;
		}
		
		@Override
		public void piscarAlerta() {
			System.out.println("Tesla piscando alerta....");
		}
}
