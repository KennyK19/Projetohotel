package br.unicesumar.aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.unicesumar.aula.Hospede.Hospede;
import br.unicesumar.aula.Reserva.Reserva;
import br.unicesumar.aula.Suite.Suite;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Reserva reserva = new Reserva();
		
		List<Hospede> hospede = new ArrayList<>();
		Suite suite = new Suite();
		
		System.out.println("|----------CADASTRO DE SUÍTE----------|");
		
		System.out.println("Informe o numero da suíte:");
		suite.setNumero(sc.nextInt());
		sc.nextLine();
		System.out.println("Informe o tipo da suíte:");
		suite.setTipo(sc.nextLine());
		System.out.println("Informe a capacidade:");
		suite.setCapacidade(sc.nextInt());
		sc.nextLine();
		System.out.println("Informe o valor da diaria:");
		suite.setValorDiaria(sc.nextDouble());
		
		System.out.println("|----------CADASTRO DA RESERVA----------|");
		
		System.out.println("Informe a quantidade de dias:");
		reserva.setQuantidadeDias(sc.nextInt());
		do {
			System.out.println("Informe a quantidade de pessoas:");
			reserva.setQuantidadePessoas(sc.nextInt());
			
		}while(!reserva.verificarCapacidade(reserva.getQuantidadePessoas(), suite.getCapacidade()));
		reserva.setSuite(suite);
		
		System.out.println("|----------CADASTRO DO HÓSPEDE----------|");
		
		int contador = 0;
		int contadorcdg = 0;
		do{
			   contadorcdg++;
			   Hospede hpd = new Hospede();
			   hpd.setCodigo(contadorcdg);
			   System.out.println("Codigo do hospede: " + hpd.getCodigo());
			   sc.nextLine();
			   
			   System.out.println("Nome: ");
			   hpd.setNome(sc.nextLine());
			   
			   System.out.println("Idade: ");
			   hpd.setIdade(sc.nextInt());
			   sc.nextLine();
			   
			   System.out.println("Endereço: ");
			   hpd.setEndereco(sc.nextLine());
			   System.out.println("------------------------------");
			   System.out.println("Aperte enter para continuar!");
			   System.out.println("------------------------------");
			   hospede.add(hpd);
			   
			   if (hpd.getIdade() > 2) {
				   contador++;
			   }
			}while (contador < suite.getCapacidade());
		
		System.out.println("");
		System.out.println("Informações da Reserva");
		System.out.println("");
	    for (Hospede hospedes: hospede) {
	    	System.out.println(hospedes);
	    }
	    System.out.println("");
	    System.out.println("Informações da Suíte");
	    System.out.println("");
	    System.out.println(suite.toString());
	    
	    double total = reserva.calcularDiaria(suite.getValorDiaria(), reserva.getQuantidadeDias());
	    System.out.printf("Valor da diaria: R$ %.2f", suite.getValorDiaria());
	    System.out.println("");
	    if (reserva.getQuantidadeDias() > 7) {
	    	double totalSD = suite.getValorDiaria() * reserva.getQuantidadeDias();
	    	System.out.printf("Valor total da reserva sem desconto: R$ %.2f\n", totalSD);
	    }
	    System.out.printf("Valor total da reserva: R$ %.2f",total);
		
		
		sc.close();
	}

}
