package sef.module6.sample;

public class VirtualMethodSample {
	public static void main(String arg[]){
		sef.module6.sample.Person_P p = new sef.module6.sample.Person_P();
		p.setName("John Doe");
		
		//Student inherits the methods and behavior from the Person class
		sef.module6.sample.Student_P s = new sef.module6.sample.Student_P();
		s.setName("Jane Doe");
	
		s.setSchool("A Fictional School");
		s.setGrade(10);
		
		rollCall(s);
		rollCall(p);
	
	}
	
	public static void rollCall(sef.module6.sample.Person_P temp){
			temp.announce();
	}
}
