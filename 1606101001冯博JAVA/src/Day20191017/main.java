package Day20191017;

public class main {
    public static void main(String[] args) {
        Test_02 test_02 = new Test_02();
        test_02.setName("线程1： ");
        Test_03 test_03 = new Test_03();
        test_03.setName("线程2： ");
        Test_04 test_04 = new Test_04();
        test_04.setName("线程3： ");
        Test_05 test_05 = new Test_05();
        test_05.setName("线程4： ");

        test_02.run();
        test_03.run();
        test_04.run();
        test_05.run();
        }
}

