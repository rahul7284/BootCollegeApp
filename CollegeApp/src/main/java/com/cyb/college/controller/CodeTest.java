package com.cyb.college.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CodeTest extends TestUtil {
    public static void main(String[] args) {
       /* List<String> testString = Arrays.asList("121", "Rahul", "Shri", "Akasah");
        Collections.sort(testString, Collections.reverseOrder());
        for (String string : testString) {
            System.out.println(string);
        }
        
        List<String> testString2 =testString.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(testString2);
        */
        
        final String example = "/folder1/folder2/folder3/folder4";
        final String result  = example.substring(example.lastIndexOf('/', example.lastIndexOf('/') - 1), example.length() - 1);
       
        String rahul = "Mhy name /is /rahul";
        
        System.out.println(rahul.substring(rahul.lastIndexOf('/', rahul.length()-1), rahul.length()));
        
        
        System.out.printf("%s\n", result);
        
       /* // Creating an empty HashMap
        HashMap<String, String> hash_map = new HashMap<String, String>();
  
        // Mapping string values to int keys
        hash_map.put("10", "Geeks");
        hash_map.put("15", "4");
        hash_map.put("20", "Geeks");
        hash_map.put("25", "Welcomes");
        hash_map.put("30", "You");
        
        hash_map.forEach(action);*/
        
    }
}