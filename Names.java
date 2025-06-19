package jennyworld;
import java.io.File;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;  

public class Names {
	public static Scanner keyboard;
	public static Scanner namess;
	public static Scanner enemyy;
	
	public static LinkedList<Person> allPeople = new LinkedList<Person>();
	public static ArrayList<String> allEnemies = new ArrayList<String>();
	public static ArrayList<String> nameList = new ArrayList<String>();
	
	public static void CheckSalary(int i){
		allPeople.get(i);
		String namee = (allPeople.get(i).name);
		int salaryy = (allPeople.get(i).salary);
		int idd = (allPeople.get(i).id);
		int cnt = 0;
		char a = 0;
		a = namee.charAt(0);
		switch(a) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			 salaryy = allPeople.get(i).salary + 1000;
		
		default: 
			 cnt = namee.length();
			 cnt--;
			 a = namee.charAt(cnt);
			 switch(a) {
			 case 'a':
			 case 'e':
			 case 'i':
			 case 'o':
			 case 'u':
				 salaryy = allPeople.get(i).salary-500;
			 default: 
				 allPeople.get(i).salary = salaryy;
			 }
		 }
	 }
	
	public static void main(String[] args) throws Exception {
		keyboard = new Scanner(System.in);
		namess = new Scanner(new File("namess.txt"));
		enemyy = new Scanner(new File("enemyy.txt"));
		
		int n = namess.nextInt();
		for(int i=0; i<n; i++) {
			String token;
			int id;
			String name;
			int salary;
			token = namess.next();
			id = getNumber(token);
			name = namess.next();
			nameList.add(new String(name));
			token = namess.next();
			salary = getNumber(token);
			allPeople.add(new Person(id, name, salary));
		}
		for(Person e: allPeople) {
			e.print();
		}
		System.out.println(" ");
		System.out.println(" ");
		int m = enemyy.nextInt();
		for (int i=1; i<m; i++) {
			String lname;
			lname = enemyy.next();
			allEnemies.add(lname);
		}
		System.out.println(" ");
		System.out.println(" ");
		for(int i=0; i<n; i++)
		{
			CheckSalary(i);
		}
		System.out.println("The list after changing the salaries: ");
		for(Person e: allPeople) {
			e.print();
		}
		System.out.println(" ");
		System.out.println(" ");
		allPeople.addLast(new Person(2, "Wang", 50000)); //adds self
		for(Person e: allPeople) {
			e.print();
		}
		System.out.println(" ");
		
		
		for(int i=0; i<m; i++) {
			String delete = allEnemies.get(i);
			for(int j=0; j<n; j++) {
				String deletee = nameList.get(j);
				if(delete.contentEquals(deletee)) {
					allPeople.remove(j);
				}
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		for(Person e: allPeople) {
			e.print();
		}
		Collections.sort(allPeople, new Comparator<Person>() {
			public int compare(Person lhs, Person rhs) {;
			if (lhs.id == rhs.id) return 0;
			else return (lhs.id < rhs.id? -1 : 1);
			}
		});
		for(Person e: allPeople) {
			e.print();
		}
		;
	
	}
	public static Integer getNumber(String str) {
		try {
			int number = Integer.parseInt(str);
			return new Integer(number);
		}
		catch(Exception e){
			return null;
			}
	}
	
}
