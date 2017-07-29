package ecommerce;

import java.util.Arrays;

public class Anagrams {

	public static void isAnagram(String s1, String s2) {

		String copyOfs1 = s1.replaceAll("//s", "");
		String copyOfs2 = s2.replaceAll("//s2", "");

		boolean status = true;

		if (copyOfs1.length() != copyOfs2.length()) {

			 status = false;

		}
		else{
			char[] Array1=copyOfs1.toLowerCase().toCharArray();
			char[] Array2= copyOfs2.toLowerCase().toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			
			status=Arrays.equals(Array1, Array2);
		}
		if(status) {
			System.out.println(s1+" " +s2+" "+"It is anagram");
		}
		else{
			System.out.println("It's not an anagram");
		}
	}

	public static void main(String[] args) {

		isAnagram("cat", "act");
		isAnagram("top", "pot");
	isAnagram("baby", "both");	
	}
}
