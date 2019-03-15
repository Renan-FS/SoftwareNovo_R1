package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class Teste2 {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(238, 9182, Calendar.getInstance(), 300, TipoConta.PREMIUM);
		ContaPoupanca cp = new ContaPoupanca(238, 17326, new GregorianCalendar(2010, Calendar.NOVEMBER, 22), 2000, 2);
		
		System.out.println(cc.getAgencia()+ "," + cc.getNumero());
		
		List<ContaCorrente> listaaa = new ArrayList();
		
		listaaa.add(new ContaCorrente(238, 21992, new GregorianCalendar(2016, Calendar.JANUARY, 13), 278, TipoConta.ESPECIAL));
		listaaa.add(new ContaCorrente(2887, 23996, new GregorianCalendar(2016, 8, 15), 1400, TipoConta.COMUM));
		listaaa.add(new ContaCorrente(239, 22344, new GregorianCalendar(2017, 4, 16), 130, TipoConta.PREMIUM));
		
		
		for(ContaCorrente conta : listaaa)
			System.out.println(conta.getSaldo());
		
		
		
	}

}
