package excessoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Try {
	public static void main(String[] args) {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
		    System.out.println("Arquivo não encontrado: " + e.getMessage());
		} finally {
		    if (arquivo != null) {
		    	try {
		    		arquivo.close();
		    	} catch (IOException e) {
				    System.out.println(e.getMessage());		    		
		    	}
		    }
		}
	}
}
