package basico;

public class If {
	 public static void main(String[] args) {
		 int idade = 17;
		 int maioridade = 18;
		 if (idade >= maioridade) {
			 System.out.print(idade +" é maior de idade \n");
		 } else {
			 System.out.print(idade +" é menor de idade \n");
		 }
		 idade = 22;
		 if (idade >= maioridade) {
			 System.out.print(idade +" é maior de idade \n");
		 } else {
			 System.out.print(idade +" é menor de idade \n");
		 }		 
	 }
}
