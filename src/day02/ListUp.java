package day02;

import java.util.ArrayList;
import java.util.List;

public class ListUp {
    private List<String> list;


    public ListUp(List<String> list) {
        this.list = list;
    }



    public List<String> map(MapFunction func){
        ArrayList<String> nlist = new ArrayList<>();

        for(String word:list){
            String string = func.transform(word);
            nlist.add(string);
        }

        return nlist;
    }
}
