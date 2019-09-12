package lab01;

public class Test05 {public static void main(String[] args) {
    double ran = Math.random();
    int i = (int)(ran * 5);
    switch (i){
        case 1:
            System.out.println("不及格");
            break;
        case 2:
            System.out.println("及格");
            break;
        case 3:
            System.out.println("中等");
            break;
        case 4:
            System.out.println("良好");
            break;
        case 5:
            System.out.println("优秀");
            break;
    }

}

}
