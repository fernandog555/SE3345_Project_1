public class Node<AnyType extends IDedObject>
{
    Node<AnyType> next;
    AnyType data;

    Node(AnyType data)
    {
        this.data = data;
        this.next = null;
    }
}