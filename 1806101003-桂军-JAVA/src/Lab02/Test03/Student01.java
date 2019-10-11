package Lab02.Test03;

public class Student01 {
    //这是计算最高分、最低分、标准差的代码   是用数组写的 需要的宝宝可以参考哟
    public static void main(String[] args) {

        float b[]= {99,87,120};
        float num = 0;//平均分
        float max =  b[0];//最高分
        float min =  b[0];//最低分
        for (int i = 0; i < b.length; i++) {
            num +=b[i]; //赋值
            //计算最低分
            if (b[i]<min){
                min = b[i];//赋值
            }
            //计算最高分
            if (b[i]>max){
                max = b[i];//赋值
            }
        }
       /* num /=b.length;
        float std = 0;//标准差
        for (int i = 0; i <b.length; i++) {
            std += (b[i]-num)*(b[i]-num);
        }
        std /=b.length;
        std =(float) Math.sqrt(std);*/
        System.out.println("平均分是"+num+"最高分是"+max+"最低分是"+min);//"标准差是"+std);
    }
}
