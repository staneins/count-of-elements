package com.kaminsky;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        String[] test = {"one", "two", "three", "one"};
        Map<String, Integer> testMap = app.convertArrayToMap(test);
        testMap.forEach((key, value) ->
                System.out.println(key + ":" + value));
    }

    public <T> Map<T, Integer> convertArrayToMap(T[] arr) {
        Map<T, Integer> resultMap = new HashMap<T, Integer>();

        return Arrays.stream(arr)
                .collect(Collectors.toMap(key -> key, value -> 1, Integer::sum));
    }
}
