package jennyworld;
import java.util.Scanner;
public class GPA {
	public static void main(String[] args) {
		Scanner sour = new Scanner (System.in);
		double ucredits = 0.0000;
		double gpnweighted = 0.0000;
		double wcredits = 0.0000;
		double gpweighted = 0.0000;
		double qpoints = 0.0;
		double totcredits = 0.0;
		double gpa = 0.0000; 
		System.out.println("What is my GPA?");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will help you determine your overall GPA through the quality points divided by total number of credits from the credits and grade point of non-weighted and weighted classes.");
		System.out.println(" ");
		System.out.print("Please enter the total NON-WEIGHTED credits: ");
		ucredits = sour.nextDouble();
		System.out.print("Please enter the over all grade point for non-weighted: ");
		gpnweighted = sour.nextDouble();
		System.out.print("Please enter the total WEIGHTED credits: ");
		wcredits = sour.nextDouble();
		System.out.print("Please enter the over all grade point for weighted: ");
		gpweighted = sour.nextDouble();
		System.out.println(" ");
		System.out.println("You entered the following information: ");
		System.out.printf("Number of non-weighted credits: %3.4f\n", ucredits);
		System.out.printf("Non-weighted GPA: %6.4f\n", +gpnweighted);
		System.out.printf("Number of weighted credits: %3.4f\n", wcredits);
		System.out.print("Weighted GPA: ");
		System.out.printf("%6.4f",gpweighted);
		System.out.println(" ");
		qpoints = (ucredits*gpnweighted)+(wcredits*gpweighted);
		System.out.println("Total quality points: " +qpoints);
		totcredits = ucredits + wcredits;
		System.out.println("Total credits: "+totcredits);
		gpa = qpoints/totcredits;
		System.out.printf("Overall GPA: %6.4f\n", gpa);
		sour.close();
}
}
// GPA=(Quality Points)/ (Credits) {Quality Points = Credit*GradePoint