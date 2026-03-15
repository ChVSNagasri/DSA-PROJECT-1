
class BillingStack
{
    int stack[]=new int[50];
    int top=-1;

    void push(int billId)
    {
        top++;
        stack[top]=billId;
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println("No billing operation to undo");
            return;
        }

        System.out.println("Undo Bill ID: "+stack[top]);
        top--;
    }

    void display()
    {
        for(int i=top;i>=0;i--)
        System.out.println(stack[i]);
    }
}