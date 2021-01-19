package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		
		Conta contaDaAna = new Conta();
		Conta contaDoJoao = new Conta();
		
		contaDaAna.titular = "Ana Gomes";
		contaDaAna.numero = "111-98";
		contaDaAna.tipo = "Corrente";
		contaDaAna.ativa = true;
		contaDaAna.chequeEspecial = 200;
		contaDaAna.depositar(100);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depositar(30);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(500);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(80);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depositar(100);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.getSaldo();
		
		double saldoDaConta = contaDaAna.getSaldo();
		
		System.out.println("**** O saldo da conta � " + saldoDaConta);
		
		
	}
	

}
