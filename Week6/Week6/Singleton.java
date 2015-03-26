package Week6;

public class Singleton {

	private static Singleton instance = null;
	protected Singleton() {
	
	}

	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
			System.out.println("Creating new Instance");
		} else {
			System.out.println("Instance already exists");
		}
		return instance;
	}
}
