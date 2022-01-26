package com.company.LinkedList;

public class LinkedList {
     Node head;
     int size;

     LinkedList (){
         size=0;
     }
     class Node{
         int data;
         Node next;

         Node(int data){
             this.data=data;
             this.next=null;
             size++;
         }
     }

     public void addFirst(int data){
         Node newNode = new Node(data);
         if(head==null){
             head = newNode;
             return;
         }
         newNode.next =head;
         head = newNode;
     }

     public void addLast(int data){
         Node newNode = new Node(data);
         if(head==null){
             head =newNode;
             return;
         }
         Node currNode =head;
         while (currNode.next!=null){
             currNode = currNode.next;
         }
         currNode.next  = newNode;
     }

     public void printList(){
         if(head==null){
             System.out.println("List is Empty");
             return;
         }
         Node currNode = head;
         while(currNode !=null){
             System.out.print(currNode.data + " -->");
             currNode = currNode.next;
         }
         System.out.println("null");
     }

     public void removeFirst(){
         if(head==null){
             System.out.println("List is empty, nothing to delete");
             return;
         }
         head =this.head.next;
         size--;
     }

     public void removeLast(){
         if(head==null){
             System.out.println("List is Empty, nothin to delete");
             return;
         }
         size--;
         if(head.next==null){
             head =null;
             return;
         }
         Node currNode  =head;
         Node lastNode  =head.next;
         while (lastNode.next!=null){
             currNode = currNode.next;
             lastNode = lastNode.next;
         }
         currNode.next =null;
     }

     public void addInMiddle(int data, int index){
         if(index > size || index < 0){
             System.out.println("Invalid index value");
             return;
         }
         size++;

         Node newNode = new Node(data);
         if(head==null || index==0){
             newNode.next =head;
             head=newNode;
             return;
         }
         Node currNode = head;
         for (int i = 0; i <size; i++) {
             if(i==index){
                 Node nextNode = currNode.next;
                 currNode.next = newNode;
                 newNode.next = nextNode;
                 break;
             }
             currNode =currNode.next;

         }
     }

     public void reverseIterate(){
         if(head==null || head.next==null){
             return;
         }
         Node prevNode  =head;
         Node currNode =  head.next;
         while (currNode !=null){
             Node nextNode = currNode.next;
             currNode.next = prevNode;

             prevNode  =currNode;
             currNode =  nextNode;
         }
         head.next =null;
         head = prevNode;
     }

//     public void reverseListRecursive(Node head){
//         if(head==null || head.next==null){
//             return head;
//         }
//         Node newHead = reverseListRecursive(head.next);
//         head.next.next  = head;
//         head.next =null;
//
//         return newHead;
//     }
     public int getsize(){
         return size;
     }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(2);

        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();

        list.removeFirst();
        list.printList();

        list.addInMiddle(10,1);
        list.printList();

        list.removeLast();
        list.printList();

        list.reverseIterate();
        list.printList();

//       list.head =  list.reverseListRecursive(list.head);
//       list.printList();

        System.out.println(list.getsize());


     }

}
