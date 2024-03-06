package array;

class charger{
	private String brand;
	private float voltage;
	public charger(String brand,float voltage) {
		
		super();
		this.brand=brand;
		this.voltage = voltage;	
	}
	
	public String getbrand() {
		
		return brand;
		
	}
	
	public float getvoltage() {
		
		return voltage;
	}
	
	
	}


class OS{
	
	private String Name;
	private float Size;
	public OS(String name, float size) {
		super();
		this.Name = name;
		this.Size = size;
		
	}
	public String getName() {
		return Name;
	}
	public float getSize() {
		return Size;
	}
}

 class mobile{
	 
  OS os	= new OS("Anroid",512); 
  
  
  void hasA(charger c)
  {
	System.out.println(c.getbrand());  
	
	System.out.println(c.getvoltage());
	  
  }
  
	 
 }

public class Doubtpractice {

	public static void main(String[] args) {
		
		charger c = new charger("samsumg",24.5f);
		
		mobile m = new mobile();
		
		System.out.println(m.os.getName());
		
		System.out.println(m.os.getSize());
		m.hasA(c);
		
		
		m=null;
		
	//System.out.println(m.os.getName());
		
	//	System.out.println(m.os.getSize());
		System.out.println(c.getbrand());
		System.out.println(c.getvoltage());

						
		 }
		   
}
