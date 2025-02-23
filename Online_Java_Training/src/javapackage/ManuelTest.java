package javapackage;

public class ManuelTest {

	public static void main(String[] args) {
		/*SDLC 5 steps - Requirement gathering , Analysis , Design , Coding , Testing , Deployment , 
		 * 
		 * software testing is part of software development process 
		 * software testing is an activity to detect and identify the defects in the software 
		 * the objective of the testing is to release quality product to the client 
		 * testing is art and development is task (finding is defect is art or discover a defect )
		 * 
		 *  why ?
		 *  
		 *  ensure that software is bug free 
		 *  ensure that system meets customer requirementds and software specification 
		 *  
		 *  Error - any incorrect human action that produces  aproblem in the system is called an error 
		 *  defect / bug - deviation from exepected behavior to the actual behavior of the system is called defect 
		 *  Failure - The Deviataion identified by end user while suing th esystem 	is called sysytem 
		 *  
		 *  why there are bugs in sofwtare ?/
		 *  software complexity , programming errors , changing requirements , lack of skilled testers 
		 *  
		 *  functional testing - it tests what the system does
		 *  
		 *  non -funactional testing - is a type of testing to check non -funactional aspets of a software application 
		 *  it tests how well the system perfoms 
		 *  
		 *  Verification
Definition: Verification ensures that the product is being developed correctly according to specified requirements and design. It answers the question: "Are we building the product right?"
Focus: On the process of development and intermediate work products (like design, code, etc.).
Purpose: To ensure the software complies with technical specifications and standards.
Activities:
Code reviews.
Inspections and walkthroughs.
Unit testing, integration testing.
Example: Reviewing the code of an online payment module to ensure it adheres to the security guidelines and specifications.
		 *  
		 *  
		 *  Validation
Definition: Validation ensures that the product meets the customer’s needs and expectations. It answers the question: "Are we building the right product?"
Focus: On the end product and its intended use.
Purpose: To ensure the product fulfills its business objectives and works as intended in the real-world scenario.
Activities:
Testing the software in real-world conditions.
Performing user acceptance testing (UAT).
Checking usability, performance, and reliability.
Example: Testing an e-commerce website to ensure that customers can successfully place orders, make payments, and receive confirmation emails.
		 *  
		 *  
		 *  
		 *  when should we start testing our project ?
		 *  Software testing should start early in the SDLC. 
		 *  this hels to capture and eliminate defects in early of stages of defects  i.e. requirement gathering and design phases 
		 * 
		 *  
		 *  optimizing test case ?
		 *  by using test techniques - Equivalence partioniong , Boundary vakue analysis 
		 *  
		 *  1 to 120 age valid 
		 *  invalid -ve to 0
		 *  1 to 120 - valid 
		 *  120 to more - invalid 
		 *  
		 *  -- whatever you do try to break the system of QA region rather than breaking in production 
		 *  
		 *  How are you mainting your requirements --
		 *  we are maintining RTM (Requirement Tracebility Matrics ) in which each requirements  are tracked for the closure 
		 *  you can do this in excel , ALM (older Qc ) , JIRA , 
		 *  
		 *  regression testing , restestinggg---
		 *  
		 *  Retesting
Definition: Retesting involves testing specific test cases that failed in the previous execution to verify if the defects have been fixed.
Focus: On verifying defect fixes.
		 *  
		 *  
		 *  Relation Between Retesting and Regression Testing
Retesting ensures the specific issue is resolved.
Regression testing ensures that fixing the issue hasn’t broken any other part of the application.
		 *  
		 *  
		 *  Aspect	           Retesting	                    Regression Testing
            Objective	       Verify defect fixes.	           Ensure existing features work as before.
            Scope	           Narrow (specific failed cases).	Broad (all affected functionality).
            Trigger	           Bug fix.	                       Any code change.
            Focus	          Testing the fixed area only.	   Testing the entire system's stability.
            Automation	      Rarely automated.	              Often automated.
            When Performed	  After a defect fix.	           After updates, fixes, or enhancements.
		 *  
		 * 
		 * Test plan --  1) what is in Scope and out of scope 
		 *               2) Assumption 
		 *               3)Dependencies
		 *               4) Test stratergy
		 *               Tools used - selenium / Jmeter 
		 *               5)Test Enviornment 
		 *               6)Entry Criteria / Exit Criteria 
		 *               7) RACI Metrics 
		 *               8) defect status 
		 *               
		 *defect density ratio --
		 *It is used to assess the quality and reliability of software by quantifying how many 
		 *defects are present in a given unit of software size
		 *
		 *Risk-Based Testing (RBT) is a software testing approach that prioritizes testing efforts based on the level of risk 
		 *associated with specific features, components, or areas of the software. The goal is to focus testing resources on 
		 *the parts of the system that are most likely to fail or have the highest impact if they do fail..
		 *
		 *I always give equal priority to  existing production data , where i find more defects 


		 * defect life cycle - 
		 *               
		 *               
		 * 
		 */
		
		
		

	}

}
