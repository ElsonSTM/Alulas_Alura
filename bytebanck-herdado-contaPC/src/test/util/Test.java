package test.util;

import java.util.ArrayList;

import modelo.Conta;
import modelo.ContaCorrente;


public class Test {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(222, 111);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(333, 444);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(55, 666);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(77, 05);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
	}
}
