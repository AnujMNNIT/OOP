
package Exception;

/*If the superclass method does not declare an exception, subclass overridden method
cannot declare the checked exception but can declare unchecked exception.*/
import java.io.*;  
class Parent{  
  void msg(){System.out.println("parent");}  
}  
  
class TestExceptionChild1 extends Parent{  
  void msg()throws ArithmeticException{//unchecked exception declared yet no error but if IOException() i.e. checked exception was there, compile time error would be there.  
    System.out.println("child");  
  }  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild1();  
   p.msg();  
  }  
}