package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n = 500;
        List<String> result = first_task(n);
        System.out.println(result);


        //first_task();
        //second_task();
        //third_task();
        //fourth_task();
        //fifth_task();

    }
    public static List<String> first_task(int n) {
        if (n <= 0)
            return null;

        List<String> first_task = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                if (i % 7 == 0)
                    first_task.add("fizzbuzz");
                else
                    first_task.add("fizz");
            } else if (i % 7 == 0) {
                first_task.add("buzz");
            } else
                first_task.add(String.valueOf(i));
        }

        return first_task;

    }

    public static String second_task()
    {
        String str="make install";

        StringBuilder sb = new StringBuilder(str); //Класс StringBuilder. Обладает встроенным методом reverse()
        sb.reverse();
        str = sb.toString();

        return str;
    }

    public static List<Double> third_task(double a,double b,double c)
    {
        if(a==0){
            return null;
        }
        List<Double> ans = new ArrayList<Double>();
        double D=b*b-4*a*c*1.;
        System.out.println(D);
        if(D>0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            ans.add(x1);
            ans.add(x2);
            System.out.println("Корни x1=" + x1 + ", x2 = " + x2);
            return ans;
        }
        if(D==0){
            double x=-b/(2*a);
            ans.add(x);
            System.out.println("Корень x="+x);
            return ans;
        }
        else {
            System.out.println("Нет вещественных корней");
            return null;
        }

    }

    public static double fourth_task(){
        double sum = 0;
        double epsilon = 1e-6;

        int n = 2;
        while (Math.abs(n * n + n - 2) >= epsilon) {
            sum += (double) 1 / (n * n + n - 2);
            n++;
        }
        System.out.println(sum);

        return sum;
    }
    public static boolean fifth_task(String str) {

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {  //перебираем каждый символ в строке
            if (Character.isLetter(c)) {
                result.append(Character.toLowerCase(c));
            }
        }
        String str1 = result.toString();
        result.reverse();
        String str2= result.toString();

        int k=0;

        for (int i = 0;i<str1.length();i++)
        {
            if (str1.charAt(i)==str2.charAt(i))
            {
                k++;
            }
            else{
                k=0;
            }
        }

        if (k==str1.length()){
            System.out.println("Строка является палиндромом");
            return true;
        }
        else{
            System.out.println("Строка не является палиндромом");
            return false;
        }

    }
}