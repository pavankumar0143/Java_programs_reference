
public class Box {
	double length,height,breadth;

	public void setLength(double length) {
		this.length = length;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double getVolume(){
		return length*breadth*height;
	}
public static void main(String args[]){
	Box o=new Box();
	o.setBreadth(7.44);
	o.setHeight(9.9);
	o.setLength(8.22);
	System.out.println(o.getVolume());
}
}
