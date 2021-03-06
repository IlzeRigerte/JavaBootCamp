package sample;

public class ClassInstanceSample {

	public static void main(String arg[]){
		
		//Object instance creation using 'new' and passing parameters to constructors
		sef.module4.sample.Person him = new sef.module4.sample.Person("John Doe");
		sef.module4.sample.Person her = new sef.module4.sample.Person("Jane Doe");
		sef.module4.sample.Person unknown = new sef.module4.sample.Person();
		
		
		//Access an object's member method to invoke a behavior
		System.out.println(him.introduce());
		System.out.println(her.introduce());
		
		// Access and Set the object's attribute using it's setter and getter
		him.setName("John");
		String name = him.getName();
		System.out.println(name);
		
		//This will cause the object pointed by 'her' to be garbage collected
		//since there are no more remaining references to that object
		her = null;
		
		
	}
}
