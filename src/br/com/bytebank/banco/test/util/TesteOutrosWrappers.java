package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer iRef = Integer.valueOf(29);
		System.out.println(iRef.intValue());
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number nRef = Float.valueOf(29.8f);
		
		List<Number> lista = new ArrayList<Number>();
		lista.add(iRef);
		lista.add(dRef);
		lista.add(nRef);

	}

}
