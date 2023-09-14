
package ex52;
import java.util.*;
import java.util.Stack;

class node{
    int d;
    node next;
    node(int x){
        d=x;
        next=null;
    }
}

public class Ex52 {
    
    public static node reverse(node head){
        if(head==null || head.next==null)
            return head;
    Stack<node>s= new Stack<>();
    node cur=head;
    while(cur!=null){
    s.push(cur);
    cur=cur.next;
    }
    node new1=s.pop();
    cur=new1;
    while(!s.isEmpty()){
        cur.next=s.pop();
        cur=cur.next;
    }
    cur.next=null;
    return new1;
}
    public static void print(node head){
        node cur=head;
        while(cur!=null){
        System.out.println(cur.d+" ");
        cur=cur.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        node head= new node(1);
        head.next=new node(2);
        head.next.next=new node(3);
        head.next.next.next=new node(4);
        print(head);
        head=reverse(head);
        print(head);
    }
    
}
