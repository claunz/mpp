package week3.day6;
import javax.swing.*;

class AgeInputVerification6 {
	private static final String DEFAULT_MESSAGE = "Your age:";

	public AgeInputVerification6() {
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
		AgeInputVerification6 ag = new AgeInputVerification6();
		int age = ag.getAge("Please type in your age");
	}
}
