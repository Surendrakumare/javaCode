package learnigJava.arraylist;
import java.util.ArrayList;   
public class CustomArrayListExample   
{   
// custom class which has data type   
// class has defined the type of data ArrayList   
// size of ArrayList 6   
int size=6;   
//custom data type class  
class Product   
{   
//global variables of the class to be added in ArrayList  
int pid;   
String pname;   
char pavailability;   
double pprice;   
float prating;  
//constructor of the class that contains types of data which are required   
Product(int pid, String pname, char pavailability, double pprice, float prating)   
{   
//initializing the variables from main   
//function to the global variable of the class   
this.pid = pid;   
this.pname = pname;   
this.pavailability = pavailability;   
this.pprice = pprice;   
this.prating = prating;  
}   
}   
public static void main(String args[])   
{   
//data that we want to input  
int pid[] = {21823, 89774, 34007, 12098, 45098, 10067};   
String pname[] = {"HP Laptop", "Inverters", "Volats AC", "iPhone 11", "CanonDSLR", "SonyLEDTV"};   
char pavailability[] = {'Y', 'Y', 'N', 'Y', 'Y', 'N'};   
double pprice[] = {31987, 16900, 28000, 99000, 67570, 60500};   
float prating[] = {4.5f, 4.0f, 4.7f, 4.5f, 3.9f, 4.0f};  
//Creating an object of the class   
CustomArrayListExample calobj = new CustomArrayListExample();   
//invoking the addElements() method that adds the elements in the ArrayList  
calobj.addElements(pid, pname, pavailability, pprice, prating);   
}   
public void addElements(int pid[], String pname[], char pavailability[], double pprice[],  float prating[])   
{   
//local customized ArrayList of type Data having (int, String, char double, float) data type from the class  
ArrayList<Product> arraylist=new ArrayList<>();   
for (int i = 0; i < size; i++)   
{   
//send values to the constructor to be saved in the Product class  
arraylist.add(new Product (pid[i], pname[i], pavailability[i], pprice[i], prating[i]));   
}   
//calling the method to print the elements of the ArrayList  
displayElements(arraylist);   
}   
public void displayElements(ArrayList<Product> arraylist)   
{   
System.out.println("Product ID" + "   Product Name" + "     Product Availability" + "    Product Price" + "   Product Rating");   
System.out.println("-------------------------------------------------------------------------------------");      
//iteration over the ArrayList for accessing the elements  
for (int i = 0; i < size; i++)   
{   
//invoking the get() method of the ArrayList class to get the elements    
Product product = arraylist.get(i);   
//printing the elemnts to the console  
System.out.println(   product.pid+"    "+  "    "  +product.pname+"               "+"  "+product.pavailability+"                "+product.pprice+ "           "+String.format("%.01f", product.prating));   
}   
}   
}  