package Test;



public class mixWords
{
	public static String half()
	{
		String word = "burgers";
		String half1 = word.substring(0,(word.length())/2);
		String half2 = word.substring((word.length())/2, word.length());
		
		return half1 + " " + half2;
	}
	
	
	private String[] mixedWords(String[] words)
	{
		for (int i =0; i < words.length; i+=2)
	{
		String temp1 = words[i];
		String temp2 = words[i+1];
		words[i] = Recombine(temp1, temp2);
		words[i+1] = Recombine(temp2, temp1);
	}
	return words;
	
	public static void main( String[] args )
	   {
		System.out.println(half());
		}
}