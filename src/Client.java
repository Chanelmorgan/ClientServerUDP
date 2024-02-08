import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {

    // class variable
    private DatagramSocket datagramSocket;
    private InetAddress inetAddress;
    private byte[] buffer;

    // constructor
    public Client(DatagramSocket datagramSocket, InetAddress inetAddress){
        this.datagramSocket = datagramSocket;
        this.inetAddress = inetAddress;
    }

}
