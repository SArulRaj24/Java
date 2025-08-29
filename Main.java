class ListNode
{
    public int data;
    public ListNode next;
    public ListNode(int data, ListNode next)
    {
        this.data=data;
        this.next=next;
    }
    public String toString()
    {
        return data+" "+next;
    }
    
}
class MyList
{
    public ListNode head;
    public void insertAtEnd(int data)
    {
        ListNode newNode=new ListNode(data,null);
        if(head==null)
        {
            head=newNode;
            return;
        }
        ListNode curNode=head;
        while(curNode.next!=null)
        {
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }
    public void insertAtBeg(int data)
    {
        ListNode newNode=new ListNode(data,null);
        if(head==null)
        {
            head=newNode;
            return;
            
        }
        newNode.next=head;
        head=newNode;
    }
    public void delAtBeg()
    {
        head=head.next;
    }
    public void delAtEnd()
    {
        if(head==null || head.next==null)
        {
            head=null;
            return;
            
        }
        if(head.next.next==null)
        {
            head.next=null;
            return;
        }
        ListNode curNode=head;
        while(curNode.next.next!=null)
        {
            curNode=curNode.next;
        }
        curNode.next=null;
    }
    
     public int middleNode() {
        ListNode temp = head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
            
        }
        temp=head;
        for(int i=0;i<cnt/2;i++)
        {
            temp=temp.next;
        }
        return temp.data;
    }

    
    public void display()
    {
        ListNode curNode=head;
        while(curNode!=null)
        {
            System.out.print(curNode.data+" ");
            curNode=curNode.next;
        }
        System.out.println();
    }
    
}
// 5,900 10,1000-> 20,1004 -> 30,1008 -> 40,null
public class Main
{
	public static void main(String[] args) {
	   MyList m=new MyList();
	   m.insertAtEnd(10);
	   m.insertAtEnd(20);
	   m.insertAtEnd(46);
	   m.display();
	   m.insertAtEnd(30); 
	   m.display();
	   m.insertAtBeg(5);
	   m.display();
	   m.delAtBeg();
	   m.display();
	   m.delAtEnd();
	   m.display();
	   m.middleNode();
       System.out.println(m.middleNode());
	   m.display();
	    

       
    }
}