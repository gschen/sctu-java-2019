package lab_02.test_12;

public class Rectangular implements Shape{


    int lenght;
    int width;
    @Override
    public void getarea() {
        System.out.println(lenght*width);
    }

    @Override
    public void getperimeter() {

        System.out.println((lenght+width)*2);
    }
}
