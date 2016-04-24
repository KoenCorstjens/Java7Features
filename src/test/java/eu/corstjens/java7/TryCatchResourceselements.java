package eu.corstjens.java7;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by koencorstjens on 24/04/16.
 */
public class TryCatchResourceselements {


    @Test
    public void beforeJava7() throws IOException {
        InputStream input = null;

        try {
            input = this.getClass().getClassLoader().getResourceAsStream("testfile.txt");

            int data = input.read();
            while(data != -1){
                System.out.print((char) data);
                data = input.read();
            }
        } finally {
            if(input != null){
                input.close();
            }
        }
    }



    @Test
    public void inJava7() throws FileNotFoundException {

        try(InputStream input = this.getClass().getClassLoader().getResourceAsStream("testfile.txt");
        ) {
            int data = input.read();
            while(data != -1){
                System.out.print((char) data);
                data = input.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
