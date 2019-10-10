package practice.shuzu;

public class ListTest {
    public static void main(String[] args) {
        int[] list= new int[10];
        list[0]=1;
        list[1]=11;
        list[2]=14;
        list[3]=16;
        list[4]=14;
        list[5]=19;
        list[6]=10;
        list[7]=1;
        list[8]=1;
        list[9]=1;


        for (int i = 0; i <list.length ; i++)
            System.out.println(list[i]);
    }
}
