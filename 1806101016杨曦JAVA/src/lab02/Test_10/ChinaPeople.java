package lab02.Test_10;

public class ChinaPeople extends People {


        private int weight;
        private int height;
        public void speakHELLO () {
            System.out.println("你好");
        }
        public void averageHeight () {
            height = 178;
            System.out.println("中国人的平均身高：" + height + "厘米");
        }
        public void averageWeight () {
            weight = 70;
            System.out.println("中国人的平均体重：" + weight + "公斤");
        }
        public void chinaGongfu () {
            System.out.println("坐如钟，站如松");
        }
    }

