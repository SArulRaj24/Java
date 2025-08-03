package linkedlist;
public class slnode {
    Node head;
    class Node{
        int value;
        Node next;

        Node(int data){
            value=data;
            next=null;
        }
    }

    slnode(){
        head=null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

