package Week6;

public class Driver {

	public static void main(String args[])
	{
		for(int i=0; i<50; i++)
		{
			Singleton.getInstance();
		}		
	}
}
