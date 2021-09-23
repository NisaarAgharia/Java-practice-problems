package DetailedCollections;

import java.io.*;
import java.util.ArrayList;

public class SerializeDeserialize {
    String Filename;
    ArrayList<Employee> List;

    public SerializeDeserialize(String filename, ArrayList<Employee> list) {
        Filename = filename;
        List = list;
    }

    public SerializeDeserialize() {
    }

    public void serialize() {
        try {
            FileOutputStream fos = new FileOutputStream("arrList.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(List);
            oos.close();
            fos.close();
            System.out.println("Serialization Successful");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void deSerialize() {

        try {
            FileInputStream fis = new FileInputStream(Filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List = (ArrayList<Employee>) ois.readObject();

            ois.close();
            fis.close();
            System.out.println("Deserialization Successful");
            System.out.println(List);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
