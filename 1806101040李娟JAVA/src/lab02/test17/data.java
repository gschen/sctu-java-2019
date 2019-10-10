package lab02.test17;
//17、 	定义一个10个元素组成的一维数组，输出该数组中的最大值、最小值、所有元素总和，以及最大值和最小值在该数组中的位置。
public class data {
    public static void main(String[] args) {

        double[] d1 = {11,2,3,4,5,6,17,8,9,12};

        int position1 = 0;
        double max = d1[0];
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] > max)
                max = d1[i];
            if (max==d1[i]){
                position1 = i+1;
            }

        }
        System.out.println("最大值： " + max +"最大值在数组中的位置:" + position1);

        double min = d1[0];
        int position = 0;
        for (int j = 0; j < d1.length; j++) {
            if(d1[j] < min){
                min=d1[j];
            }
            if (min == d1[j]){
                position = j+1;
            }

        }
        System.out.println("最小值：" + min + "最小值在数组中的位置:" + position);



        double total = 0;
        for (int k = 0; k < d1.length; k++) {
            total += d1[k];
        }
        System.out.println("总和："+total);


    }
}
