package development;
import development.NutrionType;

public class Nutrion {

	private String name;
	private double unit; //gr or ml
	private double calorie;
	private NutrionType nutrionType;
	
	public Nutrion(String name,double unit,double calorie) {
		if (name==null) {
			this.name="No name given";
		}else {
			this.name=name;}
		
		if(unit<=0) {
			this.unit=0;
		}else {
			this.unit=unit;
		}
		
		if(calorie<=0) {
			this.calorie=0;
		}else {
			this.calorie=calorie;
		}
	}
	
	public String getName() {return name;}
	public double getUnit() {return unit;}
	public double getCalorie(){return calorie;}
}
