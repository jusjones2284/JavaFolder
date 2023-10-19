import java.util.*;

public class Exercise08_25 {
    public static boolean isMarkovMatrix(double[][] m)
    {
        boolean flag=true;

        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                if(m[i][j]<0)
                {
                    return false;
                }
            }
        }
        for (int j = 0; j<m.length; j++) {
            double colsum = 0.0;
            for (int i = 0; i < m[j].length; i++) {
                colsum += m[i][j];
            }
            if (Math.abs(colsum - 1.0) > 1e-9) {
                return false;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double []m[]=new double[3][3];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row:");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m[i][j]=sc.nextDouble();
            }
        }
        boolean b=isMarkovMatrix(m);

        if(b==true) {
            System.out.println("It is a Markov matrix");
        }
        else {
            System.out.println("It is not a Markov matrix");
        }
    }
}

import turtle
turtle.showturtle()

        a = (v1 - v0) / t

        print("Average Acceleration:", a, "m/s²")

a = (v1 - v0) / t

v0 is

print((10.5-5.6)/0.5)

        cp = 312032486                                              # cp is current population
        seconds_in_year = 365 * 24 * 60 * 60                        # no. of seconds in one year
        births_in_year = seconds_in_year // 7                       # no. of births in one year
        #print(births_in_year)
        deaths_in_year = seconds_in_year // 13                      # no. of deaths in one year
        #print(deaths_in_year)
        immigrants_in_year = seconds_in_year // 45                  # no. of immigrants in one year
        #print(immigrants_in_year)
        api = births_in_year + deaths_in_year - immigrants_in_year  # api is annual_population_increase
        #print (api)
        print("Annual yearly population for the next 5 years is as below \n",
        "First Year is : ", cp + api, ", \n",
        "Second Year is : ", cp + 2 * api, ", \n",
        "Third Year is : ", cp + 3 * api, ", \n",
        "Fourth Year is : ", cp + 4 * api, "and \n",
        "Fifth Year is : ", cp + 5 * api, "\n")


        312032486 + 365 * 24 * 60 * 60 / 7 - 365 * 24 * 60 * 60 / 13 + 365 * 24 * 60 * 60 / 45

        312032486 + 2 * 365 * 24 * 60 * 60 / 7 - 2 * 365 * 24 * 60 * 60 / 13 + 2 * 365 * 24 * 60 * 60 / 45
        312032486 + 3 * 365 * 24 * 60 * 60 / 7 - 365 * 24 * 60 * 60 / 13 + 365 * 24 * 60 * 60 / 45

        312032486 + 4 * 365 * 24 * 60 * 60 / 7 - 2 * 365 * 24 * 60 * 60 / 13 + 2 * 365 * 24 * 60 * 60 / 45
        312032486 + 5 * 365 * 24 * 60 * 60 / 7 - 2 * 365 * 24 * 60 * 60 / 13 + 2 * 365 * 24 * 60 * 60 / 45

        import java.util.Scanner;

public class Exercise_08_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] m = new double[3][4];

        System.out.println("Enter " + m.length + "-by-" + m[0].length + " matrix row by row: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextDouble();
            }
        }

        for (int j = 0; j < m[0].length; j++) {
            System.out.printf("Sum of the elements at column %d is %.1f%n", j, sumColumn(m, j));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}

import java.util.Scanner;

public class Exercise_08_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] m = new double[3][4];

        System.out.println("Enter " + m.length + "-by-" + m[0].length + " matrix row by row: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextDouble();
            }
        }

        for (int j = 0; j < m[0].length; j++) {
            System.out.printf("Sum of the elements at column %d is %.1f%n", j, sumColumn(m, j));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}

