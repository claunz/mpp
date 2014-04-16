package week3.day6;
import javax.swing.*;

class AgeInputVerification4 {
	private static final String DEFAULT_MESSAGE = "Your age:";

	public AgeInputVerification4() {
	}

	public int getAge() {
		return getAge(DEFAULT_MESSAGE);
	}

	public int getAge(String prompt) {
		String inputStr;
		int age;
//		while (true) {
			inputStr = JOptionPane.showInputDialog(null, prompt);
			try {
				age = Integer.parseInt(inputStr); // wrong input will take to
									// catch
				return age; // correct input, we get out
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "'" + inputStr
					+ "' is invalid\n" + "Please enter digits only");
				
				throw new NumberFormatException(inputStr);
				// System.out.println(e.getMessage());
				// e.printStackTrace();
			}

			finally {
				// this part is always executed whether there is
				// an exception or not
			}
//		}
	}

	public static void main(String[] args) {
		AgeInputVerification4 ag = new AgeInputVerification4();
		int age = 0;
		try {
			 age = ag.getAge("Please type in your age");
		} catch (Exception e) {
			try {
			 age = ag.getAge("Please type in your age");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null,"You are at the  wrong age of " +e2.getMessage()+" years!");
			}
			
		}
		
		
	}
}
