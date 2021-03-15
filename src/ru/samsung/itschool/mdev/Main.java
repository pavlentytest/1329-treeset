package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        /*
        Деревья - структура данных в виде графа
        Корень дерева - самый верхний узел
        Ребро дерева - связь между узлами
        Потомок (ребенок) - узел, который имеет родителя
        Родитель - узел, имеющий потомков
        Лист - узел, у которого нет потомков
        Высота дерева - длина самого длинного пути к листу
        Глубина узла - длина пути к корню

        Бинарное дерево (Двоичное) - это дерево,в котором для каждого узла не более 2х детей
        Полное бинарное дерево - у каждого узла = 2 потомка
        Сбалансированное бин. дерево - когда для каждой вершины поддеревье высота не болл 1

         */

        /*
        TreeSet - множество (неповтор, отсорт)
        TreeMap - словарь (ключ-значение)  - отсорт. по ключу (по умолч)
         */

        TreeSet<String> names = new TreeSet<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Alex");
        names.add("Olga");
        names.add("Maria");
        names.add("Max");
        names.add("Max");

        for(String s: names) {
            System.out.println(s);
        }

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(56);
        ages.add(30);
        ages.add(15);
        ages.add(6);
        ages.add(6);
        ages.add(41);
        ages.add(41);
        ages.add(89);

        TreeSet<Integer> ages_tree = new TreeSet<>(ages);
        for(Integer i: ages_tree) {
            System.out.println(i);
        }

        TreeSet<MobilePhones> ph = new TreeSet<>();
        ph.add(new MobilePhones("Samsung galaxy s21", (byte) 21));
        ph.add(new MobilePhones("Iphone 10",(byte)18));
        ph.add(new MobilePhones("Sony",(byte)16));
        ph.add(new MobilePhones("Honor",(byte)16));

        for(MobilePhones p: ph) {
            System.out.println(p.getYear() + "; "+p.getName() );
        }


    }
}
class MobilePhones implements Comparable<MobilePhones> {
    private String name;
    private byte year;

    public MobilePhones(String name, byte year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getYear() {
        return year;
    }

    public void setYear(byte year) {
        this.year = year;
    }

    @Override
    public int compareTo(MobilePhones o) {
        // return this.year-o.year; по году
        //return o.getName().compareTo(this.getName());
        byte y1 = o.getYear();
        byte y2 = this.getYear();
        int result = y2-y1;
        if (result != 0) {
            return result;
        }
        return this.getName().compareTo(o.getName());
    }
}