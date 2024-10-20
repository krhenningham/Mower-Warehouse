import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class MowerWareHouse {
    String storeName;
    ArrayList<Mower> mower;

    public MowerWareHouse(){


    }

    public String readMowerData(String SampleFile) throws  IOException{
        FileInputStream fileByteStream = null;
        Scanner inFs = null;

        fileByteStream = new FileInputStream("SampleFile.txt");
        inFs = new Scanner(fileByteStream);



    }

}
