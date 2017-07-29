package ecommerce;

public class MaxNo {

	
	
	public  int  MaxTwoNo(int[] nums){
		 int maxone =0;
			int maxtwo =0;
		for(int n:nums) {
		
			if(maxone <= n){
				maxtwo=maxone;
				maxone =n;
			}
			else if (maxtwo<n){
				maxtwo=n;
				
			}
			
				
		}
		System.out.println(maxone);
		System.out.println(maxtwo);
		return maxtwo;
		
		
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxNo m =new MaxNo();
		int num[] ={5,6,78,90,76};
		 m.MaxTwoNo(num);
	
	
	}

}
