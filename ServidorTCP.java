
package servidortcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author rober
 */
public class ServidorTCP {

    public static void main(String[] args) {
        ServerSocket servidor;
        Socket socket;
        DataInputStream input;
        DataOutputStream output;
        
        //Puerto del servidor
        final int PUERTO = 12000;
        
        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor TCP encendido");
            
            while (true) {                
                //Se espera la conexion de un cliente
                socket = servidor.accept();
                System.out.println("Un cliente se ha conectado "+socket.getPort());
                
                input = new DataInputStream(socket.getInputStream());
                
                
                //Leemos el mensaje que se envio del cliente
                String mensaje = input.readUTF();
                System.out.println(mensaje);
                
                //Finalmente cerramos la conexion con el cliente
                socket.close();   
            }
        } catch (Exception e) {
        }
        
    }
    
}
