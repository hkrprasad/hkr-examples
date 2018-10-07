package examples;

/* StripBlanks.java - This program strips blanks from a string
 * 
 */
public class StripBlanks {
	String baseString;
	
	public StripBlanks(String argString) {
		baseString = argString;
	}
	
	public String getBaseString() {
		return baseString;
	}
	
	public String removeBlanks() {
		
		StringBuffer resultStrBuf = new StringBuffer();
		StringBuffer wordBuf = new StringBuffer();
		if (baseString != null) {	
			for (int iLoop = 0; iLoop < baseString.length(); iLoop++) {
				char testChar = baseString.charAt(iLoop);
				
				if (testChar != ' ') {
					wordBuf.insert(0, testChar);
				} else {
					if (wordBuf.length() != 0 ) {
						resultStrBuf.append(wordBuf + " ");
						wordBuf.delete(0,wordBuf.length());
					}	
				}
			}
		}
		baseString = resultStrBuf.toString().trim();
		
		return baseString;
	}
}
