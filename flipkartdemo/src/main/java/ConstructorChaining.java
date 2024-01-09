
public class ConstructorChaining {
	
	
	
	
	public ConstructorChaining() {
		this("asha","prathiksha");
		System.out.println("Default My properties");
	}
	
	public ConstructorChaining(String wife) {
		
		System.out.println("My wife acquire my properties " +wife);
	}
		
			
	public ConstructorChaining(String wife,String daughter){
		this("asha");
		System.out.println("My wife and daughter acquire my properties " +wife+" "+daughter);
	}

	public static void main(String[] args) {
		
		new ConstructorChaining();
		
	}
	
}
