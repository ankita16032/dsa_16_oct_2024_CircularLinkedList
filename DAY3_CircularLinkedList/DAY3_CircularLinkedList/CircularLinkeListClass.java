package DAY3_CircularLinkedList;

import DAY2_LinkedList.Node;

public class CircularLinkeListClass {
	
	 Node root,last;

	    void create_list() {
	        root= last = null;//preparing with empty root
	    }
	    
	 void insert_left(int data) {
	        Node n = new Node(data);
	        if (root == null) {
	            root=last = n;//n becomes 1st so root
	            last.next=root;
	        } 
	        else {
	            n.next = root;//1
	            root = n;//2
	            last.next= root;
	        }
	        System.out.println(data + " inserted");

	    }

	    void delete_left() {
	        if (root == null) {
	            System.out.println("Empty List");
	        } else {
	        	
	            Node t;
	            t = root;//1
	            if(root==last)
	            {
	            	root=last=null;
	            }
	            else {
	            root = root.next;//2
	            last.next=root;
	            
	            }System.out.println(t.data + " deleted");
	        }
	    }

	    void insert_right(int data) {
	    	Node n = new Node(data);
	        if (root == null) {
	            root=last = n;//n becomes 1st so root
	            last.next=root;
	        } 
	        else {
	                last.next=n;    //2
	                last=n;			//2
	                last.next=root;	//3
	            }
	        System.out.println(data + " inserted");

	    }

	    void delete_right() {
	        if (root == null)
	            System.out.println("Empty List");
	        else {
	        		Node t, t2;
	        		t = t2 = root;//1
	          
	            if (root==last)//single node
	                root=last = null;
	            
	            else {
	            		while(t!=last) {
	            			t2 = t;
	            			t = t.next;
	            }
	            last=t2;
	            last.next=root; 
	        }
	            System.out.println(t.data + " deleted");
	        }   
	    }

	    void print_list() {
	        if (root == null)
	            System.out.println("List Empty");
	        else {
	            Node t = root;
	            do {
	                System.out.print("|" + t.data + "|->");
	                t = t.next;
	            }while(t!=root);
	        }
	    }
}