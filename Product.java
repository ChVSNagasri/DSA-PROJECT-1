
class Product
{
    int barcode;
    String name;
    double price;
    int quantity;

    Product(int barcode,String name,double price,int quantity)
    {
        this.barcode=barcode;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    void display()
    {
        System.out.println("Barcode: "+barcode);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("--------------------");
    }
}