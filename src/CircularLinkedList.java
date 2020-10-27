public class CircularLinkedList {
    public static ListNode last;


    public class ListNode{
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;

        }

    }//End of ListNode Class

    public CircularLinkedList() {
        last=null;


    }

    //I am not creating this function as static
    //I would be creating an object for the circular linked list to call this function
    //This function would be responsible for creating a linked list
    public void create(){
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(10);
        ListNode fourth=new ListNode(15);
        ListNode fifth=new ListNode(20);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=first;//This would make it in a circular fashion
        last=fifth;//This is the tail of the circular linked list
        //If we get the last element of the circular linked list
        //It's next would be the start of the CLL
        //that is tail.next or last.next=head


    }
    //I am not creating this function as static
    //I would be creating an object for the circular linked list to call this function
    public void print(ListNode last){
        //When there is no nodes in CLL
        if (last==null){
            return;
        }else{
            ListNode head=last.next;// This is to get the starting node
            //Sice the last element of the CLL is pointing to the head or the start of CLL
            //The last element would not be printed
            //So as to print the last element we have print it outside the while condition
            while (head!=last){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.print(head.data);//to print the last element that is the tail of CLL
        }
    }


    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.create();//This would create a circular linked list of 5 nodes with a head and a tail
        list.print(last);


















    }
}
