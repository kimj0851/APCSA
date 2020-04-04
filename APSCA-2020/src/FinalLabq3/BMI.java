package FinalLabq3;

public class BMI {
	private double myWeight,myHeight,myAge;
	private Character myGender;
	
	public BMI()
	{
		setDoubles(0.0, 0.0, 0.0);
		setGender('a');
	}
	public BMI(double weight, double height, double age, char gender)
	{
		setDoubles(weight, height, age);
		setGender(gender);
	}
	public void setDoubles(double weight, double height, double age)
	{
		myWeight = weight;
		myHeight = height;
		myAge = age;
	}
	public void setGender(Character gender)
	{
		myGender = gender;
	}
	public double getAge()
	{
		return myAge;
	}
	public double getHeight()
	{
		return myHeight;
	}
	public double getWeight()
	{
		return myWeight;
	}
	public String getGender()
	{
		if (myGender == 'm')
		{
			return "Male";
		}
		else if(myGender =='f')
		{
			return "Female";
		}
		else
		{
			return"";
		}
	}
	public double BMIcalc()
	{
		double bmi =0.0;
		if(myGender.equals('m') ) 
		{
			bmi= ((6.077 * myWeight) + (12.192 * myHeight) + (5.677 *myAge) + 88.362) * 1.3;
		}
		else if (myGender.equals('f'))
		{
			bmi = ((4.194 * myWeight) + (7.869 * myHeight) + (4.330 * myAge) + 447.593) * 1.3;
		}
		return bmi;


	}


}
