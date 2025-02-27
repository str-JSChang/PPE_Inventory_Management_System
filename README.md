# PPE_Inventory_Management_System
The Department of Health in your state needs a computer program to manage the inventory of PPEs1 that it receives from multiple suppliers2 and distribute them to the hospitals3 that it manages. List of PPE items the department receives are listed in Table 1 below:

Item Code | Item Name
HC 		Head Cover
FS		Face Sheild
MS		Mask
GL		Gloves
GW		Gown
SC		Shoe Covers
-------------------------------------------------------------------------------------------------------------------------

Task Distribution >>

Tan Yen Xin - Member 1
a)	User Management and Initial Inventory Creation & Management
b)	Searching and Reporting Functionalities Based on the following:
1.	Item Code, Supplier Code & Hospital Code
2.	All Items received within certain time duration




Chang Jir Shen - Member 2
a)	Hospital and Supplier Creation, & Item Inventory Management
b)	Item Inventory Tracking 
1.	All Inventory received during a given time frame
2.	All Items below Re-Order Quantity
3.	All Inventory Dispatched during a given time frame.
-------------------------------------------------------------------------------------------------------------------------
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Notes:!!!!!!!!!!!!!!
- GUI System > LoginPage > Dashboard > InventoryPage | Might just only using JFrame should be enough.
  
- Item quantity in stock must MUST MEASURED IN NUMBER OF BOXES
  
- Admin should be able to add new users, modify, search and delete users.
  
- All PPE items are measured in boxes, i.e., they are received, recorded and distributed in boxes. ## This is weird.
  
- Each item is supplied by exactly one supplier. However, one supplier can supply more than one type of item. ## This totally looks like a database question.
  
- Assume that there should be minimum of three hospitals in your state.
  
- Inventory creation should be done only once and during the very first time the program is executed. (When run, items has already completed or created inside (MEANS FIXED QUANTITY? DUMMY VALUES OF ITEM? - JASON)
  
- >> Initial quantity of each item need to be recorded as 100 each in ppe.txt file (related to box? -JASON)
- You can only have 3 or 4 suppliers. You should not include supplier details in ppe.txt file. Only supplier code need to be stored in ppe.txt file

- You can only have 3 or 4 suppliers?
>>You should not include supplier details in ppe.txt file. Only supplier code need to be stored in ppe.txt file. (? -JASON

- You can only have 3 or 4 hospitals.

-----------------------------------------------------------------------------------------------------------------------
Feature:
The program should have a featore to create suppliers.txt - To store and update supplier detail (InventoryGUI)

The program should have feature for user to update item quantities everytime
<After receiving from suppliers (++) OR | OR giving to hospitals (--)

The program should be have a feature able to record the details of all updates, log/report in a text file transactions.txt. (Details of transactions;eg item ++ or --, should include item code, supplier/Hospital code, original quantity, modified quantity and date time)

The program should have a feature to create a hospitals.txt file for storing and update hospital detail, with hospital code.

The program should have a feature to record all updates in transaction.txt file (logging ++ or --)

The program should have a feature to SEARCH and PRINT the details of item of ++, and --, for any items, in a FILTERED LIST (linear search? sorting algorithm?)

The program should have a feature to track items and print>> 1) Total available quantity of item, sorted based on ascending order BY ITEM CODE ( A , B, C, D)

The program should have a feature to RECORD/LOG/MONITORED/STATUS/MESSAGE of all items when stock quantity less than 25 boxes (100 in 1 box)

The program should track available quantity for a particular item.

The program should track ITEM_RECEIVE_TIME, in a specific time period showing (START DATE- TO END-DATE) (not sure what is this talking about-Jason)
-----------------------------------------------------------------------------------------------------------------------
NOTICES!
Details of suppliers need to be inside suppliers.txt
Details of supplier doesn't need to be inside PPE.txt, !! except for supplier code need to be mention, which ++ by who

-----------------------------------------------------------------------------------------------------------------------
Test Cases:
We should able to perform adequate updates on each item(not sure box, or single quantity)
We should check the original quantity(to see available status / can use flag here) before giving to hospital (--)
We should aquire to develop a message when the quantity in stock is not enough!
We should able to indicate the current quantity in stock properly, if quantity input is invalid, retry (while loop)
-----------------------------------------------------------------------------------------------------------------------

Hot TIP:
The SEARCH is using ITEM CODE
The list are NECESSARY going to PRINT SUPPLIERS/HOSPITAL CODES and QUANTITY DISTRIBUTED(--) or RECEIVED (++) ;WITH DATE doing -- and ++ (receive and distributed)
