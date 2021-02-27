import java.io.*;
import java.net.*;
class Client
{
public static void main(String ar[])
{
try
{
Socket s=new Socket(InetAddress.getLocalHost(),1064);
BufferedReader br;
PrintStream ps;
String str;
System.out.println("enter radius");
br=new BufferedReader(new InputStreamReader(System.in));
ps=new PrintStream(s.getOutputStream());
ps.println(br.readLine());
br=new BufferedReader(new InputStreamReader(s.getInputStream()));
str=br.readLine();
System.out.println("area of circle is"+str);
br.close();
ps.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}