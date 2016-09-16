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
public class Main {
    public static void main(String[] args) {
      LinkedListNode<PhoneGeneric> ph= new LinkedListNode<PhoneGeneric>();
       LinkedListNode<AddressGeneric> ad= new LinkedListNode<AddressGeneric>();
     
      PhoneGeneric data= new PhoneGeneric("01235658");
      PhoneGeneric data1= new PhoneGeneric("0122345687");
       PhoneGeneric data2= new PhoneGeneric("012584268");
   Generic<PhoneGeneric> data3= new Generic<PhoneGeneric>(new PhoneGeneric("11111111111111111"));
     Generic<PhoneGeneric> data4= new Generic<PhoneGeneric>(new PhoneGeneric("22222222222"));
      Generic<PhoneGeneric> data5= new Generic<PhoneGeneric>(new PhoneGeneric("33333333333333"));
     AddressGeneric add= new AddressGeneric("QUẢNG NAM");
       AddressGeneric add1= new AddressGeneric("QUẢNG NGÃI");
         AddressGeneric add2= new AddressGeneric("QUẢNG BÌNH");
         AddressGeneric add3= new AddressGeneric("ĐÀ NẴNG");
         AddressGeneric add4= new AddressGeneric("THANH HÓA");
         AddressGeneric add5= new AddressGeneric("NGHỆ AN");
      ad.insertFirstNode(add);
     ad.insertFirstNode(add1);
     ad.insertFirstNode(add2);
      ph.insertFirstNode(data);
      ph.insertFirstNode(data1);
      ph.insertFirstNode(data2);
        ad.insertFirstNode(add3);
         ad.insertFirstNode(add4);
         ad.insertFirstNode(add5);
//      ad.insert(add);
         ph.insert(data3);
         ph.insert(data5);
         ph.insert(data4);
       
            System.out.println("IN THÔNG TIN SỐ ĐIỆN THOẠI:");
      ph.print();
          System.out.println("DANH SÁCH ĐỊA CHỈ");
      ad.print();
        System.out.println("Danh sách sau khi xóa:");
        ad.delete(add2);
        ph.delete(data);
        ad.remove(add3);
          System.out.println("IN THÔNG TIN SỐ ĐIỆN THOẠI SAU KHI XÓA:");
        ph.print();
           System.out.println("DANH SÁCH ĐỊA CHỈ SAU KHI XÓA");
        ad.print();
        System.out.println("THÔNG TIN ĐƯỢC TÌM THẤY");
        ad.find(add1);
        ph.find(data);
        
    }
}
