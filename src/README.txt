Hello! This is my submission for project 1.

My program uses the Java JDK 23 to compile and run this program. However, I have gone ahead and tested
this program with JDK 17, and it runs just as smooth, so there should not be any compatibility issues 
with different JDK versions. I used IntelliJ IDE to develop my program. 

My project consists of five Java files, four class files and one interface file:

    - Main.java
    - GenericSingleLinkedList.java
    - Product.java
    - Node.java
    - IDedObject.java (Interface)

To run this program, download the zipped files and extract them. Import the files into 
your IDE and run the program with the Main class open (if you try to run the program 
with any other class open, it will not run because Main is the access point of the program!). 

The program supports the following built in commands:

    1. Empty the list
    2. Find a product based on its unique ID
    3. Insert at the front of the list 
        a) ID can be negative, if needed.
        b) Product and Supplier can be empty when inserting a new product, if desired.
    4. Delete from the front of the list
    5. Delete a product based on its unique ID
    6. Print all records 
    7. Exit the program gracefully

The program also supports various error handling and input validation checks, such as:

    - Alphanumeric character input validation
    - Integer range input verification
    - Accessing empty/null list error handling
    - Invalid/duplicate ID number error handling
    - Valid product deletion by ID

Attached to the folder you downloaded will be a sample video that tests the functionality of the program. The 
following steps below show a sample run of how to use and test the program, which will be demonstrated inside the 
sample video too.

Once you have the program up and running, the console at the bottom of your screen should pop up. The program 
will greet you with a menu that shows you your options and a prompt to enter your selection. Below is what it 
should look like when it starts.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Linked list has been initialized.
    
    /** Operations on List **/
    
    1. Make empty
    2. Find ID
    3. Insert at Front
    4. Delete from Front
    5. Delete ID
    6. Print all Records
    7. Exit
    
    Enter your choice:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

My program has input validation and error catching functionalities. To begin, we will input "delete" as our selection.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: delete

    Error: Invalid input. Please enter a valid integer.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

The program only accepts integers from the user when selecting an option. Let try to input "8" and see what happens.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 8

    Error: Invalid choice. Please enter a number between 1 and 7.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

In our menu, there only exists options 1-7. Option 8 is not a valid option. Lets select "4".

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 4

    --- DELETE FROM FRONT ----

    Warning: List is empty. There is nothing to delete!

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

So far we have not added any product to the list, so the list is empty. We were presented with a error telling us 
so. Lets try to enter choice "2" and input any ID value. Remember that we have not added anything to the list.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 2

    --- FIND ID ----
    Enter ID: 123

    ID not found! Please try again.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Now lets select the same choice again, but this time we will input "Banana" as our ID.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 2

    --- FIND ID ----
    Enter ID: Banana

    Error: Invalid input. Please enter a valid integer.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

ID should only be a postive/negative integer, thus we got the invalid input error. This input validation wll be 
consistent throughout the entire program. Now lets add a new product! Enter choice "3" and add ID "123". 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 3

    --- INSERT AT FRONT ----
    Enter Product ID: 123
    Enter Product Name: iPhone 16
    Enter Supplier Name: Apple

    Product has been added successfully!

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

We have added a product to the beginning of the list. Lets attempt to add another item, but with the same ID.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 3

    --- INSERT AT FRONT ----
    Enter Product ID: 123
    Enter Product Name: AirPods
    Enter Supplier Name: Apple

    Error: Product ID already exists! Please try again.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Now lets continue with the functionality of the program. We can add back the AirPods, just with a different ID. 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 3

    --- INSERT AT FRONT ----
    Enter Product ID: 256
    Enter Product Name: AirPods
    Enter Supplier Name: Apple

    Product has been added successfully!

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

We are now going to add another item to the list. Theoretically, we can add as many products we want, as there is 
no cap to the number of items we can add (we are limited to RAM size but that doesnt matter for this example).

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 3

    --- INSERT AT FRONT ----
    Enter Product ID: 1024
    Enter Product Name: iPad Pro
    Enter Supplier Name: Apple
    
    Product has been added successfully!

    ....

    Enter your choice: 3

    --- INSERT AT FRONT ----
    Enter Product ID: 2048
    Enter Product Name: AirTag
    Enter Supplier Name: Apple
    
    Product has been added successfully!

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Currently, we have 4 items added to our list. To see all the items we have, we can choose option "6" to print out
all the records in the list. 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 6

    --- PRINT ALL RECORDS ----

    Product ID: 2048
    Product Name: AirTag
    Supplier Name: Apple
    
    
    Product ID: 1024
    Product Name: iPad Pro
    Supplier Name: Apple
    
    
    Product ID: 256
    Product Name: AirPods
    Supplier Name: Apple
    
    
    Product ID: 123
    Product Name: iPhone 16
    Supplier Name: Apple

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

We can also look up a product on its ID alone if we dont want to print out all the records. We can do that by
choosing option "2" on the main menu.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 2

    --- FIND ID ----
    Enter ID: 256

    Product ID: 256
    Product Name: AirPods
    Supplier Name: Apple

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Say we want to discontinue an item. We can delete items by their ID (option 5) or from the front of the list. (option 4)

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 5

    --- DELETE ID ----
    Enter ID to delete: 2048
    
    Product ID: 2048
    Product Name: AirTag
    Supplier Name: Apple

    Product deleted successfully!

    ---- OR ----

    Enter your choice: 4
    
    Product ID: 2048
    Product Name: AirTag
    Supplier Name: Apple

    First item deleted.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

If we print out all records, the AirTag is no longer there. 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 6

    --- PRINT ALL RECORDS ----
    
    Product ID: 1024
    Product Name: iPad Pro
    Supplier Name: Apple
    
    
    Product ID: 256
    Product Name: AirPods
    Supplier Name: Apple
    
    
    Product ID: 123
    Product Name: iPhone 16
    Supplier Name: apple

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Finally, if we were to go out of business, we can clear out the entire list using option "1". We can print out 
the list and see that it has been cleared. 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 1

    --- DELETE LIST ----
    The list has been deleted.

    ....

    Enter your choice: 6

    --- PRINT ALL RECORDS ----
    Linked list is empty.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

We can close out the program now using option "7". Even if we didn't clear the list before closing, all the data 
gets deleted anyways (Theres no function to save data yet).

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    Enter your choice: 7

    --- EXIT ----

    List will be deleted. Goodbye!

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

That's pretty much it for the readme. Thanks for reading if you made it down here <3