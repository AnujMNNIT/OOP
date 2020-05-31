
package Object;

import java.io.Serializable;

class Anuj implements Cloneable,Serializable
{
    private String Name;
    private int age;
    Anuj(String Name,int age)
    {
        this.Name=Name;
        this.age=age;
    }
    void setName(String Name)
    {
        this.Name=Name;
    }
    int getAge()
    {
        return this.age;
    }
    String getName()
    {
        return this.Name;
    }
    void print()
    {
        System.out.println("My name is "+this.Name+" and my age is "+this.age);
    }
    public void finalize()
    {
        System.out.println("Finalize is called");
    }
    protected Anuj clone() throws CloneNotSupportedException
    {
        return (Anuj)super.clone();
    }      
}