
class TransactionNode
{
    int billId;
    double amount;
    TransactionNode next;

    TransactionNode(int billId,double amount)
    {
        this.billId=billId;
        this.amount=amount;
        next=null;
    }
}