package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class CountWords {
	HashMap<String, Integer> wordMap;
	
	public CountWords() {
		wordMap = new HashMap<String, Integer>();
	}
	
	private void addToMap(String argStr) {
		Integer wordCount = wordMap.get(argStr.toString());
		if (wordCount == null ) wordCount = new Integer(0);
		wordCount++;
		wordMap.put(argStr.toString(), wordCount);
		
	}
	
	private void readAndCount(Vector<String> linesRead) {
		
		Iterator<String> itr = linesRead.iterator();
		while (itr.hasNext()) {
			
			String oneLine = itr.next();
			char oneChar;
			StringBuffer wordHolder = new StringBuffer();
			for (int iLoop = 0; iLoop < oneLine.length(); iLoop++) {
				oneChar = oneLine.charAt(iLoop);
				//if (((oneChar >= 65) && (oneChar <=90 )) ||
				//		((oneChar >= 97) && (oneChar <=122))){
				if (((oneChar >= 'a') && (oneChar <= 'z' )) ||
							((oneChar >= 'A') && (oneChar <= 'Z'))){
					wordHolder.append(oneChar);
				} else {
					
					if (wordHolder.length() != 0 ) {
						addToMap(wordHolder.toString().toLowerCase());
						wordHolder.delete(0,wordHolder.length());
					}
						
				}
			}
			if (wordHolder.length() != 0 ) {
				addToMap(wordHolder.toString().toLowerCase());
				wordHolder.delete(0,wordHolder.length());
			}
			
		}
		
		
	}
	
	
	public void countWords(MyFileReader mfr) {
		
		readAndCount(mfr.getLinesInFile());
		
		Set<String> wordSet = wordMap.keySet();
		
		Iterator<String> setItr = wordSet.iterator();
		
		while (setItr.hasNext()) {
			String oneWord = setItr.next();
			System.out.println("Word : " + oneWord+ "; Count is " + wordMap.get(oneWord));
		}
		return;
	}
	
	
	
	
}
