
public class Book {
	private String name;
	private Author at;
	private int quantstk;
	private double price;
	public Book(String name,Author at){
		this.name=name;
		this.at=at;
	}
	public int getQuantstk() {
		return quantstk;
	}
	public void setQuantstk(int quantstk) {
		this.quantstk = quantstk;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public Author getAt() {
		return at;
	}
	public static void main(String[] args) {
		Author At=new Author("Pavan","Pavankumar@gmail.com",'m');
		Book B=new Book("MY book",At);
		B.setPrice(567.50);
		B.setQuantstk(100);
		System.out.println("Name="+B.getName()+"\n"+"Price="+B.getPrice()+"\n"+"Quantity="+B.getQuantstk());
		System.out.println("Author details");
		System.out.println("Name="+At.getName()+"\nEmail="+At.getEmail()+"\nGender="+At.getGender());
	}
	
}
