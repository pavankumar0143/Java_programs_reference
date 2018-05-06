package OverdingANDpoly;

public class Apple extends Fruit{
	Apple(String name,String taste,String size){
		super(name,taste,size);
	}
	void eat(){
		System.out.println("Name of fruit is "+name+"\nTaste is "+taste);
	}

}
