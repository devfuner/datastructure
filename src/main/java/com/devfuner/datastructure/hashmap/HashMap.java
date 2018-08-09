package com.devfuner.datastructure.hashmap;

import java.util.Arrays;

public class HashMap {

    private Object[] array = new Object[10];

    public void put(Object key, String value) {
        int hash = key.hashCode();
        System.out.println("HASH: " + hash);

        int index = hash % array.length;

        array[index] = value;

        System.out.println(this);
    }

    public String pop(String key) {
        int hash = key.hashCode();
        int index = hash % array.length;

        return (String) array[index];
    }

    @Override
    public String toString() {
        return "HashMap{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        System.out.print("1: ");
        hashMap.put("A1", "aaa");

        System.out.print("2: ");
        hashMap.put("B2", "bbb");

        System.out.print("3: ");
        hashMap.put("C3", "ccc");

        System.out.print("4: ");
        hashMap.put("A1", "ddd");

        String aValue = hashMap.pop("A");
        System.out.println("value of Key A: " + aValue);


        System.out.print("4-1: ");
        hashMap.put("H8", "hhh");

        System.out.print("5: ");
        hashMap.put(hashMap, "zzz");
    }
}
