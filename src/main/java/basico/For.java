package basico;

public class For {
	 public static boolean ehMaiorDeIdade(int idade) {
		 if (idade >= 18) {
			 System.out.print(idade +" é maior de idade \n");
			 return true;
		 }
		 System.out.print(idade +" é menor de idade \n");
		 return false;
	 }
	 
    public static void main(String[] args) {        
        for (int idade = 0 ; !ehMaiorDeIdade(idade) ; idade++ ) {
        	
        }
        System.out.println("Você é maior de idade. Pode prosseguir.");
    }
}
