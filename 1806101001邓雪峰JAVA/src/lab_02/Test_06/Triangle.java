package lab_02.Test_06;

public class Triangle {
    double side1;
    double side2;
    double side3;
    boolean check;

    double  perimeter(){
        return side1+side2+side3;
    }
    double area(){
        double p;
        p = (side1+side2+side3)/2;
        return (Math.sqrt(p*((p-side1)*(p-side2)*(p-side3))));
    }

    boolean judge(){
        if (
                side1+side2 >side3 && side2-side1<side3
        ){
            check = true;
        }
        else {
            check = false;
        }
        return true;
    }

    public static void main(String[] args) {
        Triangle triangle =new Triangle();

        triangle.side1 = 3;
        triangle.side2 = 4;
        triangle.side3 = 7;

        if (triangle.check == true){
            System.out.println("三角形周长为："+triangle.perimeter());
            System.out.println("三角形面积为："+triangle.area());
        }
        else {
            System.out.println("输出值错误，不能满足三角形条件.");
        }


    }
}
