package one;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liufanwen
 */
public class ServerSocketEx {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket =new ServerSocket(9098);
    Socket accept = serverSocket.accept();
    BufferedReader in= new BufferedReader(
        new InputStreamReader(accept.getInputStream()));
    PrintWriter out =new PrintWriter(accept.getOutputStream(),true);
    String request,response=null;
    while((request=in.readLine())!=null){
      if("Done".equals(request)){
        break;
      }
      out.println(response);
    }
  }

}
