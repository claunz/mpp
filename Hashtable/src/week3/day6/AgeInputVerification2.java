package week3.day6;
import javax.swing.*;

class AgeInputVerification2 {
	private static final String DEFAULT_MESSAGE = "Your age:";

	public AgeInputVerification2() {
	}

	public int getAge() {
		return getAge(DEFAULT_MESSAGE);
	}

	public int getAge(String prompt) {
		String inputStr;
		int age;
		while (true) {
			inputStr = JOptionPane.showInputDialog(null, prompt);
			try {
				age = Integer.parseInt(inputStr); // wrong input will take to
									// catch
				JOptionPane.showMessageDialog(null,"You are at the right age of " + age +  " years!");
				return age; // correct input, we get out
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "'" + inputStr
					+ "' is invalid\n" + "Please enter digits only");

				// System.out.println(e.getMessage());
				// e.printStackTrace();
			}

			finally {
				// this part is always executed whether there is
				// an exception or not
			}
		}
	}

	public static void main(String[] args) {
		AgeInputVerification2 ag = new AgeInputVerification2();
		int age = ag.getAge("Please type in your age");
	}
}
