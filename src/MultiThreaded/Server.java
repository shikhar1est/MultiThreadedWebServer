package MultiThreaded;

import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        int port=8010;
        try{
            ServerSocket serverSocket=new ServerSocket(port);
            serverSocket.setSoTimeout(10000);
            System.out.println("Server is listening on port:"+port);
        }catch(){

        }
    }
}
