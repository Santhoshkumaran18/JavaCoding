package introduction;

public class StaticVariablesExercises {
	
	String name;
	String Address;
	static String city ="Bangalore"; // Instance variables
	static int i=0;
	
	StaticVariablesExercises(String name,String Address) {
		this.name=name;
		this.Address=Address;
		this.city=city;
		i++;
		System.out.println(i);
		
	}
	
	public void getData() {
		System.out.println(Address +" "+city);
		System.out.println(this.i);
	}
	
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticVariablesExercises Se=new StaticVariablesExercises("Santhosh", "Thiruvalluvar Street");
		StaticVariablesExercises Se1=new StaticVariablesExercises("Sanjay", "Thiruvalluvar Street");
		Se.getData();
		Se1.getData();
		Se.getData();
		Se.getCity();
		
		

	}

}
