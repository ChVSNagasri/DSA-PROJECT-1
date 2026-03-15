
class MaxHeap
{
    int heap[]=new int[50];
    int size=0;
    void insert(int value)
    {
        size++;
        heap[size]=value;

        int current=size;

        while(current>1 && heap[current]>heap[current/2])
        {
            int temp=heap[current];
            heap[current]=heap[current/2];
            heap[current/2]=temp;

            current=current/2;
        }
    }

    void display()
    {
        for(int i=1;i<=size;i++)
        System.out.println(heap[i]);
    }
}