/*
 Like C++, Java also supports copy constructor. But, unlike C++, Java doesn’t create a default copy constructor if you don’t write your own.
 */
package Constructor;
class Anuj
{
   int age;
   String Name;
   Anuj(int age,String Name)
   {
       this.age=age;
       this.Name=Name;
   }
   Anuj(Anuj a)  //This is copy constructor used to copy data variable of object a
   {
       this.age=a.age;
       this.Name=a.Name;
   }
   void print()
   {
       System.out.println(Name+" : "+age);
   }
}
class Complex { 
  
    private double re, im; 
  
    public Complex(double re, double im) { 
        this.re = re; 
        this.im = im; 
    } 
} 
  

public class Copy_constructor
{
    public static void main(String args[])
    {
        Anuj anuj1=new Anuj(21,"Anuj Singh");
        Anuj anuj2=new Anuj(anuj1);
        anuj1.print();
        anuj2.print();
        /*
        Complex c1 = new Complex(10, 15);   
        Complex c2 = new Complex(c1);  // compiler error here because java doesn't allow default copy constructor
        */
    }
    
}
