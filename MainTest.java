import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;


public class MainTest {
     public static void main(String[] args) throws IOException {
         FileInputStream fileByteStream =  null;
         Scanner inFs = null;

         fileByteStream = new FileInputStream("SampleFile.txt");
         inFs = new Scanner(fileByteStream);


    }
}
