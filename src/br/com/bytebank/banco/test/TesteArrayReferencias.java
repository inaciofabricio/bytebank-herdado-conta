package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] objects = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(33,3654);
		objects[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(33,5987);
		objects[1] = cc2;
		
		Cliente cliente = new Cliente();
		objects[2] = cliente;
		
		System.out.println("Agência: " + cc2.getAgencia());
		System.out.println("Conta: " + cc2.getNumero());
		System.out.println();
//		System.out.println("Agência: " + objects[1].getAgencia());
//		System.out.println("Conta: " + objects[1].getNumero());
//		System.out.println();
		
		ContaPoupanca ref = (ContaPoupanca) objects[1];
		System.out.println("Agência: " + ref.getAgencia());
		System.out.println("Conta: " + ref.getNumero());
		

	}

}
