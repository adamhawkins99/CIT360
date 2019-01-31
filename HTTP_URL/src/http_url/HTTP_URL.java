

package http_url;


import java.net.*;
import java.io.*;






public class HTTP_URL {

   public static void main(String[] args) throws IOException 
        {
            URL url = new URL("https://www.mormon.org/");
            URLConnection conn = url.openConnection();
            BufferedReader buff = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String s = buff.readLine();
            while (s != null)
            {
                System.out.println(s);
                s = buff.readLine();
            }

           // If they attempte to load a page that does not exist, although sometimes I wish!
            try 
            {
                URL url2 = new URL("http://www.mormon.org/FivePercentTithing");
                URLConnection conn2 = url2.openConnection();
                BufferedReader buff2 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
                String s2 = buff2.readLine();
                while (s2 != null) 
                {
                    System.out.println(s2);
                    s2 = buff2.readLine();
                }
            }
            catch (IOException e)
            {
                System.out.print("Sorry, you seemed to have broke the internet.\n");
            }

        
            // To test a completly fake URL
            try 
            {
                URL url3 = new URL("www.adamhawkinsisawesome.com");
                URLConnection conn3 = url3.openConnection();
                BufferedReader buff3 = new BufferedReader(new InputStreamReader(conn3.getInputStream()));
                String s3 = buff3.readLine();
                while (s3 != null) 
                {
                    System.out.println(s3);
                    s3 = buff3.readLine();
                }
            }
            catch (IOException e)
            {
                System.out.print("The URL You entered is not found, give it another shot!\n");
            }

            }


}