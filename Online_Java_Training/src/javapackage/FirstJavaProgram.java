//  1st program 

/*---------------------------day 1-----------------------------
automation testing 
manuel testing 
api testing 

--- Web application >> which require internet or which is combination of web pages

-- web element present is on the web application 

-- selenium is automation testing tool 

---------------------day2-------------------------
-- java is object oriented and platform independent language 

-- JDK - contains  javac and jvm 
-- JVM -runs the program 
-- javac - it is a compiler which is responsible for to convert  the source code into bytecode 
------------------day 3--------------------------
 always main method is  required for java class execution

 if main method  is not there in our class  , we cannot execute  that class 

 java program  execute  from top to bottom order 

 --in  a single class  we can have  n number of methods 

--  JRE is  System  Library  is  collection of  jar file 

-- jar files are the collection of java files 

-- package  is collection  of class files 
-----------------------day 4 --------------
--- class can have 2 types 
predefined , user defined 

-- method can have 2 types 
predefined , userdefined 

object is superclass (Universe) 

---all class and its methods , wahtever we write in the source code , it comes under the Object ,,so its c--alled object oriented 

-- james gosling -> founder of java 

Object oriented - ->  everything in java comes under the Object class ,  thats why java is object orineted lanaguage 

platform independent - after saving the file , the class file generated in bin folder of jdk , that file contains bytecode of java , that class file will run in any machine(operating system) , thats why java is independent language 

compilation flow : - 

source code (.java file)  --> javac compiler --> bytecode(.class file )  
class file present in
 /eclipse workspace /workspace / package /.class file 

Execution flow : 


jvm will run the class file 

class loader -> bytecode verifier ->Interpreter ->JVM ->OS -> output 

class loader - it is responsible to load clss file 
bytecode verifier -it is responsible to verify the class file 
Interpreter - read the class file and pass the instruction for execution 
jvm -actually run the program by the help of OS 


data type --> 

primitive data type -> byte , char , short , int , long , float , double , boolean 

Non primitive data types -> String , Array , Interface , Enum 

byte =8 bits = 1byte 
char = 16bits = 2bytes 
short = 16bits = 2bytes 
int = 32bits = 4bytes 
long = 64bits = 8bytes      
float = 32bits = 4bytes    false (default value)
double=64bits=8bytes 
Boolean = 1bits =less than 1 byte 


comment in java is to understand the purpose of the code 


any local varibale is not a static variable

String - it is pre defined class in java 
-- string class is present in JRE system library inside java base inside java.lang package 
-- it is basically sequence of characters 

#source code - Automation test engineer written code 
#compiled code - javac compiled generated code which is converted from source code 
#compiler-it is responsible to convert source code into bytecode 
# interpereter - it is responsible to pass the execution instruction to the compiled code 
#Executable code - OS understandable code 
# Compilation - It is process of translating the source code into bytecode 

# Execution - It is process of of running compiled code to get output 


java software is platform dependent whereas java programming langauge is is platform 
independent , where platform means operating system 
        
                         |->class         -variable , methods 
package ->we can create  |->interface     - variable,methods 
                         |->enum          - varibale , methods 


package : It is java folder used to group classes , interefaces and enums.


-for Execution of program (JVM do) always check the main method , but while compilation 
main method is not needed  







*/

// we cannot execute java program without main method 
package javapackage;

public class FirstJavaProgram {
// intaccessmidifier   keyword return type  mainmethod string class argument (command line argument)
 int a= 1; // global varible              class level varibale 
 static int b= 4; // static variable    we define in front of global varibale // this will get memory allocation after class loading 
 // any local variable is not static variable 
	public static void main(String[] args) {
		int b= 2; // local varibale 
		System.out.println("Hello world");
		
		String s= "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		// Integer to string conversaion 
		
		int z= 5;
		String t=String.valueOf(z);
		
		String st="Selenium";
		// calculate the length of  string 
		System.out.println(st.length());
	}

	
/*      Source code - automation test engineer 
 * comipled code - javac compiler generated code which is converted from source code 
 * compiler - it is responsible to convert the source code into bytecode 
 * interpreter - it is responsible to pass the execution instrcution to copiled code 
 * exectubale code - OS understable code 
 * compilation - it is process od translating the source code into bytecode 
 * execution - it is process of running compiled to get output 
 * 
 *
 *In package , we can create class , interface , enum 
 *
 *Package - it is java folder used to group classes interfaces and enums also .
 *class / interface / Enum - all these are java files used to group java logic 
 */
}
