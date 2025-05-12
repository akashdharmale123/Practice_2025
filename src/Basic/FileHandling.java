package Basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		
		String fileChaNav = "C:\\Users\\USER\\Desktop\\abc.txt";
	
        try {
            File file = new File(fileChaNav);
            
            if (file.createNewFile()) 
                System.out.println(file.getName() + " -- ya navachi file created keli re ba.. ");
            else 
                System.out.println(file.getName() + " -- ya navachi file adhich banleli ahe re ba...");
            
            //writing in file
            FileWriter w = new FileWriter(fileChaNav);
            w.write("Asach Tp kai tari lihaycha mhanun..");
            w.close();
            System.out.println("File madhe lihila ata aapan, te check sathi console vr print krt ahe..");

            //Reading from file
            FileReader r = new FileReader(fileChaNav);
            BufferedReader br = new BufferedReader(r);
            String line;         
            	System.out.println("File madhun vachat ahe ata..");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();			 

        } catch (IOException e) {
            System.out.println("Kai Tari Exceptions aala re ba..");
            e.printStackTrace();
        }

	}

}
