package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		/**
		 * Polimorfismo significa "muitas formas". É recurso que permite que variáveis de um mesmo tipo
		 * mais genérico possam apontar para objetos de tipos específicos diferentes, tendo assim
		 * comportamentos diferentes conforme cada tipo específico.
		 * 
		 * Foi chamado duas variáveis do mesmo tipo, porém as duas tiveram reações diferentes
		 * pois apontam para um endereço diferente (Account e SavingsAccount)
		 */
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
