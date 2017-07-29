package ecommerce;

import java.util.Scanner;

public class ReverseNumber {
	
	
	
	public int reverseNO( int number ){
		 int reverse = 0;
	        while(number != 0){
	            reverse = (reverse*10)+(number%10);
	            number = number/10;
	        }
	        return reverse;	
	}
		public static void main(String[] args) {
			
			ReverseNumber re= new ReverseNumber();
	System.out.println(re.reverseNO(675));
		
			
		}
	}
		
		
	
	

