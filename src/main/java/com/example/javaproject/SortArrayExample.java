package com.example.javaproject;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayExample {
    
    private MyPOJO[] getArrayOfObjects() {
        MyPOJO[] arr = new MyPOJO[4];
        arr[0] = new MyPOJO(3, "d", true);
        arr[1] = new MyPOJO(6, "b", false);
        arr[2] = new MyPOJO(2, "c", false);
        arr[3] = new MyPOJO(9, "a", true);
        return arr;
    }

    private class MyIntComparator implements Comparator<MyPOJO> {
        @Override
        public int compare(MyPOJO o1, MyPOJO o2) {
            return o1.myInt - o2.myInt;
        }
    }

    public MyPOJO[] getArraySortedByMyInt() {
        MyPOJO[] arr = getArrayOfObjects();
        Arrays.sort(arr, new MyIntComparator());
        return arr;
    }

    private class MyStringComparator implements Comparator<MyPOJO> {
        @Override
        public int compare(MyPOJO o1, MyPOJO o2) {
            return o1.myString.compareTo(o2.myString);
        }
    }

    public MyPOJO[] getArraySortedByMyString() {
        MyPOJO[] arr = getArrayOfObjects();
        Arrays.sort(arr, new MyStringComparator());
        return arr;
    }

    private class MyBoolComparator implements Comparator<MyPOJO> {
        @Override
        public int compare(MyPOJO o1, MyPOJO o2) {
            if (o1.myBool && !o2.myBool) {
                return -1;
            } else if (!o1.myBool && o2.myBool) {
                return 1;
            }
            return o1.myString.compareTo(o2.myString);
        }
    }

    public MyPOJO[] getArraySortedByMyBool() {
        MyPOJO[] arr = getArrayOfObjects();
        Arrays.sort(arr, new MyBoolComparator());
        return arr;
    }
}
