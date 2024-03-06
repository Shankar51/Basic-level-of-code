package array;

class Heart{
	private float weight;
	private int bpm;
	public Heart(float weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}
	public float getWeight() {
		return weight;
	}
	public int getBpm() {
		return bpm;
	}
		
	
}



class Brain{
	private float weight;
	private String color;
	public Brain(float weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
		
	
}
class Bike{
	private String brand;
	private float mileage;
	public Bike(String brand, float mileage) {
		super();
		this.brand = brand;
		this.mileage = mileage;
	}
	public String getBrand() {
		return brand;
	}
	public float getMileage() {
		return mileage;
	}
}

class Book{
	private String name;
	private String author;
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
		
	
}

class Student{
	Heart h =new Heart(250.5f,72);
	 Brain b=new Brain(350.5f,"gray");
	
  void hasA(Bike bi) {
	  
	  System.out.println(bi.getBrand());
	  System.out.println(bi.getMileage());
	  
  }
  
  void hasA(Book bo) {
	  
	System.out.println(bo.getName());
	System.out.println(bo.getAuthor());
	  
	  
  }
	 
	 
}


public class Agg {

	public static void main(String[] args) {
		Bike bi= new Bike("KTM",20.5f);
		Book bo = new Book("JAVA","JAMES");
		Student s = new Student();
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColor());
		s.hasA(bi);
		s.hasA(bo);

	}

}
