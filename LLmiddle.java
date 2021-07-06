package gfg;
// find the middle of linked list 
public class LLmiddle {


    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }



    void printMiddle()
    {
        Node slowPtr = head;
        Node fastPtr = head;
        if(head!=null)
        {
            while(fastPtr!=null && fastPtr.next!=null)
            {
                fastPtr=fastPtr.next.next;
                slowPtr=slowPtr.next;
            }

            System.out.println("Middle element is "+slowPtr.data);
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public void printList()
    {
        Node tnode = head;
        while(tnode!=null)
        {
            System.out.print(tnode.data+" -> ");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        LLmiddle l = new LLmiddle();
        for(int i=5;i>0;i--)
        {
            l.push(i);

        }
        l.printList();
        l.printMiddle();
    }

}
