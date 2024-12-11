package introduction;

public class ThisKeywordDemo {
	
	int a=2;
	
	public void getData() {
		int a=5;
		int b;
		b=a+ this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		//this refers to current object scope level
	}

	public static void main(String[] args) {
		
		ThisKeywordDemo tk=new ThisKeywordDemo();
		tk.getData();

	}

}
