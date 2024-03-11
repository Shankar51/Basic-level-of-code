


public class Test {
	
	public static void swap(Integer i,Integer j) {
		
		Integer temp=new Integer(i);
		i=j;
		j=temp;
		
		System.out.println(i+" "+j);
	}
	
	public static void main(String[] args) {
		Integer i=new Integer(5);
		Integer j=new Integer(10);
		swap(i,j);
		System.out.println(i+" "+j);
		
		

		

		
		
	}

}



