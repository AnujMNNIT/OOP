
package Object;
//anonymous objects are created but not instantiated
/*They are used for immediate method calling.
They will be destroyed after method calling.
They are widely used in different libraries. For example, in AWT libraries, they are used to perform some action on capturing an event(eg a key press).*/
public class Anunymouus_object
{
   public static void main(String args[])
   {
       System.out.println(new Anuj("Anuj",15).getName());
   }
}
/*btn.setOnAction(new EventHandler()
{
    public void handle(ActionEvent event)
    {
        System.out.println("Hello World!");
    }
});*/