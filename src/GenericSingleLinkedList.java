public class GenericSingleLinkedList<AnyType extends IDedObject>
{
    Node<AnyType> head;

    GenericSingleLinkedList()
    {
        // Creating a brand new linked list
        head = null;
        System.out.println("\nLinked list has been initialized.");
    } 

    void makeEmpty()
    {
        // Making the head = null disconnects the next pointer after the head while
        // clearing the data in the head, essentially making the linked list empty.
        // The Java garbage collector cleans up the disconnected nodes for us.

        head = null;
    }

    public AnyType findID(int ID)
    {
        // When we start looking for ID, we start at the head. Thus, current = head.
        Node<AnyType> current = head;

        // We check if the head is null first. If it is, return null.
        if (head == null)
        {
            return null;
        }

        // We run the while loop until base case or until we reach the end of the list.
        while(current != null)
        {
            // Check if the current node we are on is equal to the ID provided by the user.
            // If it is, return the data of that node back to the user. Otherwise, we keep
            // on looking by going to the next node and checking again.

            if (current.data.getID() == ID)
            {
                return current.data;
            }
            current = current.next;
        }

        // If we could not find the ID, return null.
        return null;
    }

    public boolean insertAtFront(AnyType x)
    {
        // We get the ID from the user in Main, then the ID gets passed into the constructor
        // of Product, which will store the ID and details. We call findID and pass on getID
        // from Product.

        // Since we are inserting at the front of the list, we just simply check
        // if the ID is not null. If it's not, we return false, and the if statement in Main
        // will print out that the ID exists, which will prevent from the node being added, and
        // will close out of this method.

        // If it's the latter, the product will be added to the list and will print out to console
        // that it has been added.

        if (findID(x.getID()) != null)
        {
            return false;
        }

        // We create a new node, and this new node will now hold the title of being the head of the
        // linked list.

        Node<AnyType> newNode = new Node<>(x);
        newNode.next = head;
        head = newNode;
        return true;
    }

    public AnyType deleteFromFront()
    {
        // We check if the head is null first. If it is, return null.
        if (head == null)
        {
            return null;
        }

        // We create a temporary object to hold the data of the head node. This will be the
        // data that will be printed out back to the user. From there, we will reassign the
        // head title to the next node, if there is one.

        AnyType deletedData = head.data;
        head = head.next;
        return deletedData;
    }

    public AnyType delete(int ID)
    {
        // We check if the head is null first. If it is, return null.
        if (head == null)
        {
            return null;
        }

        // If the ID from the first node matches the ID the user inputted, call deleteFromFront 
        // and let that method handle the logic. 
        if (head.data.getID() == ID)
        {
            return deleteFromFront();
        }

        // Assign current pointer to the list head. We do this because we need to traverse 
        // through the linked list to find the ID that the user requested.
        Node<AnyType> current = head;
        while (current.next != null)
        {
            // If we find the node that matches the ID, we create a temporary node that will hold
            // the data of the node to be deleted so we can display back the information to the user.
            if (current.next.data.getID() == ID)
            {
                AnyType removedData = current.next.data;
                current.next = current.next.next;
                return removedData;
            }
            current = current.next;
        }
        return null;
    }
    
    public void printAllRecords()
    {
        // We check if the head is null first. If it is, tell the user that it's empty.
        if (head == null)
        {
            System.out.println("Linked list is empty.");
            return;
        }

        // Traverse through the list and retrieve the data from the current node, and print it
        // out to the user, then move on to the next node  and repeat until we reach the tail of the list. 
        Node<AnyType> current = head;
        while (current != null)
        {
            current.data.printID();
            System.out.println();
            current = current.next;
        }
    }
}

