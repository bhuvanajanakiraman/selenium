package ecommerce;

public class Pallindrome {
	int n = 454;
	int sum = 0;
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
	 int r , n=656;	
	 
	int  temp=n;
	while(n>0){
	 r=n%10;
	sum=( sum*10)+r;
		
	n=n/10;
		System.out.println(sum);
	}

	if(temp==sum){
		System.out.println("number  is pallindrome");
		
	}
	else{
		System.out.println("not pallindrome");
		
	}
}
}