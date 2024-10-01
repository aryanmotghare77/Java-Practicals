class Person
{
	private String name;
	private int age;;

     // Constructor with no parameters
	public Person()
	{
		name = "Unknown";
		age = 0;
	}
	// Constructor with name parameter
	public Person(String name)
	{
		this.name = name;
		age=0;
	}
// Constructor with name and age parameter
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
// Method to displat person details
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

public class Main
{
	public static void main(String[]args)
	{
		//Creating objects using different constructors
		Person person1 = new Person();
		Person person2 = new Person("Raman");
		Person person3 = new Person("Rajiv",30);

		//Displaying Person Details
		System.out.println("Person 1 : ");
		person1.display();

		System.out.println("\nPerson 2 : ");
		person2.display();

		System.out.println("\nPerson 3 : ");
		person3.display();

	}
}