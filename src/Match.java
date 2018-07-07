import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Match {
	public List<Big> bigs;
	public List<Little> lits;
	Scanner scanner = new Scanner(System.in);
	
	int numBigs, numLits;

	public Match() {
		
		bigs = new ArrayList<Big>();
		lits = new ArrayList<Little>();
	//	Iterator<Big> it = bigs.iterator();
	}
	
	public void createBigs()
	{
		System.out.println("How many Bigs are there?");
		numBigs = scanner.nextInt();
		
		for (int i = 0; i < numBigs; i++) {
			Big currBig = new Big();
			bigs.add(currBig);
			currBig.setName();
			currBig.setTopThree();
			bigs.set(i, currBig);
		}
		this.printBigsNames();
		this.printBigsPicks();
	}
	
	public void setBigName()
	{
		
		
//		while(it.hasNext()) 
//		{
//			System.out.println("Enter name of Big " + (i+1));
//			currBig = it.next();
//			currBig.setName();
//			bigs.set(it., currBig);
//		}
			//for (int i = 0; i < bigs.size()-1; i++) {
		//		System.out.println("Enter name of Big:");
		//		currBig.setName();
				
				
			
		//}
			//this.printBigsNames();
			
	}
	
	public void setAllBigsFaves(Big currBig)
	{
	//	for (int i = 0; i < bigs.size()-1; i++) {	
	//		currBig = bigs.get(i);
//			System.out.println("Enter" + currBig.getName() + 
//					"'s top three potential littles");
		//	currBig.setTopThree();
		//	bigs.set(i, currBig);
//		}
	}
	
	public void printBigsNames()
	{
		String nom = ""; 
		for (int i = 0; i < bigs.size(); i++) {
			Big currBig = new Big();
			currBig = bigs.get(i); 
			nom = currBig.getName();
			System.out.println((i+1) + ". " + nom);
		}
		
	}
	
	public void printBigsPicks()
	{
		
		for (int i = 0; i < bigs.size(); i++) {
			Big currBig = new Big();
			currBig = bigs.get(i); 
			System.out.println(currBig.getName() + "'s top three are:");
			currBig.printTopThree();
			
		}
	}
	
	
	
	public void createLits()
	{
		System.out.println("How many littles are there?");
		numLits = scanner.nextInt();
		
		for (int i = 0; i < numLits; i++) {
			Little currLit = new Little();
			lits.add(currLit);
			currLit.setName();
			currLit.setTopThree();
			lits.set(i, currLit);
		}
		this.printLitsNames();
		this.printLitsPicks();
		
		Comparison comp = new Comparison();
		comp.besties(bigs, lits);
	}
	
	public void printLitsNames()
	{
		String nom = ""; 
		for (int i = 0; i < lits.size(); i++) {
			Little currLit = new Little();
			currLit = lits.get(i); 
			nom = currLit.getName();
			System.out.println((i+1) + ". " + nom);
		}
		
	}
	
	public void printLitsPicks()
	{
		
		for (int i = 0; i < lits.size(); i++) {
			Little curLit = new Little();
			curLit = lits.get(i); 
			System.out.println(curLit.getName() + "'s top three are:");
			curLit.printTopThree();
			
		}
	}
	
}
