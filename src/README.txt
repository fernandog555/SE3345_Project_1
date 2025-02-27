Hello! This is my submission for project 1.

My program uses the Java JDK 23 to compile and run this program. However, I have gone ahead and tested
this program with JDK 17, and it runs just as smooth, so there should not be any problems with JDK 
version errors. I used IntelliJ IDE to develop my program. 

My project contains 5 different Java files, 4 of which are Class files and 1 Interface file, respectively:
- Main.java
- GenericSingleLinkedList.java
- Product.java
- Node.java
- IDedObject.java (Interface)

To run this program, download the zipped files and extract them. Place those files inside the IDE and run the 
program with the Main class open (If you try to run the program with any other class open, it will not run because,
Main is the access point of the program!). 




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

The program has input validation and error catching functionalities. To begin, we will input "delete" as our selection.

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
    Warning: List is empty. There is nothing to delete!

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

So far we have not added any product to the list, so the list is empty. We were presented with a error telling us so.
Lets try to enter choice "2" and input any ID value. Remember that we have not added anything to the list.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 2
    Enter ID: 123
    
    ID not found! Please try again.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Now lets select the same choice again, but this time we will input Banana as out ID.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 2
    Enter ID: Banana
    Error: Invalid input. Please enter a valid integer.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

ID should only be an integer, thus we got the invalid input error. This input validation wll be consistent
throughout the entire program. Now lets add a new product! Enter choice "3" and add ID "123". 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 3
    Enter Product ID: 123
    Enter Product Name: iPhone 16
    Enter Supplier Name: Apple
    
    Product has been added successfully!

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

We have added a product to the beginning of the list. Lets attempt to add another item, but with the same ID.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Enter your choice: 3
    Enter Product ID: 123
    Enter Product Name: AirPods
    Enter Supplier Name: Apple

    Error: Product ID already exists! Please try again.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

We have found the last error checking ability! This concludes the error checking part of this manual. Now lets 
continue with the functionality of the program. Add the AirPods back
