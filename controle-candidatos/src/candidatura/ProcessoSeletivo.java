package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		/*analisarCandidato(1900);
		analisarCandidato(2200);
		analisarCandidato(2000);
		
		selecaoCandidatos();
		
		
		imprimirSelecionados();
		*/
		
		String[] candidatos = {"Lázaro", "Laura", "Heliomar", "Angelina", "Angela"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}

	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}
			else{
				System.out.println("Contato realizado com sucesso!");
			};
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
		}
		else
			System.out.println("Não conseguimos contato com " + candidato + ". Número maximo de tentativas: " + tentativasRealizadas);
		
	}
	
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	
	static void imprimirSelecionados() {
		String[] candidatos = {"Lázaro", "Laura", "Heliomar", "Angelina", "Angela"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		/*for(int i = 0; i < candidatos.length; i ++) {
			System.out.println("O candidato de numero: " + (i+1) + " é " + candidatos[i]);v
		}
		*/
		for(String candidato: candidatos) {
			System.out.println("o Candidato selecionado foi: " + candidato);
			entrandoEmContato(candidato);
		}
			
	}
	
	
	static void selecaoCandidatos() {
		String[] candidatos = {"Lázaro", "Laura", "Heliomar", "Angelina", "Angela"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O Candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			else {
				System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
			}
			candidatoAtual++;
			
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
		
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para candidato");
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}
		else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
}

