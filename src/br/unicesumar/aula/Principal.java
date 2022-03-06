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
		
		List<Hospede> hospedes = new ArrayList<>();
		Suite suite = new Suite();
		int menor2anos; //instanciado somente para uso no cadastro da reserva
		
		//cadastro das informações da suite
		
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
		
		//cadastro das informações da suite
		
		System.out.println("|----------CADASTRO DA RESERVA----------|");
		
		System.out.println("Informe a quantidade de dias:");
		reserva.setQuantidadeDias(sc.nextInt());
		do {
			//verifica quantidade de pessoas com capacidade de suite
			System.out.println("Informe a quantidade de pessoas:");
			reserva.setQuantidadePessoas(sc.nextInt());
			
			//verifica quantidade de pessoas com menos de 2 anos
			System.out.println("Quantas pessoas são menores que 2 anos ?");
			menor2anos = sc.nextInt();
			
		}while(!reserva.verificarCapacidade(reserva.getQuantidadePessoas(), suite.getCapacidade(), menor2anos));
		
		//adiciona a suite para a reserva do cliente
		reserva.setSuite(suite);
		
		System.out.println("|----------CADASTRO DO HÓSPEDE----------|");
		
		int contadorAcima2Anos = 0;
		int contadorCodigo = 0;
		do{
			   contadorCodigo++;
			   Hospede hospede = new Hospede();
			   hospede.setCodigo(contadorCodigo);
			   System.out.println("Codigo do hospede: " + hospede.getCodigo());
			   sc.nextLine();
			   
			   System.out.println("Nome: ");
			   hospede.setNome(sc.nextLine());
			   
			   System.out.println("Idade: ");
			   hospede.setIdade(sc.nextInt());
			   sc.nextLine();
			   
			   System.out.println("Endereço: ");
			   hospede.setEndereco(sc.nextLine());
			   System.out.println("------------------------------");
			   System.out.println("Aperte enter para continuar!");
			   System.out.println("------------------------------");
			   hospedes.add(hospede);
			   
			   contadorAcima2Anos++;
		
	 	    } while (contadorAcima2Anos < reserva.getQuantidadePessoas());

		
		System.out.println("");
		System.out.println("Informações da Reserva");
		System.out.println("");
		
	    for (Hospede hospede: hospedes) {
	    	System.out.println(hospede);
	    }
	    System.out.println("");
	    System.out.println("Informações da Suíte");
	    System.out.println("");
	    System.out.println(suite.toString());
	    
	    double total = reserva.calcularDiaria(suite.getValorDiaria(), reserva.getQuantidadeDias());
	    System.out.printf("Valor da diaria: R$ %.2f", suite.getValorDiaria());
	    System.out.println("");
	    if (reserva.getQuantidadeDias() > 7) {
	    	double totalsaldo = suite.getValorDiaria() * reserva.getQuantidadeDias();
	    	System.out.printf("Valor total da reserva sem desconto: R$ %.2f\n", totalsaldo);
	    }
	    System.out.printf("Valor total da reserva: R$ %.2f",total);
	    
			
		sc.close();
	}

}
