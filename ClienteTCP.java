
package clientetcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class ClienteTCP {


    public static void main(String[] args) {
        //Host del servidor
        final String HOST = "127.0.0.1";
        //Puerto del servidor
        final int PUERTO = 12000;
        
        DataInputStream input;
        DataOutputStream output;
        
        try {
            //Se crea el socket de conexion hacia el servidor
            Socket socket = new Socket(HOST, PUERTO);
            
            //Canal de comunicacion
            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());
            
            //Se realiza el envio del mensaje
            output.writeUTF("¡¡¡HOLA MUNDO!!!");
            System.out.println("El mensaje se ha enviado correctamente");
            
            socket.close();
        } catch (Exception e) {
        }
    }
    
}
