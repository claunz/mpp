package week4.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		
		File f = new File("C:\\word_test.txt");
		Scanner s = null;
		// Scanner s = new Scanner(new File("word_test.txt"));
		String word = null;
		try {
			s = new Scanner(f);
			while ((word = s.next()) != null) {
				System.out.println(word);
			}
		} catch (FileNotFoundException e) {
			// No more tokens available
			System.out.println("There is no such file " + e.getMessage());
		} finally {
			s.close();
		}

	}

}
