package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * BintoString
 */
public class BintoString {


    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("StoredCredential")));){

            HashMap<String, byte[] > hm =  (HashMap) ois.readObject();
            
            for(String key : hm.keySet()){

                System.out.println(key);

                byte[] arr = hm.get(key);

                Reader targetReader = new StringReader(new String(arr));
                int intValueOfChar;
                String targetString = "";
                while ((intValueOfChar = targetReader.read()) != -1) {
                    targetString += (char) intValueOfChar;
                }

                System.out.println(targetString);
            }
    
        
            


        } catch (IOException | ClassNotFoundException e) {
            
        }

        
    
        
    }





}
