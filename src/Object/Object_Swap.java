
package Object;
//How to swap two objects if we don't know about the members of class
//Call by reference 
class Anujwrap
{
    Anuj anuj;
    Anujwrap(Anuj anuj)
    {
        this.anuj=anuj;
    }
}

public class Object_Swap
{
    public static void swap(Anuj anuj1,Anuj anuj2)
    {
        Anuj a=anuj1;
        anuj1=anuj2;
        anuj2=anuj1;
    }
    public static void swap(Anujwrap aw1,Anujwrap aw2) //Method overloading
    {
        Anuj a=aw1.anuj;
        aw1.anuj=aw2.anuj;
        aw2.anuj=a;
    }
    public static void main(String args[])
    {
        Anuj anuj1=new Anuj("Anuj",21);
        Anuj anuj2=new Anuj("Anuj Singh",22);
        anuj1.print();
        anuj2.print();
        swap(anuj1,anuj2); //Here object is not getting swapped because of call by value
        anuj1.print();
        anuj2.print();
        // Create wrapper class and then swap using call by value...now wrapper class has only one data that is object of class Anuj
        Anujwrap aw1=new Anujwrap(anuj1);
        Anujwrap aw2=new Anujwrap(anuj2);
        swap(aw1,aw2);
        aw1.anuj.print();
        aw2.anuj.print();
    }
}
