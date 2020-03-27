
package DataLab;

public class DropOut {
	   private String year;
	   private String category;
	   private String demographics;
	   private int numDrop;
	   private double percentDrop;
	   
	   DropOut(String year, String category, String demographics, int numDrop, double percentDrop) {
	      this.year= year;
	      this.category= category;
	      this.demographics= demographics;
	      this.numDrop= numDrop;
	      this.percentDrop = percentDrop;   
	   }
	   
	   public String getYear() { 
	      return year;
	   }
	   public String getCategory() { 
		  return category;
	   }
		   
	   public String getDemo() { 
		      return demographics;
	   }
		   
	   
	   public int getNum() { 
	      return numDrop;
	   }
	   
	   public double getPercent() {
		   return percentDrop;
	   }
	   
	   
	   public String toString() {
		   return year + category;
	   }
}