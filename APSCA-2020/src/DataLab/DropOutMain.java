package DataLab;

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DropOutMain {
	public static void main(String[] args) {
	      DataSource ds = DataSource.connect("https://data.cityofnewyork.us/api/views/qk7d-gecv/rows.xml").load();
	      ArrayList<DropOut> DropOutList = ds.fetchList(DropOut.class, "row/row/cohort_year", 
	             "row/row/cohort_category", "row/row/demographic", "row/row/dropped_out", "row/row/of_cohort_dropped_out");
	      
	      
	Scanner sc1 = new Scanner(System.in);
    System.out.println("Select a year between 2001-2011: ");
    String year = sc1.next();
    double percent = 0;
    int placer = 0;
    for (int i=0; i < DropOutList.size(); i++)
    {
    	if (DropOutList.get(i).getYear().contains(year))
    	{
    		if (!DropOutList.get(i).getDemo().contains("English Language Learner")&&!DropOutList.get(i).getDemo().contains("Student with Disability"))
    		{
    			if (DropOutList.get(i).getPercent() >= percent)
    			{
    				percent = DropOutList.get(i).getPercent();
    				placer = i;
    			}	
    		}
    	}
    }
    System.out.println("The demographics of the highest drop out percentage of " + year + " is "  + DropOutList.get(placer).getDemo() + " with a percentage of:  " + percent +"%");
	percent = 0;
	placer = 0;
	
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Would you like to see every year? \n yes or no");	
    String ans = sc2.next();
    if (ans.contains("yes"))
    {
    	for (int z = 2001;z <= 2011; z++)
    	{
    		year = String.valueOf(z);
    		 for (int i=0; i < DropOutList.size(); i++)
    		    {
    		    	if (DropOutList.get(i).getYear().contains(year))
    		    	{
    		    		if (!DropOutList.get(i).getDemo().contains("English Language Learner")&&!DropOutList.get(i).getDemo().contains("Student with Disability"))
    		    		{
    		    			if (DropOutList.get(i).getPercent() >= percent)
    		    			{
    		    				percent = DropOutList.get(i).getPercent();
    		    				placer = i;
    		    			}	
    		    		}
    		    	}
    		    }
    		  System.out.println("The demographics of the highest drop out percentage of " + year + " is "  + DropOutList.get(placer).getDemo() + " with a percentage of:  " + percent +"%");
  	    	percent = 0;
  	    	placer = 0;
    	}
    }
}
}
