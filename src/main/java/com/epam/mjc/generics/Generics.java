package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {


    public  List<List<String>> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);

        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);

        return secondList;
    }



    public <T>Object genericMethod(T object) {
        // Perform any desired operations here
        return object;
    }

    public <T> void cloneMethod(List<? super T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }


}
