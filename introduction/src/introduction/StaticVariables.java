package introduction;

public class StaticVariables {
	String name; //instance variables
	static String address;
	static String city="Bangalore"; //class variables
	static int i=0;
	
	public StaticVariables(String name,String address) {
		//Variables inside the constructor are called local variables
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
		
	}
	public void getName() {
		System.out.println(address+" "+city);
	}
	public static void getCity() {
		System.out.println(address);
	}
	
	public static void main(String[] args) {
		StaticVariables sv=new StaticVariables("Santhosh", "Tiruvannamalai");
		StaticVariables v=new StaticVariables("Sanjay", "Chennai");
		sv.getName();
		v.getName();
		

	}

}
