package util;

import java.util.ArrayList;

/**
 * Created by Manuel on 16/08/2017.
 */
public class Util {


    public Util(){

    }

    public void syso(ArrayList<String[]> transicoes){
        for(int i = 0; i < transicoes.size(); i++){
            for(int j = 0; j < transicoes.get(i).length; j++){
                System.out.print(transicoes.get(i)[j]);
            }
        }
    }

}
