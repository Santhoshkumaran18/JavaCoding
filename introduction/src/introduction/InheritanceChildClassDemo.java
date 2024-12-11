package introduction;

public class InheritanceChildClassDemo extends InheritanceParentClassDemo {
	
	public void Engine() {
		System.out.println("Child Engine code implemented");
	}
	public void audiosystem() {
		System.out.println(" Audio child system code implemented");
	}

	public static void main(String[] args) {
		InheritanceChildClassDemo cd=new InheritanceChildClassDemo();
		cd.Color();
		cd.Engine();
		InheritanceParentClassDemo b=new InheritanceParentClassDemo();
		b.Engine();
		cd.audiosystem();
		
		

	}

}
