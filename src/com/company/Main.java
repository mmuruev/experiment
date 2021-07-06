package com.company;

import java.util.Comparator;
import java.util.List;

public class Main {

    private static List<Item> data = List.of(
            new Item("A", 1),
            new Item("M", 56),
            new Item("F", 13),
            new Item("Q", 50),
            new Item("C", 14),
            new Item("D", 52),
            new Item("T", 17),
            new Item("Z", 12)
    );

    public static void main(String[] args) {
	      data.stream()
                  .sorted(Comparator.comparing(p -> p.id))
                  .forEach(System.out::println);
    }

    static class Item{

        Item(String id, Integer value){
            this.id = id;
            this.value = value;
        }

        String id;
        Integer value;

        @Override
        public String toString(){
             return "id: " + id +" " + "value: " + value;
        }
    }

}
