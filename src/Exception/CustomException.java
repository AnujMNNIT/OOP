
/*The string is passed to parent class Exception’s constructor using super(). 
The constructor of Exception class can also be called without a parameter and call to super is not mandatory.*/
package Exception;



class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  


public class CustomException {
    static void validate(int age)throws InvalidAgeException{  
     if(age<18)  
      throw new InvalidAgeException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
     
   public static void main(String args[]){  
      try{  
      validate(13);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
  
      System.out.println("rest of the code...");  
  }  
}
