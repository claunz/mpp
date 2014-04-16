
public class FinallyTest {
	
	public static void test(boolean throwIt) throws Exception{
		try {
			//return;
			//System.exit(0);
			//if (throwIt) throw new Exception("first");			
			
		} catch (Exception x) {
			System.out.println(x.getMessage());
			throw new Exception("second");
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("last statment");
		
	}

	public static void main(String[] args) {
		try {
			test(true);
		} catch (Exception x) {
			System.out.println(x.getMessage());
		}
		
	}

}
