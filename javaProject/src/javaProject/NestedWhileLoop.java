package javaProject;

public class NestedWhileLoop {

	public static void main(String[] args) {
		int i=0,j=0;
		while(i<5) {
			while(j<3) {
				System.out.println("Hi");
				j++;
			}
			i++;
		}

	}

}
