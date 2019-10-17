package lab_02.Test_12;

public class Rectangular extends Shape{
    double width ;
    double height;
    public  void area(){
            System.out.println(width*height);
    }

    public void Super_area(){
        super.area();
    }

    public void length(){
        System.out.println((width+height)*2);
    }

    public void Super_length(){
        super.length();
    }
}
