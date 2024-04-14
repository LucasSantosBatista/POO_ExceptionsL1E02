/**
 * 
 */
package view;

import model.Conta;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Main {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1234, 5678, 1000, 500);
		System.out.println("Saldo inicial: " + conta1.getSaldo());
		try {
			conta1.saca(800);
			System.out.println("Saque de 800 realizado com sucesso.");
		} catch (Exception e) {
			System.out.println("Erro ao sacar: " + e.getMessage());
		}

		System.out.println("Saldo final: " + conta1.getSaldo());

		System.out.println();

		Conta conta2 = new Conta(1234, 5678, 1000, 500);
		System.out.println("Saldo inicial: " + conta2.getSaldo());
		try {
			conta2.saca(1600);
			System.out.println("Saque de 1600 realizado com sucesso.");
		} catch (Exception e) {
			System.out.println("Erro ao sacar: " + e.getMessage());
		}
		System.out.println("Saldo final: " + conta2.getSaldo());

	}
}