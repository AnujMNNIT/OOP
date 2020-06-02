
package Exception;

//throws clause which describes that checked exceptions can be propagated by throws keyword.

import java.io.IOException;  
class Testthrows1{  
  
}
public class ThrowsPropagatesChecked {
    void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   ThrowsPropagatesChecked obj=new ThrowsPropagatesChecked();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}
