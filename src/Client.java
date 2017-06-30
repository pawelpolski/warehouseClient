import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by macbookpro on 29.06.2017.
 */
public class Client {
    private Socket socket;
    private ObjectInputStream input;
    private ObjectOutputStream output;

    private String serverAdress;
    private int portNumber;

    public Client(String serverAdress, int portNumber) {
        this.serverAdress = serverAdress;
        this.portNumber = portNumber;
    }

    public ArrayList<String> getTypeListFromServer() {
        ArrayList<String> obj = null;
        try {
            socket = new Socket(serverAdress, portNumber);

            input = new ObjectInputStream(socket.getInputStream());
            output = new ObjectOutputStream(socket.getOutputStream());


            output.writeObject("GET_TYPE_LIST");
            obj = (ArrayList<String>) input.readObject();
            output.writeObject("EXIT");
            socket.close();
            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public ArrayList<Equipment> getEquipmentsFromServer() {
        ArrayList<Equipment> obj = null;
        try {
            socket = new Socket(serverAdress, portNumber);

            input = new ObjectInputStream(socket.getInputStream());
            output = new ObjectOutputStream(socket.getOutputStream());


            output.writeObject("GET_EQUIPMENTS");
            obj = (ArrayList<Equipment>) input.readObject();
            output.writeObject("EXIT");
            socket.close();
            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void addEquipmentToServer(Equipment e) {
        try {
            socket = new Socket(serverAdress, portNumber);

            input = new ObjectInputStream(socket.getInputStream());
            output = new ObjectOutputStream(socket.getOutputStream());


            output.writeObject("POST_EQUIPMENT");
            output.writeObject(e);
            output.writeObject("EXIT");
            socket.close();
            input.close();
            output.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void updateElementOnServer(int index, String text1, String text2) {
        try {
            socket = new Socket(serverAdress, portNumber);

            input = new ObjectInputStream(socket.getInputStream());
            output = new ObjectOutputStream(socket.getOutputStream());


            output.writeObject("UPDATE_ELEMENT");
            output.writeInt(index);
            output.writeObject(text1);
            output.writeObject(text2);
            output.writeObject("EXIT");
            socket.close();
            input.close();
            output.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void removeElementOnServer(int index) {
        try {
            socket = new Socket(serverAdress, portNumber);

            input = new ObjectInputStream(socket.getInputStream());
            output = new ObjectOutputStream(socket.getOutputStream());


            output.writeObject("REMOVE_ELEMENT");
            output.writeInt(index);
            output.writeObject("EXIT");
            socket.close();
            input.close();
            output.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
