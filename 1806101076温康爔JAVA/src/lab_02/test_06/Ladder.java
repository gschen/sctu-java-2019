package lab_02.test_06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ladder {
    //属性
    //上底、下底、高、面积
    double shangdi,xiadi,gao,mianji;
    //构造方法
    Ladder(double sd,double xd,double g)
    {
        shangdi=sd;
        xiadi=xd;
        gao=g;
        mianji=(sd+xd)*g/2;
    }

    //成员方法
    //返回面积
    //返回类型 方法名（参数列表）
    double getMianJi()
    {
        //返回语句
        return mianji;
    }

    public static void main(String[] args) {
        Ladder ladder = new Ladder(5,15,10);
        System.out.println("梯形的面积为："+ladder.getMianJi());
    }
}
