package top.xywait.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {

    public static void main(String[] args) {
       Collection col = new ArrayList();

       col.add(new Book("三国演义", "罗贯中", 10.34));
       col.add(new Book("射雕英雄传", "金庸", 23.1));
       col.add(new Book("西游记", "吴承恩", 16.21));

       // 遍历col集合
       // 1. 得到col对应的迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            // 返回下一个元素，类型时Object
            Object obj = iterator.next();
            System.out.println(obj);
        }

        // 退出while循环时，iterator迭代器已经指向最后一个元素
        // 如果需要再次遍历，需要重置迭代器
        iterator = col.iterator();

    }


}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
