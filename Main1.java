class Animal 
{
	public String publicName;
	protected String protectedName;
	String defaultName;
	private String privateName;


	public Animal(String publicName, String protectedName, String defaultName , String privateName)
	{
		this.publicName = publicName;
		this.protectedName = protectedName;
		this.defaultName = defaultName;
		this.privateName = privateName;

	}
}

class Dog extends Animal
{
	public Dog(String publicName, String protectedName, String defaultName , String privateName)
	{
		super(publicName, protectedName,defaultName , privateName);
	}
	public void displayNames()
	{
		System.out.println("Public Name "+publicName);
		System.out.println("Protected Name "+protectedName);
		System.out.println("Default Name "+defaultName);
		// The Following line woul;d result in a compilation error since privateName is private in parent class
		//System.out.println("Private Name "+privateName);
	}
}

public class Main1
{
	public static void main(String args[])
	{
		Dog dog = new Dog("Buddy","Rover","Max","Spot");
		dog.displayNames();
	}
}