package OverdingANDpoly;

public class Shape {
	void draw(){
		System.out.println("Drawing Shape");
	}
	void erase(){
		System.out.println("Erasing shape");
	}
}
class Triangle extends Shape{
	void draw(){
		System.out.println("Drawing triangle");
	}
	void erase(){
		System.out.println("Erasing triangle");
	}
}
class circle extends Shape{
	void draw(){
		System.out.println("Drawing circle");
	}
	void erase(){
		System.out.println("Erasing circle");
	}
}
class Square extends Shape{
	void draw(){
		System.out.println("Drawing Square");
	}
	void erase(){
		System.out.println("Erasing Square");
	}
}
class testing1{
	public static void main(String[] args) {
		Shape s=new Shape();s.draw();s.erase();
		s=new circle();s.draw();s.erase();
		s=new Square();s.draw();s.erase();
		s=new Triangle();s.draw();s.erase();
	}
}