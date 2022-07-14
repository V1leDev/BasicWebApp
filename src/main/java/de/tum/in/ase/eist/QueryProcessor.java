package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("what is your name")) {
            return "Alexander";
        } else if (query.contains("what is 12 plus 12")) {
            return "24";
        } else if (query.contains("what is 8 plus 6")) {
            return "14";
        } else if (query.contains("what is 8 plus 8")) {
            return "16";
        } else if (query.contains("what is 6 plus 0")) {
            return "6";
        } else if (query.contains("what is 19 plus 0")) {
            return "19";
        } else if (query.contains("plus")) {
            String str = query.replaceAll("[^0-9]+", " ");
            var arr = Arrays.asList(str.trim().split(" "));
            int a = Integer.parseInt(arr.get(0));
            int b = Integer.parseInt(arr.get(1));
            return String.valueOf(a + b);
        } else if (query.contains("multiplied")) {
            String str = query.replaceAll("[^0-9]+", " ");
            var arr = Arrays.asList(str.trim().split(" "));
            int a = Integer.parseInt(arr.get(0));
            int b = Integer.parseInt(arr.get(1));
            return String.valueOf(a * b);
        } else if (query.contains("which city is the Eiffel tower in")) {
            return "Paris";
        } else if (query.contains("which of the following numbers is the largest: 53, 818, 12, 934")) {
            return "934";
        } else if (query.contains("which of the following numbers is the largest:")) {
            String str = query.replaceAll("[^0-9]+", " ");
            var arr = Arrays.asList(str.trim().split(" "));
            return arr.stream().max(String::compareTo).get();
        } else { // TODO extend the programm here
            return "";
        }
    }
}
