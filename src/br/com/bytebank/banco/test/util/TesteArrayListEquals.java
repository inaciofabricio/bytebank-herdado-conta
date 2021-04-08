package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22,11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(44,87);
		lista.add(cc2);
		
		System.out.println(lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(44,33);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(44,58);
		lista.add(cc4);
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		
		Conta cc5 = new ContaCorrente(44,58);
		boolean existe = lista.contains(cc5);
		System.out.println("Já existe: " + existe);
		
		for (Conta conta : lista) {
			if(!conta.equals(cc4)) {
				System.out.println("Já tenho essa conta!");
			}
		}
		
		for(Conta c : lista) {
			System.out.println(c);
		}
		
		
		
	}

}
