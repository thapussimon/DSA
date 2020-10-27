public class SinglyLinkedList {
    public static Node head = null;

    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        head = new Node(1, node2);

//        print(head);
//        length(head);
//        System.out.println(search(100));
//        modify(5,55);
//        print(head);
//        System.out.println("Middle "+middle(head));
//        System.out.println(nthElement(9));
//        addFront(0);
//        print(head);
//        deleteFront();
//        print(head);
//        System.out.println();
//        deleteFront();
//        print(head);
//        System.out.println();
//        deleteFront();
//        print(head);
//        addRear(10);
//        print(head);
//        System.out.println();
//        addRear(20);
//        print(head);
//        deleteRear();
//        print(head);
//        deleteRear();
//        print(head);
//        addAfter(4, 300);
//        print(head);



    }

    //Traversing The array
    //Printing The nodes
    public static void print(Node head) {
        if (head == null) {
            System.out.println("The linked list is empty");
        }
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    //Finding The length of The Singly Linked list
    //Prints the length

    public static void length(Node head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        System.out.println("The length is " + c);
    }

    //Searching for a Node in Linked List
    //prints whether the node is found or not
    public static String search(int x) {
        String isFound = "NOT FOUND";
        Node temp = head;
        if (temp == null) {
            System.out.println("The linked list is empty");
        }
        while (temp != null) {
            if (temp.data == x) {
                isFound = "FOUND";
            }
            temp = temp.next;
        }
        return isFound;
    }


    //Modify The value of a node
    public static void modify(int oldVal, int newVal) {
        Node temp = head;
        if (temp == null) {
            System.out.println("The linked list is empty");
        }
        while (temp != null) {
            if (temp.data == oldVal) {
                temp.data = newVal;
            }
            temp = temp.next;
        }
    }

    //Find the middle element of The linked list
    public static int middle(Node head) {
        Node fast = head;
        Node slow = head;

        if (head == null) {
            System.out.println("The linked list is empty");
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }//The loop gets exited when fast is null
        //AT that time slow would be in mid
        //so return slow.data
        return slow.data;
    }

    //Return the Nth Element
    public static int nthElement(int pos) {
        Node temp = head;
        int c = 0;
        if (temp == null) {
            System.out.println("The linked list is empty");
        }
        while (temp != null) {
            ++c;
            if (c == pos) {
                return temp.data;
            }
            temp = temp.next;
        }
        return -1; //if the pos exceeds the number of nodes in the linked list return -1 exit code
    }


///Operations in Linked list

    //1.Adding a Node to the Front of a linked list
    //2.Delete the First Node
    //3.insert a new node at the end of a linked list
    //4.Delete the node at the end of a Linked list
    //5.Add a new node after a given node

    public static void addFront(int x) {
        if (head == null) {
            head = new Node(x, null);
        } else {
            //head is pointing to the first element in the list
            //so we create a new node such that, it is pointing to head
            //now the new node & head is pointing at the same place
            //We change head to point to the new node that we created
            Node temp = new Node(x, head);
            head = temp;
        }
    }

    //You can choose to pop of the deleted item by changing the  type to the Node or int , But in this code I chose not to
    public static void deleteFront() {
        if (head == null) {
            System.out.println("The linked list is empty");
        } else {
            int d = head.data;//Since head is pointing to the first node in linked list
            System.out.println("The Node that is deleted is " + d);
            Node temp = head.next;
            head = temp;
        }
    }

    //Inserting a new node at the end of a linked list
    //I am choosing a two pointer method for this problem, you can do whatever you like

    public static void addRear(int x) {
        Node fast = head;
        Node slow = null;
        if (head == null) {
            head = new Node(x, null);//If Head is Null we add a node and its next is pointing to null
        } else {
            while (fast != null) {
                slow = fast;
                fast = fast.next;
            }
            //when fast becomes null
            //slow would be 1 step back of null that is at the last Node
            //We create a new node and its next is null
            //The slow pointers next would be the new node created
            Node temp = new Node(x, null);
            slow.next = temp;
        }

    }

    //Deleting a node at the end of a linked list
    //You can choose to return the item that is deleted, But here I chose not to
    //Just store the last node to a value and return it if you want
    //By standard, you should return the item that is deleted
    public static void deleteRear() {
        Node fast = head;
        Node slow = null;
        if (head == null) {
            System.out.println("The linked list is empty");
        } else {
            //I am making sure that fast is sitting at the last Node
            //And slow should sit at second last node
            while (fast.next != null) {
                slow = fast;
                fast = fast.next;
            }
            slow.next = null;
        }
    }

    //Adding a new node after a given node

    public static void addAfter(int oldNode, int newNode) {
        Node temp = head;
        //If head is empty
        if (head == null) {
            System.out.println("The linked list is empty");
        }
        while (temp != null) {
            if (temp.data == oldNode) {
                Node node = new Node(newNode, temp.next);
                temp.next = node;
            }
            temp = temp.next;
        }


    }

   //Advanced Operations
  

}
