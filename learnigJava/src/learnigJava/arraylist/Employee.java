package learnigJava.arraylist;

public class Employee {

	int id;
	String name;
	double salry;
	
	
	public Employee(int id ,String name, double salry) {
		this.id = id;
		this.name = name;
		this.salry = salry;
	}
   public String toString() {
	   return id + name + salry;
   }
}
