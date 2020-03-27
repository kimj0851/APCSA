package DataLab;

public class Cereal {
	private String name;
	private String type;
	private int calories;
	private int protein;
	private int fat;
	private int sodium;
	private int carb;
	private int fiber;
	private int sugar;
	private int potassium;
	private int vitamin;
	private int shelf;
	private double weight;
	private double cups;
	private double rating;
	
	public Cereal(){	
		
	}
	
	public Cereal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getProtein() {
		return protein;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getSodium() {
		return sodium;
	}
	public void setSodium(int sodium) {
		this.sodium = sodium;
	}
	public int getCarb() {
		return carb;
	}
	public void setCarb(int carb) {
		this.carb = carb;
	}
	public int getFiber() {
		return fiber;
	}
	public void setFiber(int fiber) {
		this.fiber = fiber;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public int getPotassium() {
		return potassium;
	}
	public void setPotassium(int potassium) {
		this.potassium = potassium;
	}
	public int getVitamin() {
		return vitamin;
	}
	public void setVitamin(int vitamin) {
		this.vitamin = vitamin;
	}
	public int getShelf() {
		return shelf;
	}
	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCups() {
		return cups;
	}
	public void setCups(double cups) {
		this.cups = cups;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	public String toString() {
		return name;
	}
	
	public static void main ( String[] args )
	{
		Cereal cereal = new Cereal("Crunchy");
		System.out.println(cereal);
	}
}
