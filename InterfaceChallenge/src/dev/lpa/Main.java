package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT ));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));


//        for(var m : mappables){
//            Mappable.mapIt(m);
//        }

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSecond = (int) (totalSeconds % 60);

//        int x = 1;
//        x += 2;
//        System.out.println(x);
//
//        int i = 3, j = 3;
//
//        i++;
//        j--;

//        int j = 0;
//        int i = j++ + j * 5;
//        System.out.println(j);
//
//        System.out.println((int) 1.7);
//        double d = 4.5;
//        int is = (int)d;
//        int sum = 0;
//        sum += 4.5;
//
//        System.out.println(1/2.0);








    }
}