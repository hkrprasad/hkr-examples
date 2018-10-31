package examples;

import java.util.Vector;

/* StripBlanks.java - This program strips blanks from a string
 * 
 */
public class StripBlanks {
	Vector<String> reversedStrings;
	
	public static void testValueString(StringBuffer strBuf) {
		
		strBuf.append("TestString");
		
		return;
	}

	public static void testValueString(String argStr) {
		
		argStr = "TestString";
		
		return;
	}
	public String removeBlanks(String argString) {
		
		StringBuffer resultStrBuf = new StringBuffer();
		StringBuffer wordBuf = new StringBuffer();
		if (argString != null) {	
			for (int iLoop = 0; iLoop < argString.length(); iLoop++) {
				char testChar = argString.charAt(iLoop);
				
				if ((testChar != ' ') && ( testChar != '\t')) {
					wordBuf.insert(0, testChar);
				} else {
					if (wordBuf.length() != 0 ) {
						resultStrBuf.append(wordBuf + " ");
						wordBuf.delete(0,wordBuf.length());
					}	
				}
			}
			if (wordBuf.length() != 0) resultStrBuf.append(wordBuf);
		}
		argString = resultStrBuf.toString().trim();
		
		return argString;
	}
	
	public void getReversedStrings(MyFileReader mfr) {
		
		reversedStrings = new Vector<String>();
		
		Vector<String> origStrings = mfr.getLinesInFile();
		for (int iLoop =0; iLoop < origStrings.size(); iLoop++) {
			reversedStrings.add(removeBlanks(origStrings.get(iLoop)));
			
		}
	}
	
	public void printReversedStrings() {
		if (null != reversedStrings) {
			for (int iLoop = 0; iLoop < reversedStrings.size() ; iLoop++) {
				System.out.println(reversedStrings.get(iLoop));
				
			}
			
		}
	
	}
	
	
}
