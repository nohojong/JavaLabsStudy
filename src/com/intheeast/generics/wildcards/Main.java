package com.intheeast.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void process(List<? extends Foo> list) {
        for (Foo elem : list) {
            System.out.println("Processing: " + elem.getName());
        }
    }

    public static void main(String[] args) {
    	// <> : 다이아몬드..타입 아큐먼트를 지정해야 하는 곳인데,,,
    	//      컴파일러가 코드 문맥을 보고 타입 아규먼트를 추론(Inference)...
        List<Bar> barList = new ArrayList<>();
        
        barList.add(new Bar("Bar1"));
        barList.add(new Bar("Bar2"));
        barList.add(new Bar("Bar3"));

        process(barList); // Using the process method with a List of Bar
        
        List<String> strList = new ArrayList<>();
        strList.add("korea");
        strList.add("usa");
        
//        process(strList);
        
        
        
        System.out.println("hello");
    }

}
