
package Object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author anuj
 */
public class Serialization
{
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Anuj A=new Anuj("Anuj Singh",20); //Class Anuj should be serializable
        //Here writing the object from file...............................................
        FileOutputStream fo = new FileOutputStream("file.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fo); 
        oos.writeObject(A); 
        oos.close(); 
        fo.close(); 
        //Here reading object from file...................................................
        FileInputStream f = new FileInputStream("file.txt"); 
        ObjectInputStream ois = new ObjectInputStream(f); 
        Anuj anuj = (Anuj)ois.readObject();
        System.out.println(anuj.getName());
    }   
}
