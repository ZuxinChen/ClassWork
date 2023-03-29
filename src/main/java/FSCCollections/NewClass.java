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
public class NewClass {
    public static void main(String[] args) {
        System.out.println("Sum: "+getSum(10));
    }
    public static int getSum(int n){
            return (n-n%2)<=0 ? 0 : n+getSum(n-2);
    }
}
