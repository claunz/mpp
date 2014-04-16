package week4.day2;

import java.io.*;

public class FileWriter {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		String socialSecNum;
		String firstName;
		String lastName;
		int age;
		// Scanner scannedInfo;
		PrintWriter output = null;
		double monthlySalary;
		// scannedInfo = new Scanner(new File("myfile.dat"));
		File f = new File("C:\\myfile.out");
//		output = new PrintWriter(new FileWriter("C:\\myfile.out"));
		output = new PrintWriter(f);

		// socialSecNum = scannedInfo.next();
		// firstName = scannedInfo.next();
		// lastName = scannedInfo.next();
		// age = scannedInfo.nextInt();
		// monthlySalary = scannedInfo.nextDouble();
		socialSecNum = "123456786";
		firstName = "Rakesh";
		lastName = "Shrestha";
		age = 26;
		monthlySalary = 2000;

		output.println(socialSecNum);
		output.println(firstName);
		output.println(lastName);
		output.println(age);
		output.println(monthlySalary);

		// scannedInfo.close();
		output.close();

	}

}
