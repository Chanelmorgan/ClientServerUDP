import javax.xml.crypto.Data;
import java.net.DatagramSocket;

public class Server {

    /*
    UDP:
    - operates on top of IP to transmit datagrams over a networks
    - connectionless meaning no end-to-end connection is formed.
    - Avoids the overhead associated with connections, error checking, and retransmission of data
    - Fast, making it useful for query response protocols such as DNS

    Threats and Vulnerabilities:
    - Lack of verification and end-to-end connection makes it vulnerable to denial-of-service attacks.
    -UPD Flood - large volumes of spoofed UDP packets sent to multiple ports on a single server
    - DNS amplification - send UDP packets with spoofed IP address, which corresponds to the IP fo the victim, toi itS
      DNS resolvers
    - DNS Port  Scan - send UDP packets to ports on a server to determine which ports are open

     */

    // class variables
    private DatagramSocket datagramSocket;
    private byte[] buffer = new byte[256]; // why 256?

    // constructor
    public Server(DatagramSocket datagramSocket){
        this.datagramSocket = datagramSocket;
    }



}
