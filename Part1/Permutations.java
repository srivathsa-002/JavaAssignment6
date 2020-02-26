package Assignment6;

import java.util.ArrayList;

public class Permutations {
	public ArrayList<String> findAllPermutations(String str){
		ArrayList<String> allPermutations = new ArrayList<String>();
		if (str == null) {
            return null;
        } else if (str.length() == 0) {
            allPermutations.add("");
            return allPermutations;
        }
		char initial = str.charAt(0);
		String remaining = str.substring(1);
		ArrayList<String> words = findAllPermutations(remaining);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                allPermutations.add(charInsert(strNew, initial, i));
            }
        }
        return allPermutations;
	}
	
	public String charInsert(String str,char c,int j) {
		String start = str.substring(0,j);
		String end = str.substring(j);
        return start + c + end;
	}
}
