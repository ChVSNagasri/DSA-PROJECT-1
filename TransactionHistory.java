class TransactionHistory
{
    TransactionNode head;

    void addTransaction(int billId,int barcode,String productName,int quantity,double amount)
    {
        TransactionNode newNode=new TransactionNode(billId,barcode,productName,quantity,amount);

        if(head==null)
        {
            head=newNode;
        }
        else
        {
            TransactionNode temp=head;

            while(temp.next!=null)
            {
                temp=temp.next;
            }

            temp.next=newNode;
        }
    }

    void displayTransactionsSorted()
    {
        if(head==null)
        {
            System.out.println("No Transactions");
            return;
        }

        int count=0;
        TransactionNode temp=head;

        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }

        TransactionNode arr[]=new TransactionNode[count];
        temp=head;
        int i=0;

        while(temp!=null)
        {
            arr[i]=temp;
            temp=temp.next;
            i++;
        }

        for(int j=0;j<count-1;j++)
        {
            for(int k=0;k<count-j-1;k++)
            {
                if(arr[k].billId > arr[k+1].billId)
                {
                    TransactionNode t=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=t;
                }
            }
        }

        System.out.println("BillID\tBarcode\tProduct\tQty\tAmount");

        for(int j=0;j<count;j++)
        {
            System.out.println(
            arr[j].billId+"\t"+
            arr[j].barcode+"\t"+
            arr[j].productName+"\t"+
            arr[j].quantity+"\t"+
            arr[j].amount);
        }
    }
}