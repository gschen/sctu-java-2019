
package day20191017;

public class Test_04 {
    public static void main(String[] args) {
        T00 test_03 = new T00();
        test_03.start();
        T20 t20 = new T20();
        t20.start();
        T40 t40 = new T40();
        t40.start();
        T60 t60 = new T60();
        t60.start();
        T80 t80 = new T80();
        t80.setName("五线程");
        t80.start();
    }

}

