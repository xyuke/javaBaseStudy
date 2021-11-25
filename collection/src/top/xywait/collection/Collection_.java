package top.xywait.collection;

import java.util.*;

public class Collection_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        // add: 添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list="+list);
        // list=[jack, 10, true]

        // remove: 删除
        //list.remove(0);     // 删除第一个元素，下标
        list.remove("jack");    // 删除指定元素
        System.out.println("list="+list);
        // list=[10, true]

        // contains: 查找元素是否存在
        System.out.println(list.contains("Tom"));

        // size: 获取元素的个数
        System.out.println(list.size());

        // isEmpty: 判断集合是否为空
        System.out.println(list.isEmpty());

        // clear: 清空集合
        list.clear();

        // addAll: 添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("西游记");
        list2.add("水浒传");
        list.addAll(list2);
        System.out.println(list);
        // [西游记, 水浒传]

    }
}
