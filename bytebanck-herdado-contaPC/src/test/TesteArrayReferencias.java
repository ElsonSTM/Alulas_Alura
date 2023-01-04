package test;

import java.lang.ref.Reference;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] referencias = new Conta[5];
		
		System.out.println(referencias.length);
	
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		
		referencias[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(333, 444);
		
		referencias[1] = cp2;
	
		//System.out.println(cc2.getNumero());
	
		System.out.println(cc1.getNumero());
		
	}
}
