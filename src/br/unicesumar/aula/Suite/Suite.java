package br.unicesumar.aula.Suite;

public class Suite {
	
	private int numero;
	private String tipo;
	private int capacidade;
	private double valorDiaria;
	
	public Suite() {
	}

	public Suite(int numero, String tipo, int capacidade, double valorDiaria) {
	
		this.numero = numero;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.valorDiaria = valorDiaria;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public String toString() {
		return "Suite Número: " 
	           + numero 
	           + "\nTipo: " 
	           + tipo 
	           + "\nCapacidade da suíte: " 
	           + capacidade 
	           + "\nValor da diaria: "
	           + String.format("R$ %.2f", valorDiaria)
			   + "\n--------------------------------";
	}
	
	
		
	
}
