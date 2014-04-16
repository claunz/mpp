package week3.day6;
import javax.swing.*;

class AgeInputVerification3 {
	private static final String DEFAULT_MESSAGE = "Your age:";

	public AgeInputVerification3() {
	}

	public int getAge() {
		return getAge(DEFAULT_MESSAGE);
	}

	public int getAge(String prompt) {
		String inputStr;
		int age;
		int i = 0;
		while (i < 3) {
			inputStr = JOptionPane.showInputDialog(null, prompt);
			try {
				age = Integer.parseInt(inputStr); // wrong input will take to
									// catch
				return age; // correct input, we get out
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "'" + inputStr
					+ "' is invalid\n" + "Please enter digits only");

				i++;
				// System.out.println(e.getMessage());
				// e.printStackTrace();
			}

			finally {
				// this part is always executed whether there is
				// an exception or not
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		AgeInputVerification3 ag = new AgeInputVerification3();
		int age = ag.getAge("Please type in your age");
	}
}
