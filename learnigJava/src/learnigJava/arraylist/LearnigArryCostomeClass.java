package learnigJava.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LearnigArryCostomeClass {
	public static void main(String[] args){
//	ArrayList<Employee> empslist = new ArrayList<Employee>();
	List<ArrayList<Employee>> list = new ArrayList<ArrayList<Employee>>();

	list.add(new ArrayList<Employee> ());
	list.add(new ArrayList<Employee>());
	list.get(0).addAll(0,(Collection<? extends Employee>) new Employee(1 , "surendra" , 10.0));
	list.get(1).addAll(1,(Collection<? extends Employee>) new Employee(2 , "yashashwini" , 20.0));

	System.out.println(list);
//	for(int i =0;i<2;i++) {
//		Employee emp =empslist.get(i);
//		list.add(emp);
//		
	
//		}
	
//	for(int i =0;i<2;i++) {
//	Employee emps = list.get(i);
//	System.out.println(emps);
//	
//	}
	}
}
