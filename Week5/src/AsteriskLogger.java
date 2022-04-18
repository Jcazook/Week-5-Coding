
public class AsteriskLogger implements Logger{
	
	public static String multiplyAsterisk(String symbol, int num) {
		String result = "";
		
		for (int i = 0; i < num; i++) {
			result += symbol;
		}
		return result;
		
	}
	
	public void log(String log) {
		
		System.out.println("***" + log + "***");
		
	}

	
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
	String multiply = multiplyAsterisk("*", error.length() + 13);
	
	System.out.println(multiply);
	System.out.println("***Error: " + error + "***");
	System.out.println(multiply);
	}

	
}
