/*If the superclass method declares an exception, 
subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.*/
package Exception;


//subclass overridden method declares parent exception
import java.io.*;  
class Parent1{  
  void msg()throws ArithmeticException{System.out.println("parent");}  
}  
  
class TestExceptionChild2 extends Parent1{  
  void msg()throws Exception{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild2();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}
