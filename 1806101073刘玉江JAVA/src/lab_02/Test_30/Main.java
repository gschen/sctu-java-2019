package src.lab_02.Test_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> strList = new ArrayList<Integer>();
        Scanner scan_input = new Scanner(System.in);

        strList.add(scan_input.nextInt());
        strList.add(scan_input.nextInt());
        strList.add(scan_input.nextInt());
        strList.add(scan_input.nextInt());
        double a = (strList.get(0)+strList.get(1)+strList.get(2)+strList.get(3))/4;
        System.out.println(a);
    }
}
