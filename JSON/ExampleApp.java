package JSON;

import org.quickconnectfamily.json.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;


public class ExampleApp {


    public static void main(String[] args){

        try {
        	/*
        	 * JSON file IO example.  Socket IO would be done the same way
        	 * except that the output and input streams would be retrieved
        	 * from a socket rather than created.
        	 */
            FileOutputStream fout = new FileOutputStream("Testing.txt");
            FileInputStream fin = new FileInputStream("Testing.txt");

            JSONOutputStream jsonOut = new JSONOutputStream(fout);
            JSONInputStream jsonIn = new JSONInputStream(fin);

			/*
			 * An example serializable to be written out.  This could be
			 * any Java Collection or Map if you want to write out groups
			 * of serializables.
			 */
            Date exampleDate = new Date();
            TestObject anObject = new TestObject("blah", 3, exampleDate);

            jsonOut.writeObject(anObject);

            //since I wrote out an object I get a HashMap back.
            HashMap parsedJSONMap = (HashMap) jsonIn.readObject();
            TestObject readObject = new TestObject(parsedJSONMap);
            System.out.println("Hello! "+readObject.equals(anObject));


			/*
			 * Stringify and parse example.  Use this if you are not using streams
			 * or you need to encrypt the JSON strings.
			 */

            String jsonString = JSONUtilities.stringify(anObject);
            System.out.println("JSON: "+jsonString);

            parsedJSONMap = (HashMap)JSONUtilities.parse(jsonString);
            readObject = new TestObject(parsedJSONMap);
            System.out.println("stringify same? "+readObject.equals(anObject));

            //this is the quickconnectfamily JSONException not the standard one.
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}