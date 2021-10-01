/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_sde;

/**
 *
 * @author Admin
 */
public class Java_sde {

    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        
//        int n1=0,n2=1,n3,i,count=10;
//        
//        System.out.println(n1+"\n"+n2);
//        
//        for(i=0;i<count;i++)
//        {
//            n3 =  n1+n2;
//            System.out.println(n3);
//            
//            n1 = n2;
//            n2 = n3;
//        }
//    }
    static int n1=0, n2=1, n3=0;
    static void printFibonacci(int count)
    {
        if(count>0){
        n3 = n1+n2;
        n1=n2;
        n2=n3;
        System.out.println(" "+n3);
        
        printFibonacci(count-1);
        }
       
    }
    
    public static void main(String[] args) {
        
        int count=10;
        
        System.out.print(n1+ " "+ n2);
        
        printFibonacci(count-2);
        
        
        
    }
 
    
}
