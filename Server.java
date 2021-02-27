import java.io.*;
import java.net.*;
class Server
{
public static void main(String ar[])
{
try
{
ServerSocket ss=new ServerSocket(1064);
System.out.println("waiting for client request");
Socket s=ss.accept();
BufferedReader br;
String str;
PrintStream ps;
br=new BufferedReader(new InputStreamReader(s.getInputStream()));
str=br.readLine();
System.out.println("received radius");
double r=Double.parseDouble(str);
double area=3.14*r*r;
ps=new PrintStream(s.getOutputStream());
ps.println(String.valueOf(area));
br.close();
ps.close();
s.close();
ss.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}