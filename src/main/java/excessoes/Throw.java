package excessoes;

import java.util.Scanner;

public class Throw {
	public static final String SENHASECRETA = "123456";
	public static void main(String[] args) throws Exception {
			Scanner s = new Scanner(System.in);
	  		System.out.print("Digite a senha: ");
	  		String senha = s.nextLine();
	  		if(!senha.equals(SENHASECRETA)) {
	  			throw new Exception("Senha invalida!!!");
	  		}
	  		System.out.println("Senha correta!!!\nBem vindo(a)!!!");
	  }
}
