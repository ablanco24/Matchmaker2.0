import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Comparison {

	public Comparison()
	{
		
	}
	
	public void besties(List<Big> bigs, List<Little> lits)
	{
		Iterator<Big> bigIt = bigs.iterator();
		Iterator<Little> litIt = lits.iterator();
		
		
		
		
		while (bigIt.hasNext()) {
			Big currBig = bigIt.next();
			System.out.println("Big: " + currBig.getNum1());
			while (litIt.hasNext())
			{
				Little currLit = litIt.next();
				System.out.println("Big: " + currBig.getNum1());
				System.out.println("Little: " + currLit.getNum1());
				if(currLit.getNum1().equals(currBig.getNum1()))
					System.out.println("Welcome " + currLit.getName() + " to " + currBig.getName() + "'s family!!");
				else
					System.err.println("ya fucked up andrew");
			}
		}
		
	}
}
