package util;

import java.io.*;
import java.util.ArrayList;

public class ReadFile{

    public ArrayList<String[]> transicoes = new ArrayList<>();

    public ReadFile() throws IOException {

        try{
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/Manuel/Desktop/ReadFile.txt"));
            while(br.ready()){
                String linha = br.readLine();
                String[] transicao = linha.split(" ");
                transicoes.add(transicao);
                //System.out.println(transicao);
            }
            br.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

    public ArrayList<String[]> getTransicoes(){
        return transicoes;
    }
}