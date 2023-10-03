package estruturas;

public class Matriz {

	public static void main(String[] args) {
		double[][] notasAlunos = new double[30][4];
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		System.out.println(notasAlunos[1][3]);
	}
	
}
