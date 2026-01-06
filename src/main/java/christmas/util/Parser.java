package christmas.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    public static void parse(String input, List<String> menuNames, List<Integer> menuCount){
        List<String> tmp=firstParse(input);
        for (String s : tmp) {
            menuNames.add(secondParse(s, 0));
            menuCount.add(Integer.parseInt(secondParse(s, 1)));
        }
    }

    public static List<String> firstParse(String input){
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public static String secondParse(String s, int i){
        return Arrays.stream(s.split("-"))
                .map(String::trim)
                .collect(Collectors.toList())
                .get(i);
    }
}
