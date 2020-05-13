package FRQ;
import java.util.ArrayList;

public class OnlinePurchaseManager
{
   //purchases stores Gizmos
   private ArrayList<Gizmo> purchases;
   
   
   //point purchases at a new ArrayList   
   public OnlinePurchaseManager()
   {
   	purchases = new ArrayList<Gizmo>();
   }
   
   
   //NOT part of the sample question
   //needed in order to type up and
   //test student code
   public void add( String m, boolean e )
   {
   	purchases.add( new Gizmo( m, e) );
   }
   
   
   //Part A
   //count the number of Gizmos made by maker
   //that are also electronic
   //must call getMaker and isElectronic
   //return the count or 0 if no matches
   public int countElectronicsByMaker(String maker)
   {   
	   int counter =0;
   	//WRITE CODE HERE FOR PART A
	   for (int i = 0; i < purchases.size(); i++)
	   {

		   if (purchases.get(i).getMaker() == maker)
		   {
			   if (purchases.get(i).isElectronic())
			   {
				   counter ++;
			   }
		   }
	   }
   	return counter;
   }
   

   //Part B
   //loop thought the list and check for matching adjacent pairs
   //return true of any adjacent [ side by side ] pairs are the same
   //to be the same the pairs must have the same maker and
   //be either electronic or non-electronic
   //you really really should use the equals method from Gizmo
   public boolean hasAdjacentEqualPair()
   {  
	   boolean adj = false;
	   for (int i = 0; i < purchases.size()-1; i++)
	   {
		   if (purchases.get(i).equals(purchases.get(i+1)))
		   {
			  adj = true;
		   }
	   }
   	//WRITE CODE HERE FOR PART B
	   
   	return adj;   	
   }
   
   
   public int getCheapestGizmoByMaker()
   {
	   
	return 0;  
	   
   }
   
   
   
   
   //NOT part of the sample question
   //needed in order to type up and
   //test student code
   public String toString()
   {
   	return "" + purchases;
   }
}


/*Part C

OPEN-ENDED SECTION

A programmer would like to add a method getCheapestGizmoByMaker, 
which returns the least expensive Gizmo purchased by an individual 
from a given maker.

Write a description of how you would change the Gizmo and OnlinePurchaseManager 
classes in order to support this modification. 
 
Make sure to include the following in your response. 

•	Write the method header for the getCheapestGizmoByMaker method. 
	DO write code for this part.   
	public int getCheapestGizmoByMaker(maker)
   {
	   
   }

•	Identify any new or modified variables, constants, constructors, 
   or methods aside from the getCheapestGizmoByMaker method. 
   DO NOT write code for this part.
   you would need a variable for the cheapest item and another one to hold it's place.
   
•	Describe, for each new or revised variable, constant, constructor, 
   or method, how it would change or be implemented, including visibility and type. 
   You do not need to describe the getCheapestGizmoByMaker method.
   DO NOT write code for this part.
   the only thing you would require is a vaiable that will compare it with a loop of all the maker items in the array and go through an if statement. 

*/

