package jennyworld;
import java.util.Scanner;
public class Pay {
	public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	double worked = 0;
	double hours = 0;
	double hours_normal_wage = 0;
	double hours_overtime_wage = 0;
	double gross_pay = 0;
	double net_pay = 0;
	double deductions = 0;
	System.out.println("Gross and Net Pay Calculator");
	System.out.println("by Jenny Wang");
	System.out.println(" ");
	System.out.println("This program will determine your normal pay, overtime pay, gross pay, ");
	System.out.println("net pay, and amount of deductions through your number of hours worked and hourly wage.");
	System.out.println(" ");
	System.out.print("Enter the number of hours worked: ");
	worked = input.nextDouble();
	System.out.print("Enter your hourly wage: ");
	hours = input.nextDouble();
	System.out.println(" ");
	if (worked <= 40)
	{hours_normal_wage = worked*hours;
	System.out.printf("Normal pay: $"+"%.2f\n", hours_normal_wage);}
	else
	{hours_normal_wage = 40*hours;
	hours_overtime_wage = (worked - 40)*hours*1.5;
	System.out.printf("Normal pay: $"+"%.2f\n", hours_normal_wage);
	System.out.printf("Overtime pay:$"+"%.2f\n",hours_overtime_wage);}
	gross_pay = hours_normal_wage + hours_overtime_wage;
	System.out.printf("Your gross pay: $"+"%.2f\n", gross_pay);
	net_pay = 0.75*gross_pay;
	System.out.printf("Your net pay: $"+"%.2f\n", net_pay);
	deductions = gross_pay - net_pay;
	System.out.printf("The amount of deductions is $"+"%.2f\n", deductions);
	input.close();
}
}