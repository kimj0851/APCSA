//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
//Date - 2/11/20

package Unit_05;
public class FirstLastVowel
{
   public static String go( String a )
	{
	 a.toLowerCase();
	 String firstA = a.substring(0,1);
	 String lastA = a.substring(a.length()-1);
	 if ((firstA.equals("a") || lastA.equals("a"))) {
		 return "yes";
	 }
	 if ((firstA.equals("e") || lastA.equals("e"))) {
		 return "yes";
	 }
	 if ((firstA.equals("i") || lastA.equals("i"))) {
		 return "yes";
	 }
	 if ((firstA.equals("o") || lastA.equals("o"))) {
		 return "yes";
	 }
	 if ((firstA.equals("u") || lastA.equals("u"))) {
		 return "yes";
	 }
	 else {
	   return "no";
	 }
	}
}