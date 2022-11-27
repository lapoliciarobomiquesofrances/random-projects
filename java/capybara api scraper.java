package the.path.you.put.thiS.in;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
public static int count = 0;

    public static void main(String[] args) throws IOException {
okdoitinpracticecuh();
    }
   public static void okdoitinpracticecuh() throws IOException {
       if (count < 739) {
           count++;
           String capyurl = ("https://api.capy.lol/v1/capybara/" + count);
           String filename = (count + ".jpeg");
           bruh(new URL(capyurl), new File(filename));
okdoitinpracticecuh();
       }
       else {
           System.out.println("los pollos hermanos family");
       }
   }



    public static void bruh(URL URL, File File) throws IOException {
        FileUtils.copyURLToFile(URL, File);
    }
}
