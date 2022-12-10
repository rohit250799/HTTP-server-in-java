package practice;
/*Step 1: creating a network socket that can accept connections on a certain TCP port. We are using port 8080 for testing purposes.*/ 
//using ServerSocket class in Java to create a Server which can accept requests.
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SimpleHTTPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8080); //defining constant variable and it port number
		System.out.println("Listening for connection on port 8080 ....");
	    while (true){
	    	
	    	//final Socket client = server.accept();
	    	 
	    	 //accepting incoming connection by blocking call to accept() method
	    	 
	    	//Socket clientSocket = server.accept();
            //InputStreamReader isr =  new InputStreamReader(clientSocket.getInputStream()); //We can read the content of the request using InputStream opened from the client socket. It's better to use BufferedReader because the browser will send multiple lines
            //BufferedReader reader = new BufferedReader(isr);
            //String line = reader.readLine();            
            //while (!line.isEmpty()) {
                //System.out.println(line);
                //line = reader.readLine(); 
	    	
	         // 1. Read HTTP request from the client socket
	         // 2. Prepare an HTTP response
	         // 3. Send HTTP response to the client
	         // 4. Close the socket
	    	
	    //}
            try (Socket socket = server.accept()) {
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream()
                      .write(httpResponse.getBytes("UTF-8"));
            }

	}

}
}


