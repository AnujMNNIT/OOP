/*
 Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that
binds together code and the data it manipulates.Other way to think about encapsulation is, it is a
protective shield that prevents the data from being accessed by the code outside this shield.
 */
package Encapsulation;
/*Encapsulation can be achieved by: Declaring all the variables in the class as private 
and writing public methods in the class to set and get the values of variables.*/
class Data
{
    private String Name;
    private int age;
    Data(String Name,int age)
    {
        this.Name=Name;
        this.age=age;
    }
    void setName(String Name)
    {
        this.Name=Name;
    }
    void setAge(int age)
    {
        this.age=age;
    }
    String getName()
    {
        return this.Name;
    }
    int getAge()
    {
        return this.age;
    }    
}
public class Encapsulation
{
    public static void main(String args[])
    {
        Data data=new Data("Anuj",21);
        System.out.println(data.getName());
        System.out.println(data.getAge());
        data.setName("Anuj Singh");
        System.out.println(data.getName());
        System.out.println(data.getAge());
        /* Data Hiding
           Increased Flexibility(Can make read only or write only)
           Reusibility
           Testing
        */
        
    }
}

