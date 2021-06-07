class IsogramChecker {

    boolean isIsogram(String phrase) {
        String s = phrase.replaceAll(" |-","").toLowerCase();

        return (s.chars().distinct().count() == s.length());
    }
}

// Mysolution
/*
import java.util.Arrays;

class IsogramChecker {

    static boolean isIsogram(String phrase) {
        char[] arr = phrase.toLowerCase().toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '-' || arr[i] == ' ') {
                continue;
            }
            else if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}*/
