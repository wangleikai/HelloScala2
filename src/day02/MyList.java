package day02;
/**
 * java 的scala函数式编程
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        String[] words = {"Hadoop","Hbase","Spark"};
        List<String> list = Arrays.asList(words);

        ListUp up = new ListUp(list);

        MapFunction func = new MapFunction() {
            @Override
            public String transform(String string) {
                return string.toLowerCase();
            }
        };

        List<String> map = up.map(func);

        for(String word : map){
            System.out.println(word);
        }


    }
}
