
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
		
		logger.log("Hello");
		logger.error("CRITICAL ERROR");
		
		spaced.log("Goodbye");
		spaced.error("Syntax Error, insert ;");
		
		
	}

}
