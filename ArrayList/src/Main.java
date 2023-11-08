import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Date> dates = new ArrayList<Date>();
        ArrayList<Date> date = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(10);
        list.add(15);
        list.set(2, 45);
        list.contains(21);
        System.out.println(list.get(2));
        System.out.println(list.contains(5));;
        System.out.println(list);
        list.indexOf(2);
//        list.remove(new Integer(3))
        list.size();
        list.clear();
    }
}