package ecommerce;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter number a");
int x= sc.nextInt();
System.out.println("enter number b");
int y= sc.nextInt();
 x= x+y;
 y=x-y;
 x=x-y;
 System.out.println(x+" "+y);
	}

}
