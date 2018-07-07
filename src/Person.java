import java.util.Iterator;
import java.util.Scanner;

public class Person {
	Scanner scanner = new Scanner(System.in); 
	String name;
	String[] topThree = new String[3];
	
	
	public void setName()
	{
		System.out.println("Enter name of Big or Little:");
		name = scanner.nextLine();  
	}

	public void setTopThree()
	{
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter " + name + "'s number " + (i+1) + " pick");
			topThree[i] = scanner.nextLine();
		}
	}
	
	public String[] getTopThree()
	{
		return topThree;
	}
	
	public String getNum1()
	{
		return topThree[0];
	}
	
	public String getNum2()
	{
		return topThree[1];
	}
	
	public String getNum3()
	{
		return topThree[2];
	}
	
	public String getName()
	{
		return name;
	}
	
	public void printTopThree()
	{
		for (String nom : topThree) {
			System.out.println(nom);
		}
	}
}

