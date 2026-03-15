
class ProductHashTable
{
    Product table[]=new Product[100];

    void insert(Product p)
    {
        int index=p.barcode%100;
        table[index]=p;
    }

    Product search(int barcode)
    {
        int index=barcode%100;
        return table[index];
    }

    void display()
    {
        for(int i=0;i<table.length;i++)
        {
            if(table[i]!=null)
            table[i].display();
        }
    }
}