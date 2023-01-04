package test;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(222, 111);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(333, 444);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuntidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
