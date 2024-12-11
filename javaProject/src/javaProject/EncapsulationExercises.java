package javaProject;

class Dog {
	String name="Bruno";
	float weight=6.08f;
	int tail=1;
	public void jump() {
		System.out.println("Dogs loves to jump high");
	}
	public void fight() {
		System.out.println("Dog fight");
	}
	public void bark() {
		System.out.println("Bark looudly");
	}
	public void sit() {
		System.out.println("Dogs sits");
	}
	public void run() {
		System.out.println("Dogs run");
	}
}
public class EncapsulationExercises {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sit();
		d.bark();
		

	}

}
