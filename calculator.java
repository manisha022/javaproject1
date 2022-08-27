package project;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		double result;
		//create object for scanner class
		Scanner sc=new Scanner(System.in);
		//take input from user for n1
		System.out.println("Enetr first number n1: ");
		double n1=sc.nextDouble();
		//take input from user for n2
		System.out.println("Enetr second number n2: ");
		double n2=sc.nextDouble();
			//ask user to enter operator
		System.out.println("Choose operator +,-,*,/,%: ");
		char operator=sc.next().charAt(0);
		//perform operation
		switch(operator)
		{
		case '+':result=n1+n2;
		       System.out.println(n1+" + "+n2+" = "+result);
		       break;
		case '-':result=n1-n2;
		       System.out.println(n1+" - "+n2+" = "+result);
		       break;
		case '*':result=n1*n2;
		       System.out.println(n1+" * "+n2+" = "+result);
		       break;
		case '/':result=n1/n2;
		       System.out.println(n1+" / "+n2+" = "+result);
		       break;
		case '%':result=n1%n2;
		       System.out.println(n1+" % "+n2+" = "+result);
		       break;
		default :System.out.println("Invalid operator..");       
		         break;
		}
		}
	}
