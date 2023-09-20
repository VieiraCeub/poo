package basico;

public class Switch {
	 public static void main(String[] args) {
		 int idade = 4;
		 switch (idade) {
         case 0:
         case 1:
         case 2:
             System.out.println(idade+" é um bebê.");
             break;
         case 3:
         case 4:
         case 5:
             System.out.println(idade+" é uma criança pequena.");
             break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
             System.out.println(idade+" é uma criança maior.");
             break;
         case 11:
         case 12:
         case 13:
             System.out.println(idade+" é um pré-adolescente.");
             break;
         case 14:
         case 15:
         case 16:
         case 17:
             System.out.println(idade+" é um adolescente.");
             break;
         default:
             System.out.println(idade+" é maior de idade.");
             break;
     }
   }
}
