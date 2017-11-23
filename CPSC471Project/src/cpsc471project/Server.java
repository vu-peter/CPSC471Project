package cpsc471project;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Server {
    
    public static void main(String[] args)
    {
        int portNum = 987;
        String input;
        String output;
                
                
        try {
            ServerSocket server = new ServerSocket(portNum);
            
            Socket clientSocket = server.accept();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); 
            

            
            
            out.println("connected to server");
            out.println("ftp>");
            
           // input = in.readLine();
            
            //ls command
//            if(input.startsWith("l"))
//            {
//                
//            }
//            //get command
//            else if(input.startsWith("g"))
//            {
//                
//            }
//            //put command
//            else if(input.startsWith("p"))
//            {
//                
//            }
//            // quit command
//            else if(input.startsWith("q"))
//            {
//                
//            }
            
            
            
            
            
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    //The list commands method
    public static boolean LS(String message)
    {
        boolean success = false;
    
        return success;
    }

    //The get command method
    public static boolean get(String Message)
    {
        boolean success = false;
    
    
        return success;
    }

    //the put command method
    public static boolean put(String Message)
    {
        boolean success = false;
    
    
        return success;
    }



}


