// Java program to demonstrate working of instanceof Keyword

// Class 1
// Parent class
// Class 2
// Child class
class Child extends Parent {
}

// Class 3
// Main class
class Instance extends Child  {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of child class
		Child cobj = new Child();

		// A simple case
		if (cobj instanceof Child)
			System.out.println("cobj is instance of Child");
		else
			System.out.println(
				"cobj is NOT instance of Child");

		// instanceof returning true for Parent class also
		if (cobj instanceof Parent)
			System.out.println(
				"cobj is instance of Parent");
		else
			System.out.println(
				"cobj is NOT instance of Parent");

		// instanceof returns true for all ancestors

		// Note : Object is ancestor of all classes in Java
		if (cobj instanceof Object)
			System.out.println(
				"cobj is instance of Object");
		else
			System.out.println(
				"cobj is NOT instance of Object");
	}
}