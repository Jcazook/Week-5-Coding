
public class SpacedLogger implements Logger{

	
	
	public String space(String nrm) {
		StringBuilder spacer = new StringBuilder(nrm);
		for (int i=1; i<spacer.length(); i+=2)
		    spacer.insert(i, ' ');
		//System.out.println(sb.toString());
		return spacer.toString();
	    }

	
	public void log(String log) {
		// TODO Auto-generated method stub
		String spaced = space(log);
		System.out.println("***" + spaced + "***");
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		String spacedError = space(error);
		System.out.println("***Error: " + spacedError + "***");
	}
	
}
