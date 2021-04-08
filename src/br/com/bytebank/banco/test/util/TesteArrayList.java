package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List<Conta> lista = new LinkedList<Conta>();
//		List<Conta> lista = new ArrayList()<Conta>();
//		List<Conta> lista = new Vector()<Conta>();
		
		Conta cc1 = new ContaCorrente(22,11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(44,33);
		lista.add(cc2);
		
		System.out.println(lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(44,33);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(44,33);
		lista.add(cc4);
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		
		for(Conta c : lista) {
			System.out.println(c);
		}
		
		
		
	}

}
