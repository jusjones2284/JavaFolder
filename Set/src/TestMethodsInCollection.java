import java.util.HashSet;
import java.util.Set;

public class TestMethodsInCollection {

    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("London");
        sets.add("Paris");
        sets.add("San Francisco");
        sets.add("Beijing");

        System.out.println("sets is" + sets);
        System.out.println(sets.size() + "elements in sets");

        sets.remove("London");
        System.out.println("\nset is " + sets);
        System.out.println(sets.size() + " elements in set");

        Set<String> set2 = new HashSet<>();
        sets.add("London");
        sets.add("Shanghai");
        sets.add("Paris");
        System.out.println("\nset2 is" + set2);
        System.out.println(set2.size() + "elements in set2");

        sets.remove("London");

        //Set is an interface. To create an instance of Set, you need to
        //use HashSet or TreeSet
        Set<String> set10 = new HashSet<>();
        set10.add("H ello");

        Set<String> set11 = new HashSet<>();
        set11.add("Hello");

        System.out.println(set11.equals(set10));;






    }

}
