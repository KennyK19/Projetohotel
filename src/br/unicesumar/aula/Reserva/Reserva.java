package br.unicesumar.aula.Reserva;

import java.util.ArrayList;
import java.util.List;

import br.unicesumar.aula.Hospede.Hospede;
import br.unicesumar.aula.Suite.Suite;

public class Reserva {
	
    private List<Hospede> hospedes = new ArrayList<>();
	private Suite suite;
	private int quantidadePessoas;
	private int quantidadeDias;
			
	public Reserva() {
	}

	public Reserva(Suite suite, int quantidadePessoas, int quantidadeDias) {
		this.suite = suite;
		this.quantidadePessoas = quantidadePessoas;
		this.quantidadeDias = quantidadeDias;
	}

	
	public Suite getSuite() {
		return suite;
	}

	
	public void setSuite(Suite suite) {
		this.suite = suite;
	}


	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}


	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}


	public int getQuantidadeDias() {
		return quantidadeDias;
	}


	public void setQuantidadeDias(int quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
	}


	public boolean verificarCapacidade(int quantidadePessoas, int capacidade) {
		if (quantidadePessoas <= capacidade) {
			System.out.println("Reserva finalizada com sucesso!");
			System.out.println("");	
			return true;
		} else {
			System.out.println("Numero maior que permitido.");
			return false;
		}
		
	}
	
	public double calcularDiaria(double valorDiaria, int quantidadeDias) {
		double total = valorDiaria * quantidadeDias;
		if (quantidadeDias > 7) {
			System.out.println("Desconto de 10% Aplicado");
			
			 total = total - ((total * 10) / 100);
		}
		return total;
	}
	
	
	
	

}
