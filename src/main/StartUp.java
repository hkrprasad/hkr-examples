package main;

import examples.StripBlanks;

class StartUp{

	
	public static void main(String[] args) {
	
		String testString = "    Time to    get   going   along";
		
		StripBlanks strpBlanks = new StripBlanks(testString);
		System.out.println("The output string is : " +strpBlanks.removeBlanks()+ "::");
		
    
	}

}
