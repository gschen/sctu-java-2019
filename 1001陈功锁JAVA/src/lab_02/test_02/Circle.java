package lab_02.test_02;

/**
 * Created by Administrator on 2019-9-5.
 */
public class Circle {
    //1.属性
    double radius;


    //2. 成员方法
    // 计算圆的面积和周长
    double calArea(){

        return 3.14 * this.radius * this.radius;
    }

    double calLength(){

        return 2 * 3.14 * this.radius;
    }


    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.radius = 1;

        c1.calArea();
        c1.calLength();
    }
}
