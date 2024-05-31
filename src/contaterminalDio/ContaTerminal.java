package contaterminalDio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int numero;
		String agencia, nome;
		double saldo;
		
		System.out.println("Olá! Seja Bem Vindo(a) ao nosso Banco! ");
		System.out.println("Informe seu nome completo: ");
		nome = sc.nextLine();
		
		System.out.println("Informe o número da sua Agência: ");
		agencia = sc.next();
		
		System.out.println("Informe o número da sua Conta: ");
		numero = sc.nextInt();
		
		System.out.println("Informe o seu saldo inicial para abrir a sua conta: ");
		saldo = sc.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
