package lab_02.test_06;

public class Triangle {
    int a ,b,c;//长宽高
    int perimeter;
    void box(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int getpermiter(){
        return perimeter;
    }

    void panduan() {
        if (a + b > c & a + c > b & b + c > a) {
            perimeter = a + b + c;
            System.out.println("三角形的周长为" + getpermiter());
        } else
            System.out.println("不能构成三角形");
    }
}
