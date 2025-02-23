package javapackage;

public class Constructor4 {
	
	int id;      // global varible 
	String name ; // global variable 
	String address;// global varible 
	
	// defaukt constructor 
	Constructor4(){
		System.out.println("hello default constructor");
	}
	
	// parametrized constructor 
	
	Constructor4(int a , String b, String c){
		
      this.id=a;
      name=b;
      address=c; 
		
	}
	
	public void displayInfo() {
		System.out.println(id+" "+name+" "+address);
	}

	public static void main(String[] args) {
		
		// default constructpr 
		Constructor4 c4=new Constructor4();
	   // parametrized constructoe 
		
		Constructor4 c5=new Constructor4(1,"john","UK");
		c5.displayInfo();
		Constructor4 c6=new Constructor4(2,"hjj","US");
		c6.displayInfo();
		
		
	}
}
