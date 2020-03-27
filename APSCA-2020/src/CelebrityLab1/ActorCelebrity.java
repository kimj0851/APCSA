package CelebrityLab1;

import java.util.ArrayList;

public class ActorCelebrity extends Celebrity{
	
	private ArrayList<String> clueList;
	
	public ActorCelebrity(String answer, String clues)
	{
		super(answer, clues);
		processClues();
	}
	
	private void processClues()
	{
		String [] clues = super.getClue().split(",");
		clueList = new ArrayList<String>();
		for (String currentClue : clues)
		{
			clueList.add(currentClue);
		}
	}
	
	@Override
	public String getClue()
	{
		if (clueList.size() == 0)
		{
			processClues();
		}
		String currentClue = clueList.remove(0);
		
		return currentClue;
	}
	
	
	@Override
	public String toString()
	{
		String ans = "This is the Actor: " + getAnswer() + "\nThe clues are:\n";
		
		for (String word : super.getClue().split(","))
		{
			ans += word + "\n";
		}
		
		return ans;
	}

}