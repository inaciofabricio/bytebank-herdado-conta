package br.com.bytebank.banco.test;

import java.util.Iterator;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

		int[] idades = new int[5];
		
		/*
		idades[0] = 29;
		idades[1] = 31;
		idades[2] = 45;
		idades[3] = 65;
		idades[4] = 79;
		
		int idade = idades[0];
		
		System.out.println(idade);
		
		System.out.println(idades.length);
		*/
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;		
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);			
		}
		
	}
}
