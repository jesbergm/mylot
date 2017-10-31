import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by jesperbergman on 2017-10-31.
 */
public class IPFinder {
    public static void main(String[] args) {
        String host;
        Scanner input = new Scanner(System.in);

        System.out.println("\n\nEnter host name: ");
        host = input.next();
        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println("IP Adress: " + address.toString());

        } catch (UnknownHostException e){
            System.out.println("Couldn't find host =(");
        }
    }
}
