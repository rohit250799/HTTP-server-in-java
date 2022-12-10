# HTTP-server-in-java
This is a project where I have tried to create a simple HTTP server using the Java language. The server can listen to HTTP requests on the port 8080 
and send an appropriate response to the user.
Java doesn't have a dedicated API to create and parse HTTP requests, there is no in-built HTTP client library in JDK. 
Steps explaining what I have done in the project:
Created a network socket that can accept connections on a certain TCP port. HTTP servers usually listen on port 80 but I used a different port 8080 
for testing purposes. We can use ServerSocket class in Java to create a Server which can accept requests.
Used a blocking method which blocks until a client connects to the server. As soon as a client connect it returns the Socket object which can be used 
to read client request and send response to client. Once we are done with a client we should close this socket and get ready to accept the new incoming 
connection by calling accept() again.
