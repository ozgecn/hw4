package development;

import java.util.ArrayList;

public class Food {
	private String name;
	private double unit; //gr or ml
	private double calorie;
	

	private ArrayList<Food> foodList= new ArrayList<Food>();
	public Food(String name, double unit,double calorie) {
		setName(name);
		setUnit(unit);
		setCalorie(calorie);
		
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnit() {
		return unit;
	}
	public void setUnit(double unit) {
		this.unit = unit;
	}
	public double getCalorie() {
		return calorie;
	}
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	public ArrayList<Food> getFoodList() {
		return foodList;
	}
	public void setFoodList(ArrayList<Food> foodList) {
		this.foodList = foodList;
	}


}
