package ecommerce;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayListwithoutDuplicates {
	
		
	public static void main(String[] args){
		// TODO Auto-generated method stub
		String[] str ={"bhuva","bhuva","sidd","laya","laya"};
		ArrayList<String>list=new ArrayList<String>();
		for(String s:str){
			list.add(s);
			
			
			LinkedHashSet<String> set = new LinkedHashSet();
			set.addAll(list);
			list.clear();
			
			
		list.addAll(set);
			System.out.println("Array without duplicate"+list);
			
			}
			
		}
	
	}


	


