package map.HashMap遍历的集中方式;

import org.junit.Test;

import java.util.*;

/**
 * @Author: sophia
 * @Description: HashMap遍历的方式
 * @Date: 2020/6/18 11:56
 * @Version :1.0
 */
public class HashMapForEach {

    private static HashMap<String,String> map =new HashMap<>();
    static{
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
    }

    /**
     * 使用迭代器遍历
     */
    @Test
    public void test1(){
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("键:"+key+",值:"+value);
        }
    }

    /**
     * 使用entrySet()
     */
    @Test
    public void test2(){

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("键:"+key+",值:"+value);
        }
    }

    /**
     * 通过Map.keySet获取key，然后通过key获取value
     */
    @Test
    public void test3(){
        for (String key : map.keySet()) {
            System.out.println("键： "+ key + " ,值： " + map.get(key));
        }
    }

    /**
     * 通过Map.values获取value
     */
    @Test
    public void test4(){
        for (String value : map.values()) {
            System.out.println("值：" + value);
        }
    }
}
