class TransactionNode
{
    int billId;
    int barcode;
    String productName;
    int quantity;
    double amount;
    TransactionNode next;

    TransactionNode(int billId,int barcode,String productName,int quantity,double amount)
    {
        this.billId=billId;
        this.barcode=barcode;
        this.productName=productName;
        this.quantity=quantity;
        this.amount=amount;
        this.next=null;
    }
}