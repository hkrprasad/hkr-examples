package main;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import examples.BalancedStr;
import examples.SmallestDivisible;
import examples.DiningPhilosophers;

public class StartUp {
	
    
    public static void main (String[] args) {
    	
/*    	String exprs[] = { "<<>><<>>>>>>", "<><>><>", "<<>><","<>><<>><"};
    	int maxReps[] = { 8,1,1,8};
    	
    	BalancedStr balStr = new BalancedStr();
    	
    	int[] retArr = balStr.balanceAndCheck(exprs, maxReps);
    	 for (int res_i = 0; res_i < retArr.length; res_i++) {
             System.out.println("Input Str is " + exprs[res_i] + " Result: " + String.valueOf(retArr[res_i]));
    	 }
    	 
    	 SmallestDivisible smallDiv = new SmallestDivisible();
    	 smallDiv.getSmallestDivisible(10);*/

		DiningPhilosophers.StartEating(6);
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
/*    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] res;
        
        int _expressions_size = 0;
        _expressions_size = Integer.parseInt(in.nextLine().trim());
        String[] _expressions = new String[_expressions_size];
        String _expressions_item;
        for (int _expressions_i = 0; _expressions_i < _expressions_size; _expressions_i++) {
            try {
                _expressions_item = in.nextLine();
            } catch (Exception e) {
                _expressions_item = null;
            }
            _expressions[_expressions_i] = _expressions_item;
        }
        
        int _maxReplacements_size = 0;
        _maxReplacements_size = Integer.parseInt(in.nextLine().trim());
        int[] _maxReplacements = new int[_maxReplacements_size];
        int _maxReplacements_item;
        for (int _maxReplacements_i = 0; _maxReplacements_i < _maxReplacements_size; _maxReplacements_i++) {
            _maxReplacements_item = Integer.parseInt(in.nextLine().trim());
            _maxReplacements[_maxReplacements_i] = _maxReplacements_item;
        }
        
        res = balancedOrNot(_expressions, _maxReplacements);
        for (int res_i = 0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }
    } */
}


/*package main;

import java.io.File;

import examples.CountWords;
import examples.MyFileReader;
import examples.StripBlanks;
import examples.MyClass;

class StartUp{

	public static String getAbsolutePath(String argFileName) {
		return System.getProperty("user.dir") +File.separator + "src" + File.separator + "resources" + File.separator + argFileName;
	}
	
	public static void main(String[] args) {
			
		MyFileReader mfr = new MyFileReader(StartUp.getAbsolutePath("StripBlanks.txt"));
		StripBlanks strpBlanks = new StripBlanks();
		strpBlanks.getReversedStrings(mfr);
		strpBlanks.printReversedStrings();
		
		StringBuffer strBuf = new StringBuffer("asdfasdfasdf");
		StripBlanks.testValueString(strBuf);
		System.out.println("The String is " + strBuf.toString());
		String testStr = "sasfasdf";
		StripBlanks.testValueString(testStr);
		System.out.println("The string is " +testStr );
		
		CountWords cntWrds = new CountWords();
		cntWrds.countWords(mfr);
		

		new MyClass<Integer>();
		MyClass<Integer> myObject = new MyClass<>("");
		MyClass<Integer> myObject1 = new <String>MyClass<>();
		MyClass<Integer> myObject2 = new <>MyClass("");
		new MyClass<Integer>("");
  
		
		
		
    
	}

}
*/