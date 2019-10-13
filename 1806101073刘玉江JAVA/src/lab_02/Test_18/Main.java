package lab_02.Test_18;

public class Main {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println(name +  " 长度为 " + name.length());
        name.charAt(0);
        name.charAt(name.length()-1);
        name.indexOf('M');
        name.indexOf("crazy");
        String[] words = name.split(" ");
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.substring(0,name.indexOf(" ")));
        System.out.println(name.indexOf("crazy"));

    }
}
