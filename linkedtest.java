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
public class linkedtest {
    private String name;
    private linkedtest lk;

    public linkedtest getLk() {
        return lk;
    }

    public void setLk(linkedtest lk) {
        this.lk = lk;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public linkedtest(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("name"+name); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        linkedtest head = new linkedtest("maivanson");
      
      linkedtest current=head;
      head=current.getLk();
        System.out.println("rm"+current.toString());
        System.out.println("mm"+head.toString());
        
    }
}
