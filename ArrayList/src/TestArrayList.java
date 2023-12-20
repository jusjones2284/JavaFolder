import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        ArrayList<String> stateList = new ArrayList<>();
        ArrayList<String> countyList = new ArrayList<>();

        cityList.add("Lisbon");
        cityList.add("London");
        cityList.add("New Orleans");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Seoul");
        cityList.add("Gentilly");

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Londons"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("is the list empty? " + cityList.isEmpty());

        cityList.add(2, "Xian");
        cityList.remove("Paris");

        System.out.println(cityList.toString());

        for(int i = cityList.size() - 1; i >= 0; i--){
            System.out.println(cityList.get(i) + " ");
            System.out.println();
        }

//        ArrayList<Circle> list = new ArrayList<>();
//        list.add(new Circle(2));
//        list.add(new Circle(3));
//
//        ArrayList<Double> list3 = new ArrayList<>();
//        list3.add(object);
//        list3.add(0, object);
//        list3.size();
//
//        for(int i = 0; i < list.size(); i+){
//            for(list.remove("red"))
//                i--;
//        }

        ArrayList<Date> list5 = new ArrayList<>();
        Date today = new Date();
        list5.add(today);
        list5.add(today);
        System.out.println((list5.get(0) == list5.get(1)) + " " + (list5.get(0).equals(list5.get(1))));

        ArrayList<String> list10 = new ArrayList<>();
        String s1 = new String("Java");
        String s2 = new String("Java");
        list10.add(s1);
        list10.add(s2);

        System.out.println((list10.get(0) == list10.get(1)) + " " +
                        (list10.get(0).equals(list10.get(1)))
                );






    }
}
