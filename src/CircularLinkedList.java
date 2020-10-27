public class CircularLinkedList {
    //THE VARIABLE LAST IS THE TAIL OF THE CLL
    //THIS IS A LL WHEN ONLY A TAIL IS GIVEN
    public static ListNode last;


    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;

        }

    }//End of ListNode Class


    //Constructor for the CLL CLass
    public CircularLinkedList() {
        last = null;


    }


    //I am not creating this function as static
    //I would be creating an object for the circular linked list to call this function
    //This function would be responsible for creating a linked list
    public void create() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        ListNode fifth = new ListNode(20);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;//This would make it in a circular fashion
        last = fifth;//This is the tail of the circular linked list
        //If we get the last element of the circular linked list
        //It's next would be the start of the CLL
        //that is tail.next or last.next=head


    }

    //This function is used to traverse the linked list and print the nodes
    //I am not creating this function as static
    //I would be creating an object for the circular linked list to call this function
    public void print(ListNode last) {
        //When there is no nodes in CLL
        if (last == null) {
            return;
        } else {
            ListNode head = last.next;// This is to get the starting node
            //Sice the last element of the CLL is pointing to the head or the start of CLL
            //The last element would not be printed
            //So as to print the last element we have print it outside the while condition
            while (head != last) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.print(head.data);//to print the last element that is the tail of CLL
        }
    }

    //BASIC OPERATIONS IN A CIRCULAR LINKED LIST IN JAVA
    //1. ADD A NODE TO THE FRONT OF THE CLL
    //2. DELETE A NODE FROM THE REAR OF THE CLL
    //3.ADD A NODE TO THE REAR OF THE CLL
    //4. DELETE A NODE FORM THE REAR OF THE CLL


    //This function is used to add nodes to the front of the circular linked list

    public void addFront(int x) {

        if (last == null) {
            //When There is no nodes in the CLL
            //You have to create a new node
            //And reference the last node to be the new node
            ListNode newnode = new ListNode(x);
            last = newnode;
        } else {
            ListNode first = last.next; //To get the current first node
            ListNode newnode = new ListNode(x); //create a new node
            newnode.next = first; //The next of the newnode would be the first element
            last.next = newnode; //The next of the last node/tail would be the new node

        }
    }

    //This function is used to delete the front node

    public int deleteFront() {
        //There is an edge case when there is only one element
        int d = last.next.data;


        if (last == null) {
            return -999;
        } else {
            if (last.next != null) {
                ListNode first = last.next; //Gives our current first node
                ListNode second = first.next; //To get our new first node
                last.next = second; //To link our tail to our new first node

            }
            //This is an edge case when there is only one node

            else {
                ListNode head = last;
                head = last = null;

            }

        }
        return d;
    }


    //This function is used to add a new node to the Rear of the CLL

    public void addRear(int x) {
        if (last == null) {
            //When the CLL is empty
            //We create a new node and reference the tail as the new node
            ListNode newnode = new ListNode(x);
            last = newnode;
        } else {
            ListNode curr_firstNode = last.next; //Our current first node
            ListNode new_node = new ListNode(x); //creating a new node
            last.next = new_node; //inserting at the back of CLL
            new_node.next = curr_firstNode; // Making it a loop
            last = new_node;// changing our last to our new node
        }

    }


    //This is a function to delete the node from the rear of the CLL


    //Delete the node from the Rear of the circular Linked List
    //Don't Forget to check when there is only one element

    public int deleteRear() {
        //There is an edge case here when there is only one element
        ListNode head = last.next;
        ListNode temp = head;// Temporarily store the head value
        int d = last.data;
        if (head == null) {
            return -999;
        } else {
            //CHecking whether it contains only one node
            if (temp.next != null) {
                ListNode curr = head;

                while (curr.next != last) {
                    curr = curr.next;

                }
                //Now we would get the second last element to be curr
                last = curr;
                last.next = head; // or curr.next=head


            }

            //When there is only one element
            //We assign head and the last to be the same
            else {
                head = last = null;
            }


        }
        return d;


    }


    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.create();//This would create a circular linked list of 5 nodes with a head and a tail
        list.print(last);//To print the current CLL
        System.out.println();
        list.addFront(0);//To add node to the front
        list.print(last);
        System.out.println();
        System.out.println("Deleted: " + list.deleteFront());//To delete the front node
        list.print(last);
        System.out.println();
        System.out.println("Deleted: " + list.deleteFront());
        list.print(last);
        System.out.println();
        list.addRear(33);// Adding a new node at the Rear of the linked list
        list.print(last);
        list.print(last);
        System.out.println();
        System.out.println("Deleted: " + list.deleteRear());
        list.print(last);
        System.out.println("Deleted From the Front: " + list.deleteFront());
        list.print(last);
        System.out.println();
        System.out.println("Deleted From the Front: " + list.deleteFront());
        list.print(last);


    }
}
