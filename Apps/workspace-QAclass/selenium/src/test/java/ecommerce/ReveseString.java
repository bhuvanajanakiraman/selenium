package ecommerce;

public class ReveseString {

	public static void main(String[] args) {
		
		String s= "aba";
		String strRev="";
		for(int i=s.length()-1;i>=0;i--){
			strRev+=s.charAt(i);
			System.out.println(strRev);
			
		}
		if(s.equals(strRev)){
			System.out.println("its a pallindrome");
		}
		else{
			System.out.println("its not pallindrome");
		}
	}
		

	}


