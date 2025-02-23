public class Product implements IDedObject
{
    private int productID;
    private String productName;
    private String supplierName;

    public Product(int productID, String productName, String supplierName)
    {
        this.productID = productID;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    @Override
    public void printID()
    {
        System.out.println("\nProduct ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Supplier Name: " + supplierName);
    }

    @Override
    public int getID()
    {
        return productID;
    }
}
