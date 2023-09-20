package basico;

public class Funcao {
	 public static boolean ehMaiorDeIdade(int idade) {
		 if (idade >= 18) {
			 System.out.print(idade +" é maior de idade \n");
			 return true;
		 }
		 System.out.print(idade +" é menor de idade \n");
		 return false;
	 }
	 public static void main(String[] args) {
		 int idade = 17;
		 ehMaiorDeIdade(idade);
		 idade = 22;
		 ehMaiorDeIdade(idade);		
		 idade = 33;
		 ehMaiorDeIdade(idade);		
		 idade = 4;
		 ehMaiorDeIdade(idade);		
	 }
}
