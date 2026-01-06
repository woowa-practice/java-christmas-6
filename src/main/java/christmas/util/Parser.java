package christmas.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    public static void parse(String input, List<String> menuNames, List<Integer> menuCount){
        List<String> tmp=preParse(input);
        for (String s : tmp) {
            menuNames.add(prepreParse(s, 0));
            menuCount.add(Integer.parseInt(prepreParse(s, 1)));
        }
    }

    private static List<String> preParse(String input){
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    private static String prepreParse(String s, int i){
        return Arrays.stream(s.split("-"))
                .map(String::trim)
                .collect(Collectors.toList())
                .get(i);
    }
}
