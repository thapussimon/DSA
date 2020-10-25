public class SinglyLinkedList {
    public static Node head=null;

    public static void main(String[] args) {
        Node node5=new Node(5,null);
        Node node4=new Node(4,node5);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        head= new Node(1,node2);
        print(head);
        length(head);
        System.out.println(search(100));
        modify(5,55);
        print(head);
        System.out.println("Middle "+middle(head));
        System.out.println(nthElement(9));
    }

    //Traversing The array
    //Printing The nodes
    public static void print(Node head){
        if (head==null){
            System.out.println("The linked list is empty");
        }
        while (head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    //Finding The length of The Singly Linked list
    //Prints the length

    public static void length(Node head){
        int c=0;
        while (head!=null){
            c++;
            head=head.next;
        }
        System.out.println("The length is "+c);
    }

    //Searching for a Node in Linked List
    //prints whether the node is found or not
    public static String search(int x){
        String isFound="NOT FOUND";
        Node temp=head;
        if (temp==null){
            System.out.println("The linked list is empty");
        }
        while (temp!=null){
            if (temp.data==x){
                isFound="FOUND";
            }
            temp=temp.next;
        }
        return isFound;
    }


    //Modify The value of a node
    public static void modify(int oldVal,int newVal){
        Node temp=head;
        if (temp==null){
            System.out.println("The linked list is empty");
        }
        while (temp!=null){
            if (temp.data==oldVal){
                temp.data=newVal;
            }
            temp=temp.next;
        }
    }

    //Find the middle element of The linked list
    public static int middle(Node head){
       Node fast=head;
       Node slow=head;

       if (head==null){
           System.out.println("The linked list is empty");
       }
       while (fast!=null && fast.next!=null){
           fast=fast.next.next;
           slow=slow.next;

       }//The loop gets exited when fast is null
        //AT that time slow would be in mid
        //so return slow.data
       return slow.data;
    }

    //Return the Nth Element
    public static int nthElement(int pos){
        Node temp=head;
        int c=0;
        if (temp==null){
            System.out.println("The linked list is empty");
        }
        while (temp!=null){
            ++c;
            if (c==pos){
                return temp.data;
            }
            temp=temp.next;
        }
        return -1; //if the pos exceeds the number of nodes in the linked list return -1 exit code
    }
























}
