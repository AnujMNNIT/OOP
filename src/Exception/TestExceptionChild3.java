
package Exception;

//in case subclass overridden method declares subclass exception
import java.io.*;  
class Parent3{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class TestExceptionChild3 extends Parent3{  
  void msg()throws ArithmeticException{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent3 p=new TestExceptionChild3();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}