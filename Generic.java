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
public class Generic<T> {
    protected T data;
    protected Generic<T> next;

    public Generic() {
    }

    public Generic(T data) {
        this.data = data;
        next=null;
    }

    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public Generic<T> getNext() {
        return next;
    }

    public void setNext(Generic<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return (data+"");
    }
  
 
    
    
}
