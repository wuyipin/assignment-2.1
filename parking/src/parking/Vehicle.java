package parking;
import java.util.ArrayList;
public class Vehicle {
	
	int license;
	float weight;
	String size;//small big normal
	float entertime;
	float outtime;
	boolean handicapped;
	int level;
	int price;
	public Vehicle() {}
	
	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getEntertime() {
		return entertime;
	}
	public void setEntertime(float entertime) {
		this.entertime = entertime;
	}
	public double getOuttime() {
		return outtime;
	}
	public void setOuttime(float outtime) {
		this.outtime = outtime;
	}
	public boolean isHandicapped() {
		return handicapped;
	}
	public void setHandicapped(boolean handicapped) {
		this.handicapped = handicapped;
	};	
	
}


class car extends Vehicle{
	public car() {
		level=0;
		price=3;
		size="normal";
	}
	
	
}
class suv extends car{
	public suv() {
		
	}
	
	
}
class pickup extends car{
	public pickup() {

	}
}
class electric extends car{
	public electric() {
		price=0;
	}
}
class bus extends Vehicle{
	
	public bus() {
		level=1;
		price=5;
		size="large";
	}
	
	
}
class normalbus extends bus{
	
	public normalbus() {
	}
	
}
class coach extends bus{
	
	public coach() {
	}
	
}
class van extends bus{
	
	public van() {
	}
	
}
class bike extends Vehicle{
	
	public bike() {
		level=2;
		size="small";
	}
	
	
}
class motorbike extends Vehicle{
	
	public motorbike() {
		price=2;
		
	}
	
	
}
class cycle extends Vehicle{
	
	public cycle() {
		price=1;
		
	}
	
	
}