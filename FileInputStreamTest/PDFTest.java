package test;

import java.net.*;
import java.io.*;

public class PDFTest {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://www.fetagracollege.org");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        
        String fileName = "D:/aamir/aamir_data/temp/export/ks2/word-page7/test-output.docx";
        fileName = "D:\\aamir\\aamir_data\\temp\\export\\pdf\\testing-other-api\\java\\new_sourcee.txt";
        
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        try (OutputStream outputStream = new FileOutputStream(fileName)) {
        	//outputStream.	
        }
        String inputLine;
        
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            writer.println(inputLine);
        }
        in.close();
    }
}