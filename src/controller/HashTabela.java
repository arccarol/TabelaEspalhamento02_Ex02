package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTabela {
    private int size;
    private List<LinkedList<Integer>> table;

    public HashTabela(int size) {
        this.size = size;
        this.table = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            table.add(new LinkedList<>());
        }
    }

    public void insert(int num) {
        int index = num % 2;
        table.get(index).add(num);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            for (Integer num : table.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
