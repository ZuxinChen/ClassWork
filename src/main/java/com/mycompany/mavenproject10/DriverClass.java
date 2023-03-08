
package com.mycompany.mavenproject10;

import FSCCollections.*;


public class DriverClass {
    
    public static void main(String[] args) {
        
        MyList lst = new MyList();
        
        lst.append(5);
        lst.append(10);
        lst.append(140);
        lst.append(5);
        lst.append(101);
        lst.append(120); 
        lst.append(34);
        lst.append(10);
        lst.append(109);  
         lst.append(34);
        lst.append(10);
        System.out.println(lst);
        System.out.println(lst.size());
    }
    
}
