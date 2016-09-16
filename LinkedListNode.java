/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author PC
 */
public class LinkedListNode<T> {
    protected Generic<T> head;

    public LinkedListNode() {
        head= null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void insert(Generic<T> data){
        if(isEmpty()){
            head= data;
        }
        else{
            Generic<T> current= head;
            while(current.getNext()!=null){
                current=current.getNext();
            }
            current.setNext((Generic<T>) data);
        }
    }
    public void insertFirstNode(T node){
        Generic<T> newnode= new Generic<T>( node);
        newnode.next= head;
        head=newnode;
    }
    public void delete(T node){
        if(isEmpty()){
            System.out.println("DANH SÁCH RỖNG");
        }
        else{
            Generic<T> current= head;
           
               head=current.getNext();
               System.out.println("REMOVE:"+current);
           
        }
    }
    public void remove(T nod){
        if(isEmpty()){
            System.out.println("DANH SÁCH RỖNG");
        }
        else{
            Generic<T> current= head;
            Generic<T> prrent= null;
            while(current.getNext()!=null&&(!current.getData().equals(nod))){
                prrent=current;
                current=current.getNext();
            }
            
                if(current.getData().equals(nod)){
               prrent.setNext(current.getNext());
                    System.out.println("Removed:"+nod.toString());
            }
               
        }
    }
    public void print(){
        if(isEmpty()){
            System.out.println("DANH SÁCH RỖNG");
        }
        else{
            Generic<T> current= head;
            while(current!=null){
                System.out.println(current.toString());
                current=current.getNext();
            }
        }
    }
    public void find(T node){
        if(isEmpty()){
            System.out.println("Danh sach rong");
        }
        else{
            Generic<T> current= head;
            while((current.getNext()!=null)&&(!current.getData().equals(node))){
                current=current.getNext();
            }
                if(current.getData().equals(node)){
                    System.out.println("FOUND INFORMATIN:"+current.toString());
            }
                else{
                    System.out.println("FILE NOT FOUND");
                }
        }
    }
}
