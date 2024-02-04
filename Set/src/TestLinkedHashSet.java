import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Bejing");

        System.out.println(set);

        for(String element: set){
            System.out.println(element.toUpperCase() + " ");
        }
    }
}
