
class CustomerQueue
{
    int queue[]=new int[50];
    int front=-1;
    int rear=-1;

    void enqueue(int customerId)
    {
        if(rear==49)
        {
            System.out.println("Queue Full");
            return;
        }

        if(front==-1)
        front=0;

        rear++;
        queue[rear]=customerId;
    }

    void dequeue()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Serving Customer: "+queue[front]);
        front++;
    }

    void display()
    {
        for(int i=front;i<=rear;i++)
        System.out.println(queue[i]);
    }
}