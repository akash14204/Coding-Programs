/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_1;


class Accountbalance{

    public static void main(String[] args) {
        A current[]=new A[3];
        current[0]=new A("AKASH",183);
        current[1]=new A("ASHISH",150);
        current[2]=new A("ARJUN",100);
        
        for(int i=0;i<=2;i++){
            current[i].show();
        }        
    }

}