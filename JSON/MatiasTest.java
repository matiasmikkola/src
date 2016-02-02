package JSON;

import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by matiasmikkola on 1/28/16.
 */
public class MatiasTest {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("MatiasJSON.txt");
            FileInputStream fin = new FileInputStream("MatiasJSON.txt");

            JSONOutputStream jsonOut = new JSONOutputStream(fout);
            JSONInputStream jsonIn = new JSONInputStream(fin);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
