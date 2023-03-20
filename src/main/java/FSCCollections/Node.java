/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FSCCollections;

/**
 *
 * @author soblab
 */
public class Node {
    Node head;
    Node tail;
    Node node;
    Node data;
    Node next;
    int size = 0;
    
    public void append(int data){
        node = new Node();
        node.data = data;
        
        if(head == null){
            head = node;
            tail = node;
        }else
           node.next=head;
           head = node;
    }
}
