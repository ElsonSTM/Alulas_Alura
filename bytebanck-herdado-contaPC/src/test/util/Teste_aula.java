package test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste_aula {
	
	public static void main(String[] args) {
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		int valor = idadeRef.intValue();//unboxing
		
		System.out.println(idadeRef.doubleValue());
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
				
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing -> transforma��o de primitivo em objeto e vice-versa.
	}

}
