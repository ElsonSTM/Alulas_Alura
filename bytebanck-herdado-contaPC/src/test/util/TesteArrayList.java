package test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import modelo.Conta;
import modelo.ContaCorrente;




public class TesteArrayList {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
//	}

        //Generics
		
		List<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);
        
        System.out.println("Tamanho: " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        System.out.println("Já existe? " + existe);
        
        for (int i = 0; i < lista.size(); i++) {
        	Object oRef = lista.get(i);
        	System.out.println(oRef);	
		}
        
        System.out.println("-------------------------");

        for(Conta conta : lista) {
                System.out.println(conta);
        }
    }
}
