package Aula140;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// Bloco finally executa ação independentemente de a exceção ter sido
		// tratada
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Block finally excecuted!");
		}
	}

}
