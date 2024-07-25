import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Justin", 123456);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);
        empIds.put("Jerry", 8675309);


        System.out.println(empIds);
        System.out.println(empIds.get("Justin"));
        System.out.println(empIds.containsKey("Cal"));
        System.out.println(empIds.containsValue(6));

        empIds.putIfAbsent("Jacob", 5789874);
        empIds.remove("George")

        ;



    }
}

import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;
        import java.util.TreeMap;

public class Exercise21_06Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        Map<Character, Integer> letterCountMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                letterCountMap.put(ch, letterCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        TreeMap<Character, Integer> sortedMap = new TreeMap<>((c1, c2) -> {
            int compare = letterCountMap.get(c1).compareTo(letterCountMap.get(c2));
            return (compare == 0) ? c1.compareTo(c2) : compare;
        });

        sortedMap.putAll(letterCountMap);

        System.out.println("Letter occurrences:");
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

import java.util.Arrays;
        import java.util.Scanner;
        import java.util.Set;
        import java.util.TreeSet;

public class Exercise21_05Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();

        System.out.print("Enter strings for the first set: ");
        String input1 = scanner.nextLine();
        set1.addAll(Arrays.asList(input1.split(" ")));

        System.out.print("Enter strings for the second set: ");
        String input2 = scanner.nextLine();
        set2.addAll(Arrays.asList(input2.split(" ")));

        TreeSet<String> originalSet1 = new TreeSet<>(set1);
        TreeSet<String> originalSet2 = new TreeSet<>(set2);

        TreeSet<String> unionSet = new TreeSet<>(originalSet1);
        unionSet.addAll(originalSet2);

        TreeSet<String> differenceSet = new TreeSet<>(originalSet1);
        differenceSet.removeAll(originalSet2);

        TreeSet<String> intersectionSet = new TreeSet<>(originalSet1);
        intersectionSet.retainAll(originalSet2);

        System.out.println("The union of the two sets is " + unionSet);
        System.out.println("The difference of the two sets is " + differenceSet);
        System.out.println("The intersection of the two sets is " + intersectionSet);

        scanner.close();
    }
}