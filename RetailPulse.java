
import java.util.Scanner;
public class RetailPulse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        ProductHashTable products=new ProductHashTable();
        TransactionHistory history=new TransactionHistory();
        BillingStack stack=new BillingStack();
        CustomerQueue queue=new CustomerQueue();
        CircularQueue counters=new CircularQueue();
        MaxHeap heap=new MaxHeap();
        SalesSorter sorter=new SalesSorter();
        

        int billCounter = 1000; 

        int choice;

        do
        {
            System.out.println("1 Add Product");
            System.out.println("2 Search Product");
            System.out.println("3 Add Transaction");
            System.out.println("4 Show Transactions");
            System.out.println("5 Undo Billing");
            System.out.println("6 Add Customer to Queue");
            System.out.println("7 Serve Customer");
            System.out.println("8 Insert Sales Data");
            System.out.println("9 Sort Sales");
            System.out.println("10 Exit");

            choice=sc.nextInt();

            switch(choice)
            {
                case 1:

System.out.println("Enter Barcode");
int b = sc.nextInt();

System.out.println("Enter Name");
sc.nextLine();
String n = sc.nextLine();

System.out.println("Enter Price");
double p = sc.nextDouble();

System.out.println("Enter Quantity");
int q = sc.nextInt();

Product prod = new Product(b,n,p,q);
products.insert(prod);

break;

                case 2:

                System.out.println("Enter Barcode");
                int search=sc.nextInt();

                Product result=products.search(search);

                if(result!=null)
                result.display();
                else
                System.out.println("Product not found");

                break;
                   case 3:

int billId = billCounter++;

System.out.println("\n=========== RETAILPULSE BILL ===========");
System.out.println("Bill ID : " + billId);
System.out.println("----------------------------------------");

double totalBill = 0;
char more = 'y';   // declare and initialize

do
{
    System.out.println("Enter Barcode");
    int barcode = sc.nextInt();

    Product product = products.search(barcode);

    if(product == null)
    {
        System.out.println("Product not found");
        continue;
    }

    System.out.println("Enter Quantity");
    int qty = sc.nextInt();

    double amount = product.price * qty;

    totalBill += amount;

    history.addTransaction(billId,barcode,product.name,qty,amount);

    System.out.printf("%-10s %-15s %-5s %-8s\n",
            "Barcode","Product","Qty","Amount");

    System.out.printf("%-10d %-15s %-5d %-8.2f\n",
            barcode,product.name,qty,amount);

    System.out.println("----------------------------------------");

    System.out.println("Add another product? (y/n)");
    more = sc.next().charAt(0);

} while(more=='y' || more=='Y');

stack.push(billId);

System.out.println("Total Amount : " + totalBill);
System.out.println("========================================");

break;
                case 4:
history.displayTransactionsSorted();
break;

                case 5:

                stack.pop();
                break;

                case 6:

                System.out.println("Enter Customer ID");
                int cid=sc.nextInt();
                queue.enqueue(cid);

                break;

                case 7:

                queue.dequeue();
                break;

                case 8:

                System.out.println("Enter Sales Value");
                int value=sc.nextInt();
                heap.insert(value);

                break;

                case 9:

                int arr[]=new int[5];

                for(int i=0;i<5;i++)
                arr[i]=sc.nextInt();

                sorter.bubbleSort(arr,5);
                sorter.display(arr,5);

                break;
            }

        }while(choice!=10);
  sc.close();
    }
}