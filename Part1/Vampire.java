package Assignment6;

import java.util.ArrayList;

public class Vampire {

	public boolean checkVampire(String numStr) {
		Permutations permutations = new Permutations();
		ArrayList<String> allPermutations = new ArrayList<String>();
		allPermutations.addAll(permutations.findAllPermutations(numStr));
		for(String s:allPermutations) {
			String mStr = s.substring(0,numStr.length()/2);
			long m = Long.parseLong(mStr);
			String nStr = s.substring(numStr.length()/2);
			long n = Long.parseLong(nStr);
			if(mStr.charAt(mStr.length()-1) == '0' && nStr.charAt(nStr.length()-1) == '0')
				return false;
			if(m*n == Integer.parseInt(numStr))
				return true;
		}
		return false;
	}
	
	public void printVampires() {
		long number = 1260;
		int countVampires = 0;
		//String numStr = String.valueOf(number);
		System.out.println("First 100 Vampire Numbers are........");
		while(countVampires != 100) {
			if(String.valueOf(number).length()%2 == 0) {
				if(checkVampire(String.valueOf(number))) {
					countVampires++;
					System.out.println(countVampires + "....." +number);
					if(countVampires == 100)
						System.out.println("Reached");
				}
			}
			number++;
		}
	}
}

