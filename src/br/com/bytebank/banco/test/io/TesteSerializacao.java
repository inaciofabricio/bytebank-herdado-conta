package br.com.bytebank.banco.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("José Silva");
		cliente.setProfissao("Dev");
		cliente.setCpf("12345678999");
		
		ContaCorrente cc = new ContaCorrente(22,33);
		cc.setTitular(cliente);
		cc.deposita(125.78);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}
