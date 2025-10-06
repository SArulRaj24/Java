import java.util.*;

public class slnode{
    Node head;


    class Node{
        int val;
        Node next;

        Node(int data){
            val=data;
            next=null;

        }
    }

    slnode(){
        head=null;
    }
    public void insertAtBeg(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;

        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    public void insertAtPos(int pos,int val){
        if(pos==0){
            insertAtBeg(val);
        }
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=0;i<pos;i++){
            temp=temp.next;
            if(temp==null){
                throw new IllegalArgumentException();
            }
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteAtPos(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException();
        }
        if(pos==0){
            head=head.next;
        }
        Node temp=head;
        Node pre=null;

        for(int i=0;i<=pos;i++){
            pre=temp;
            temp=temp.next;
        }

        pre.next=temp.next;

        
    }

}
