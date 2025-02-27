# PPE_Inventory_Management_System

Course Learning Outcomes: 

CLO1
	Upon completion of this assignment, you should be able to:
Explain Java programming language and oops concepts(C2,PLO1)
CLO2	Build a moderate to advanced stand-alone GUI applications using java concepts(C3,PL02)
CLO3
	Demonstrate the use of java concepts and their functionalities in the existing system(A3,PL05)


1.0	COURSEWORK TITLE:
Personal Protective Equipment (PPE) INVENTORY MANAGEMENT SYSTEM 

2.0	COURSEWORK INTRODUCTION & DESCRIPTION
The Department of Health in your state needs a computer program to manage the inventory of PPEs1 that it receives from multiple suppliers2 and distribute them to the hospitals3 that it manages. List of PPE items the department receives are listed in Table 1 below:
Table 1: PPE Items
Item Code	Item Name
HC	Head Cover
FS	Face Shield
MS	Mask
GL	Gloves
GW	Gown
SC	Shoe Covers
Member	Functionalities
Member 1	a)	User Management and Initial Inventory Creation & Management
b)	Searching and Reporting Functionalities Based on the following:
1.	Item Code, Supplier Code & Hospital Code
2.	All Items received within certain time duration
Member 2	c)	Hospital and Supplier Creation, & Item Inventory Management
d)	Item Inventory Tracking 
1.	All Inventory received during a given time frame
2.	All Items below Re-Order Quantity
3.	All Inventory Dispatched during a given time frame.


The inventory system must be programmed in Java Language. Users of the program need to have a GUI system where a valid user ID and password is required to login to the system. Your team have been recruited for the same. Both members are required to put in equal efforts and therefor, following will be the Workload Matrix for both the members:

You are required to write the Java Application (in GUI) with following features and submit the project in a zip File (by exporting your project to a zip file).

2.1	User Management & Initial Inventory Creation
All users and their details must be stored in users.txt file. The details for each user should include user ID, name, password, userType (admin or staff). Other relevant details can also be recorded. 
All items and its details need to be recorded in ppe.txt file. The details for each item should include item code, supplier code and quantity in stock (measured in number of boxes). Other relevant details can also be recorded.
•	All users must have valid (unique) user ID and a password. Admin should be able to add new users, modify, search and delete users.
•	All PPE items are measured in boxes, i.e., they are received, recorded and distributed in boxes. 
•	Each item is supplied by exactly one supplier. However, one supplier can supply more than one type of item.
•	Assume that there should be minimum of three hospitals in your state.
Important Note:  
i.	Inventory creation should be done only once and during the very first time the program is executed. Initial quantity of each item need to be recorded as 100 each in ppe.txt file during this time. The program should prompt for all inputs for creating this file initially.
ii.	You can only have 3 or 4 suppliers. You should not include supplier details in ppe.txt file. Only supplier code need to be stored in ppe.txt file. 
iii.	The program should have a feature to create suppliers.txt file for storing and updating supplier details.

2.2	Item Inventory Update
The program should have a feature for user to update the item quantities every time after receiving from suppliers (increase in quantity) or distributing to the hospitals (decrease in quantity). You should record the details of all the updates in a text file transactions.txt. Details of transactions (i.e. items received and distributed) should include item code, supplier code/Hospital code, quantity received/quantity distributed, and date-time.

Important Note:  
1)	Details of suppliers need to be stored in suppliers.txt file. 
2)	When testing the program, you should perform adequate updates on each item. This is to prove whether the feature is correctly functioning. 
3)	Before distributing any item to hospitals, the program should check for available quantity in stock. User need to be notified if the quantity in stock is insufficient. The program should also indicate the current quantity in stock for the user to retry with appropriate quantity.
4)	The program should have a feature to create hospitals.txt file for storing and updating hospital details. Include hospital code for each of them.  You can only have 3 or 4 hospitals.
5)	Record all updates in transaction.txt file.

2.3	Item Inventory Tracking
a)	The program should have options to track items and print:
b)	Total available quantity of all items sorted in ascending order by item code.
c)	Records of all items that has stock quantity less than 25 boxes.
d)	Track available quantity for a particular item.
e)	Track item received during a specific time period (start-Date to end-Date)

2.4	Search Functionalities
a)	The program should have options to search and print the filtered list 
b)	For details of items distribution for any particular item.
c)	For details of items received for any particular item.

Important Note:  
i.	The search should be done by using item code.
ii.	The list should include suppliers/hospital codes and quantity distributed or received with date distributed/received.
iii.	If the item has been received/distributed to the same supplier/hospital for more than once, then their quantities have to be summed up together.


3.0	OBJECTIVE OF THIS COURSEWORK

To evolve the ability to develop a system based on Object-Oriented programming.

4.0	LEARNING OUTCOME

At the end of this coursework, you should be able to:
•	CLO1 - Explain Java programming language and oops concepts(C2,PLO1)
•	CLO2 - Build a moderate to advanced stand-alone GUI applications using java concepts(C3,PL02)
•	CLO3 - Demonstrate the use of java concepts and their functionalities in the existing system(A3,PL05)

5.0	TYPE
Group Assignment (2 members in a group)

6.0	GENERAL REQUIREMENTS
•	You are required to carry out extra research for your application system and document any logical assumptions you made after the research. You are required to research about Java APIs used in your assignment.
•	The program submitted should compile and be executed without errors.
•	Validation for input should be done for each entry from the users to avoid logical errors. 
•	The implementation code must highlight the use of object-oriented programming concepts as required by the solution.
•	Students should use text files for storing and retrieving data required for the system.
•	Not allowed to use any database tools like access / oracle etc.
•	In a situation where a student:
-	Failed to attempt the assignment demonstration, overall marks awarded for the assignment will be adjusted to 50% of the overall existing marks.
-	Found to be involved in plagiarism, the offence will be dealt in accordance to APU regulations on plagiarism.

7.0	DELIVERABLES
•	The system with complete code to be submitted in the Moodle.
•	Report document in softcopy form to be submitted in the Moodle.
•	Submission deadline: As per specified in Moodle





8.0	DOCUMENTS: COURSEWORK REPORT
•	As part of the assessment, you must submit the project report in softcopy form, which should have the following format: 
A)	Cover Page: 
All reports must be prepared with a front cover. A protective transparent plastic sheet can be placed in front of the report to protect the front cover. The front cover should be presented with the following details:
•	Module
•	Coursework Title
•	Intake
•	Group member (Student name and ID)
•	Date Assigned (the date the report was handed out).
•	Date Completed (the date the report is due to be handed in).

B)	Contents: 
•	Description and justification of the design and the implementation code which illustrate the object oriented programming concepts incorporated into the solution
•	A 2000-word report based on the object-oriented topic research  

C)	Conclusion 

D)	References
•	The font size used in the report must be 12pt and the font is Times New Roman. Full source code is not allowed to be included in the report. The report must be typed and clearly printed.
•	You may source algorithms and information from the Internet or books. Proper referencing of the resources should be evident in the document.
•	All references must be made using the APA referencing system.
•	List of references at the end of your document or source code must be specified.
 

9.0	ASSIGNMENT ASSESSMENT CRITERIA
The assignment assessment consists of three components: 1. Coding/Implementation, 2. Documentation & Report Format, and 3. Presentation.  Details of the allocation for each component are as follows:

Component	Weighting
Coding/implementation  
Documentation & Report Format
Presentation		40%
10%
10%
 

10.0	DEVELOPMENT TOOLS
The program must be written in Java language and you can use any Java development IDE as a tool but the back-end data store must be .txt files.



11.0	ACADEMIC INTEGRITY 
-	You are expected to maintain the utmost level of academic integrity during the duration of the course. 
-	Plagiarism is a serious offence and will be dealt with according to APU and Staffordshire University regulations on plagiarism.

12.0	Performance Criteria
Distinction
•	This grade will be assigned to work which solution meets more than 75% of the basic requirements. 
•	The program should compile and run with no errors.
•	Clear evidence of appropriate usage of advanced concepts of Java such as interfaces, packages, and abstract classes. Work at this level has to show appropriate use of basic programming concepts with appropriate use of features not presented in class. 
•	Program must be a unique solution. 
•	All documentation requirements must be met professionally with referencing done appropriately. 
•	During presentation, the student should be able to open and execute the program. Student should also be able to demonstrate and rationalize the need for certain codes. Also be able to answer the questions correctly with detailed explanation.
Credit
•	This grade will be assigned to work which solution meets more than 65% of the basic requirements. 
•	The program should compile and run with no errors.
•	Clear evidence of appropriate usage of basic programming concepts such as looping, control structure, and array. 
•	Program must be a unique solution. 
•	All basic documentation requirements met. Referencing was done but with errors.
•	During presentation, the student should be able to open and execute the program. Student should also be able to explain most of the work produced. Also be able to answer the questions correctly.
Pass
•	This grade will be assigned to work which is considered to be of average standard and which meets more than 50% of the basic requirements listed above. 
•	The program should compile with no errors or run when executed but with some errors. 
•	Work at this level must provide clear evidence of appropriate usage of basic programming concepts such as looping, control structure, and arrays. 
•	Referencing was done but with errors. 
•	During presentation, the student should be able to open and execute the program. Student should also be able to explain the work produced. Also be able to answer most questions correctly.
Marginal Fail
•	Work at this level will generally be of low standard where it may even fail to meet less than 50% of the basic requirements listed above. 
•	The program should compile with no errors and run when executed but with some major errors. 
•	Work at this level must provide clear evidence of some usage of basic programming concepts such as looping, control structure, and arrays. 
•	No referencing was done. 
•	During presentation, the student should be able to open and execute the program. Student barely able to explain the work produced and could not answer most questions correctly.
Fail
•	Work at this level will generally be of low standard where it may even fail to meet less than 40% of the basic requirements listed above. 
•	The program does not compile and/or run when executed but with some major errors. 
•	Work at this level must show at least little usage of basic programming concepts such as looping, control structure, and arrays. 
•	Barely any documentation done. 
•	During presentation, the student not able to open and execute the program. Student also not able to explain the work produced and could not answer any of the questions asked.

