package general;

public class MainClass {
	public static void main(String[] args) {
		Parent p = new Child();
		p.method();
		
		SuppressWarningDemo suDemo = new SuppressWarningDemo();
		System.out.println(suDemo.addInList()); 
		
		DeprecatedDemo deprecatedDemo = new DeprecatedDemo();
		deprecatedDemo.methodOld();
	}
}
