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
public class PhoneGeneric {
    protected String phone;

    public PhoneGeneric() {
    }

    public PhoneGeneric(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return phone;
    }
   
}
