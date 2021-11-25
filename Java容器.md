# Java容器

## 集合（Collection）

**集合出现的原因：**

1. 面向对象的语言，避免不了对象的处理
2. 为了方便操作对象，需要把多个对象存储起来
3. 想要存储多个对象，那就需要考虑到**容器**
4. 可以使用数组来存储，但是有个致命的缺陷：**数组的长度不可变**。

**数组和集合的区别**

1. 长度

       + 数组长度固定

       + 集合长度可变

2. 内容

   + 数组存储的是同一种类型的元素

   + 集合可以存储不同类型的元素

3. 元素的数据类型

       + 数组可以存储基本数据类型，也可以存储引用数据类型

       + 集合只能存储引用数据类型（**对基本数据类型会自动装箱**）

**总览：**

1. Collection: 主要用于存放单一元素

   1. List：**顺序**，元素有序，可重复

      - ArrayList：Object[] 数组

         - LinkedList：双向链表
         - Vector：Object[] 数组

   2. Set：**独一无二**，无序，不可重复

      - HashSet（无序，唯一）：基于**HashMap**

      - TreeSet（有序，唯一）：红黑树

      - LinkedHashSet：HashSet子类，基于LinkedH

2. Map：**key-value**，主要用于存放键值对

      - HashMap
            - LinkedHashMap
       - TreeMap
       - HashTable



> **List和Set都是集合，一般来说：如果我们需要保证集合的元素是唯一的，就应该使用Set集合。**

### 数组的缺点

1. 长度在开始时必须指定，一旦指定，无法更改。
2. 保存的必须为同一类型的元素

### 集合的优点

1. 可以动态的保存任意多个对象
2. 提供了一系列方便的操作对象的方法

### 介绍 

![image-20211125160235082](C:\Users\abei\AppData\Roaming\Typora\typora-user-images\image-20211125160235082.png)

![image-20211125155731996](C:\Users\abei\AppData\Roaming\Typora\typora-user-images\image-20211125155731996.png)



```java
package top.xywait.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

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

```

