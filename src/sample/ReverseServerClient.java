package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * A simple test for the ReverseServer client.
 */
public class ReverseServerClient {

    /**
     * The application entry point.
     *
     * @param args command line arguments
     */
    public static void main(String[] args)  {
        try {
            // The host to connect to
            String host = "localhost";
            // The port to connect to
            int port = 1234;
            // The message to send
            String message = "this is a test message";

            // Create a socket
            Socket socket = new Socket(host, port);
            // Prepare the reader and writer
            BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send the message (don't forget the newline at the end!)
            System.out.printf("Sent: %s\n", message);
            socketWriter.write(message + "\n");
            socketWriter.flush();

            // Get the response
            String response = socketReader.readLine();
            System.out.printf("Received: %s", response);

            // Cleanup the connection
            socketWriter.close();
            socketReader.close();
            socket.close();
        } catch (Exception exception) {
            System.err.printf("There was a problem with the connection: '%s'\n", exception.getMessage());
            exception.printStackTrace(System.err);
        }

    }

}