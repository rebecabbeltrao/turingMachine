package util;

import java.io.*;
public class ReadFile{


    public ReadFile() throws IOException {

        try{
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/Manuel/Desktop/ReadFile.txt"));
            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

}