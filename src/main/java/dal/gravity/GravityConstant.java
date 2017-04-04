package dal.gravity;

public class GravityConstant implements GravityModel{
	
	public double gravity;
	
	public GravityConstant(double grav){
		
		this.gravity = grav;
		
	}

	public void setGravity(double grav){
		
		this.gravity = grav;
		
	}
	
	@Override
	public double getGravitationalField() {
		return this.gravity;
	}
	
}
