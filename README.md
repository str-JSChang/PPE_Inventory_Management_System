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
The unit of measure for inventory is the box. All receiving, recording, and distribution operations are done in boxes.
for example,the initial quantity is 100 boxes. This means:

Your system starts with 100 boxes of masks.
if a hospital orders 10 boxes of masks, you reduce your inventory from 100 boxes to 90 boxes. The focus is on tracking boxes



BELOW WILL BE THE
CHATGPT SIMPLIFIED VERSION - DO NOT JUST ONLY READ THIS AND RELY ON CHATGPT, YOU HAVE BRAIN, AND YOU'RE HUMAN, READ THE MESSSAGES ABOVE FIRST (I USE THE MESSAGES ABOVE AND ASK CHATGPT TO SUM, IF CHATGPT WRONG, MEANS I'M WRONG TOO, YOU NEED TO NOTICE THE ERROR AND COMPARING TO THE ACTUAL ASSIGNMENT QUESTION)
-----------------------------------------------------------------------------------------
Simplified Summary
Inventory Management:

Items: PPE items like Head Cover, Face Shield, Mask, Gloves, Gown, Shoe Covers.
Measurement: All quantities are measured in boxes.
Initial Inventory: Each item starts with 100 boxes recorded in a file (ppe.txt).
Entities & Relationships:

Suppliers: Each PPE item comes from exactly one supplier (only store supplier codes in ppe.txt). A supplier can supply multiple item types.
Hospitals: There are 3–4 hospitals; hospital details (hospital codes) are stored in hospitals.txt.
Users: Admins can create, modify, search, and delete users.
Transactions:

Record every inventory update (receiving from suppliers "++" or distributing to hospitals "--") in transactions.txt, including item code, supplier/hospital code, previous quantity, new quantity, and timestamp.
Include alerts or messages when stock falls below a threshold (e.g., less than 25 boxes).
GUI:

Use a JFrame for the main application window.
Organize components with JPanels (e.g., Login Page, Dashboard, Inventory Page).
Reporting & Searching:

Ability to search items by item code, supplier code, or hospital code.
Filter reports by time duration.
Implementation Tips
File Handling:

On the first run, check for and create the initial inventory file (ppe.txt) with default quantities.
Use separate text files for suppliers, hospitals, and transactions.
Data Validation:

Validate user input (e.g., check that stock is sufficient before distributing items).
Implement error handling to prompt for valid input if necessary.
Modularity:

Create separate classes for Users, PPE_Item, Supplier, Hospital, and Transaction.
Use enums (e.g., for user roles) and proper access modifiers for better encapsulation.
GUI Design:

Use JFrame for a top-level window and add JPanels to organize the UI.
Keep the UI responsive and intuitive by separating concerns (login, dashboard, inventory updates).
Time Management:

Use Java 8’s Date/Time API (e.g., LocalDateTime) for tracking inventory update times.

---------------------------------------------------------------------------------------------------
Simplified Summary & Checklist
Inventory Initialization:

Task: Create the initial PPE inventory file (ppe.txt) with 100 boxes per PPE item.
Implementation Tips:
Use Java I/O (e.g., File, FileWriter, BufferedWriter) to check if the file exists.
If not, create it and write the dummy values.
Loops: You might use a simple for loop to iterate over the list of PPE items to write their details into the file.
File Handling:

Task: Manage multiple files:
ppe.txt: Stores PPE item codes, supplier codes, and quantities.
suppliers.txt: Contains detailed supplier information.
hospitals.txt: Contains hospital details (codes, etc.).
transactions.txt: Logs every transaction with item code, supplier/hospital code, original quantity, modified quantity, and timestamp.
Implementation Tips:
Use classes from java.io (or java.nio.file) for reading/writing.
Loops: Use a while loop or for-each loop to read through files line by line.
Search Feature:

Task: Allow searching based on:
Item Code
Supplier Code
Hospital Code
Time duration (start date – end date)
Implementation Tips:
For small datasets, a linear search is sufficient.
Loops: Use a for loop (or enhanced for-each loop) to iterate through the collection of records and check each record against the search criteria.
Consider using filtering with Java Streams if you prefer a more functional style.
User Management:

Task: Enable admins to add, modify, search, and delete users.
Implementation Tips:
Create a User class and store user details in a file (e.g., users.txt).
Use a GUI form for CRUD operations.
Loops: Use loops (like for or while) to iterate over user records when performing searches or updates.
Inventory Updates (Receiving/Distribution):

Task: Update inventory when:
Receiving PPE items from suppliers (record as "++")
Distributing PPE items to hospitals (record as "--")
Implementation Tips:
Before updating, check that the stock is sufficient.
Record every update in transactions.txt including original and new quantities and the timestamp.
Loops: Use a while loop to validate input (e.g., if entered quantity exceeds available stock, keep prompting).
Alerts and Stock Monitoring:

Task: Generate an alert (or log a message) when available stock for any item drops below a threshold (e.g., 25 boxes).
Implementation Tips:
After every update, check the quantity.
Loops: A simple if condition inside a loop processing inventory items can check each item's stock level.
GUI Design:

Task: Build a user interface using:
JFrame: For the main application window (Login Page, Dashboard, Inventory Page).
JPanel: To organize and group UI components within the JFrame.
Implementation Tips:
Use ActionListeners to trigger inventory updates and file writes.
Loops: You might use loops to dynamically add components if the number of items or options is variable.
Reporting:

Task: Generate reports that include:
All inventory received/distributed within a specified time frame.
Current inventory levels sorted by item code.
Implementation Tips:
Read data into collections and sort them using Collections.sort() or Java Streams.
Loops: Use for loops to iterate over sorted collections and print or display each record.

