package io.github.JaG;

import io.github.JaG.structures.HashArray;

import java.util.Arrays;
import java.util.List;

public class StructureExample {
    public static void main(String[] args) {
        /*/////////////////////////*/
        /* HashArray EXAMPLE USAGE */
        /*/////////////////////////*/

        HashArray<String, Integer> ha = new HashArray<>();
        ha.put("zero", 0);
        List<String> keys = Arrays.asList("One", "Two", "Three");
        ha.insert(keys, 0);
        for (String key : ha.keyList()) { System.out.println(key + " : " + ha.get(key, false)); }

    }
}