package day20191017;

public class Test_02 {
    public static void main(String[] args) {
        Test_01 test_01 = new Test_01();
        test_01.setName("xiancheng");//this.setId()设置编号,this.getId()获取编号
        test_01.start();
        Test_03 test_03 = new Test_03();
        test_03.start();
        Test_04 test_04 = new Test_04();
        test_04.start();
        Test_05 test_05 = new Test_05();
        test_05.start();
        Test_06 test_06 = new Test_06();
        test_06.start();

    }
}
