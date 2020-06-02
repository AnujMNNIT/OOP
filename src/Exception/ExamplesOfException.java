
package Exception;


public class ExamplesOfException {
    public static void main(String []args){
        int a=50/0;//ArithmeticException 
        
        String s=null;  
        System.out.println(s.length());//NullPointerException  
        
        s="abc";  
        int i=Integer.parseInt(s);//NumberFormatException
        
        int[] arr;
        arr=new int[10]; 
       arr[10]=50; //ArrayIndexOutOfBoundsException  
     }
   //note that program stops with ecounter of first exception. 
}
