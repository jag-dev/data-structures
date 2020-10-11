package io.github.jag;

import io.github.jag.structures.HashArray;

public class StructureExample {
    public static void main(String[] args) {
        HashArray<Integer, String> ha = new HashArray<>();
        HashArray<Integer, String> ha2 = new HashArray<>();
        ha.put(10, "First Value");
        ha2.put(11, "2nd First Value");
        System.out.println(ha.get(0, true));
        System.out.println(ha2.get(0, true));
        System.out.println("Hello World...");
    }
}