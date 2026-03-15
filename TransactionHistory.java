
class TransactionHistory
{
    TransactionNode head=null;

    void addTransaction(int billId,double amount)
    {
        TransactionNode newNode=new TransactionNode(billId,amount);

        if(head==null)
        head=newNode;
        else
        {
            TransactionNode temp=head;
            while(temp.next!=null)
            temp=temp.next;

            temp.next=newNode;
        }
    }

    void displayTransactions()
    {
        TransactionNode temp=head;

        while(temp!=null)
        {
            System.out.println("Bill ID: "+temp.billId+" Amount: "+temp.amount);
            temp=temp.next;
        }
    }
}