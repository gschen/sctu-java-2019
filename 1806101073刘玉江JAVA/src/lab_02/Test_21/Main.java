package lab_02.Test_21;

public class Main {

    private static void countString(String str,String s){
        int count = 0;
        while (str.indexOf(s) != -1){
            str = str.substring(str.indexOf(s)+1,str.length());
            count++;
        }
        System.out.println(s+"出现的次数为"+count);
    }
    public static void main(String[] args) {
        String str = "hfjsahfgshgshglasjhgjhuidsh";
        countString(str,"s");
    }

}


