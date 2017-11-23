//
//package cpsc471project;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.net.Socket;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class Client {
//
//    public static void main(String[] args) throws IOException {
//       
//        int portNum = 987;
//        BufferedReader in;
//        PrintWriter out;
//        
//        String input;
//        String output;
//        
//        Scanner typed = new Scanner(System.in);
//        
//        Socket socket = new Socket( "localhost", portNum);
//        
//        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        out = new PrintWriter(socket.getOutputStream(), true);
//        
//        
//        
//    }
//}
