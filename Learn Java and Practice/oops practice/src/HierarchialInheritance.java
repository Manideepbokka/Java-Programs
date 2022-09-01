class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meow...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
public class HierarchialInheritance {
	public static void main(String args[])
	{
		Cat c=new Cat();
		c.meow();
		c.eat();
		Dog d=new Dog();
		d.bark();
		d.eat();
	}

}
