package day01;

import java.util.List;
import java.util.Arrays;

/**
 * 将给定单词转换成指定的格式
 */
public class MyListTest {
    public static void main(String[] args) {
        String[] words = {"Hadoop","Hbase","Spark"};
        List<String> list = Arrays.asList(words);

        //将java的list类里添加一个方法，实现scala里类似map的功能
        MapFunction func = new MapFunction() {
            @Override
            public String transform(String string) {
                return string.toUpperCase();
            }
        };
        MyList mylist = new MyList(list);
        List<String> list2 = mylist.map(func);
        for (String word: list2
             ) {
            System.out.println(word);
        }
    }
}
