package learnigJava.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultidimentionalArryWithoutCustomClass {
public static void main(String [] args) {
	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

	list.add(new ArrayList<Integer> ());
	list.add(new ArrayList<Integer>());
list.get(0).addAll(0, Arrays.asList(1 , 2 , 10));
list.get(1).addAll(0,Arrays.asList(1 , 2 , 10));
list.get(1).remove(1);
System.out.println(list);

System.out.println(list.get(0).get(2));

}
}
