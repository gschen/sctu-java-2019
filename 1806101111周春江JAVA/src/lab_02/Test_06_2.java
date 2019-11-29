package lab_02;

public class Test_06_2 {
    int sd , xd , gao , area;
    void box (int sd,int xd,int gao){
        this.sd = sd;
        this.xd = xd;
        this.gao = gao;
    }
    void getArea(){
        area =(sd+xd)*gao/2;
        System.out.println("梯形的面积为"+ area);
    }
}
