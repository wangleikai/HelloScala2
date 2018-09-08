package day01;

import java.util.ArrayList;
import java.util.List;

//在自定义的类里添加方法
public class MyList {
    private List<String> list;
    public MyList(List<String> list){
        this.list = list;
    }

    public List<String> map(MapFunction func){
        List<String> nList = new ArrayList<String>();
        for(String word : list){
            String nword = func.transform(word);
            nList.add(nword);
        }
        return nList;
    }
}
