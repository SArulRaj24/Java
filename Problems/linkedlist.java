import java.util.*;
class linkedlist{
    public static void main(String[] args) {
        slnode sl=new slnode();
        sl.insertAtBeg(5);
        sl.insertAtBeg(20);
        sl.insertAtBeg(4);
        sl.insertAtPos(1,11);
        sl.display();
        System.out.println();
        sl.deleteAtPos(0);
        sl.display();
    }
}
