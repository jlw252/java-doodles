package jennyworld;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Person {
		 public int id;
		 public String name;
		 public int salary;
		 public char a;
		 public String lname;
		 public Person(int id, String name, int salary){
			 this.id = id; 
			 this.name = name; 
			 this.salary = salary;
			 }
		 public Person(String lname) {
			 this.lname = lname;
		 }
		 public void print(){
			 System.out.println("Employee: "+id+" "+name+" "+salary);
			 }
		 public static Integer getNumber(String str) {
				try 
				{
					int number = Integer.parseInt(str);
					return new Integer(number);
				}
				catch(Exception e)
				{
					return null;
				}
			}
	}