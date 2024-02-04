import java.util.*;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("James");
        names.add("James");
        names.add("Justin");
        names.add("Mickal");
        names.add("Ashley");
        names.add("Hello");

        names.remove("James");

//        names.clear();

//        System.out.println(names.size());
//        System.out.println(names.contains("Justin"));
//        System.out.println(names.isEmpty());
//
//        for(String name: names){
//            System.out.println(name);
//        }
//
//        names.forEach(System.out::println);
//
//        Iterator<String> namesIterator = names.iterator();
//        while (namesIterator.hasNext()){
//            System.out.println(namesIterator.next());
//        }

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);

        Set<Integer> setOfList = new HashSet<>();
       for(Integer element: numberList){
           setOfList.add(element);
       }

        System.out.println(setOfList);

       Set secondSet = new HashSet();
       secondSet.addAll(numberList);
        System.out.println(secondSet);

        Set thirdSet = new HashSet(numberList);

        Set fourthSet = new TreeSet<>();
        fourthSet.add("Zebra");
        fourthSet.add("Brandy");
        fourthSet.add("Ashley");
        fourthSet.add("Kelly");

        System.out.print(fourthSet);

        Set<String> names5 = new LinkedHashSet<>(fourthSet);




    }
}
