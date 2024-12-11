package introduction;

public class ChildClassDemo extends ParentClassDemo{

	public static void main(String[] args) {
		ChildClassDemo cd=new ChildClassDemo();
		cd.AudioSystems();;
		cd.Engine();
	}
	
	public void Engine() {
		System.out.println("New Engine");
	}

}
