package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coreJavaBrushUp {

	public static void main(String[] args) {
		int myNum = 5;
		String website = "rahulshettyacademy.com";
		double c = 2.66;
		char d = 'r';
		boolean e = true;

		System.out.println(myNum + " is the variable stored in myNum variable");
		int[] arr=new int[5];
		arr[0]=1;
		arr[2]=2;
		arr[3]=5;
		arr[4]=6;
		
		int[] array2= {1,2,3,4,5};
		System.out.println(array2[3]);
		String[] name= {"Rahul","Shetty","Selenium"}; //To define array there are multiple formats and one of the formats are as 
		int[] santhosh= {1,2,3,4,5,5,6,7,8,9};
		
		
		//for loop
		for(int i=0;i<santhosh.length;i++) {
			System.out.println(santhosh[i]);
		}
		
		for (String s:name) {
			System.out.println(s);
		}
		
		int[] arr2= {1,23,4,5,6,7,8,9,10,12,3,4,5,6,7,7,3,333,3,3,33,3,3,2,2,21,1};
		
		for (int i=0;i<arr2.length;i++) {
			if(arr2[i]%2==0) {
				System.out.println(arr2[i]);
				break;
			}else {
				System.out.println(arr2[i] + " is not a multiple of 2");
			}
		}
		
		int[] numbers={2,4,5,6,7};
	    System.out.println(numbers[0]);
	    System.out.println(numbers[4]);
	    for (int i=numbers.length-1;i>=0 ;i--) {
	        System.out.println(numbers[i]);
	    }
	    
	    ArrayList<String> a=new ArrayList<String>();
	    a.add("Santhosh");
		a.add("Sanjay");
		a.add("Umasankari");
		a.add("Srinivasan");
		System.out.println(a);
		a.get(3);
		System.out.println(a.get(3));
		
		for (int i=0;i<a.size();i++) {
			System.out.println(a);
		}
		
		
		System.out.println(a.contains("Santhosh"));
		
		String[] name1= {"Rahul","Shetty","Selenium"}; 
		List<String> nameArrayList=Arrays.asList(name1);

	}

}
