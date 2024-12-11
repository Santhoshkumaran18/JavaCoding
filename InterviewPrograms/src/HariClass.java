/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;
public class HariClass
{
	public static void main(String[] args) {
	    String name="123221";
		StringBuilder sb=new StringBuilder(name);
		if(name.equals(sb.reverse().toString())){
		    System.out.println("palindrome");
		}
		else{
		    for(int i=0;i<name.length();i++){
		        sb.deleteCharAt(i);
		        if(isPalindrome(sb.toString())){
		            System.out.println(Character.getNumericValue(name.charAt(i)));
		            break;
		        }
		        else{
		            sb.insert(i,name.charAt(i));
		        }
		    }
		}
	}
	public static boolean isPalindrome(String str){
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
}

