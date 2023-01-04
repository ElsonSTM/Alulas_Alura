package test;

import modelo.ContaCorrente;
import modelo.GuardadorDeReferencias;
import modelo.Conta;

public class TesteGuardadorReferencias {
	
public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(222, 111);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(333, 444);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuntidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
