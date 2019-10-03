import java.io.*;
// import java.nio.file.* ;

public class Test  {

     public static void main(String[] args) {
        File f= new File("/root/ocp_java8_sybex/samy.txt");
      //   FileSystem fs = FileSystems.getDefault();
          
          System.out.println(f.exists());
          Enumeration<?>  en =System.getProperties().propertyNames();
           while( en.hasMoreElements() )
           System.out.println(en.nextElement());
}
}
