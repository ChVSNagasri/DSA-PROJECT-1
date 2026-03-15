
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
                int b=sc.nextInt();

                System.out.println("Enter Name");
                String n=sc.next();

                System.out.println("Enter Price");
                double p=sc.nextDouble();

                System.out.println("Enter Quantity");
                int q=sc.nextInt();

                Product prod=new Product(b,n,p,q);
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

                System.out.println("Enter Bill ID");
                int bill=sc.nextInt();

                System.out.println("Enter Amount");
                double amt=sc.nextDouble();

                history.addTransaction(bill,amt);
                stack.push(bill);

                break;

                case 4:

                history.displayTransactions();
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

    }
}