
class CircularQueue
{
    int queue[]=new int[10];
    int front=-1;
    int rear=-1;

    void enqueue(int value)
    {
        if((rear+1)%10==front)
        {
            System.out.println("Queue Full");
            return;
        }

        if(front==-1)
        front=0;

        rear=(rear+1)%10;
        queue[rear]=value;
    }

    void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Checkout Counter Serving: "+queue[front]);

        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else
        front=(front+1)%10;
    }
}