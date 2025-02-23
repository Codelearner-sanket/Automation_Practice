package javapackage;

public class ConstructorOverloading {
	

	ConstructorOverloading(){
		System.out.println("No parameter");	
	}
    ConstructorOverloading(int a){
    	System.out.println("int parameter");
	}
   ConstructorOverloading(String s){
	   System.out.println("String parameter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co1=new  ConstructorOverloading();
		ConstructorOverloading co2=new  ConstructorOverloading(1);
		ConstructorOverloading co3=new  ConstructorOverloading("selenium");
		
	}

}
