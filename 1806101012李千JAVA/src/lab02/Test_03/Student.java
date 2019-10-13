package lab02.Test_03;

public class Student {

      //属性   计算机成绩，数学成绩，英语成绩
        int compture;
        int match;
        int english;

        //行为方法
        //总分
        public int sum() {
            return compture+match+english ;
        }
        //平均分
        public int  average(){
            int aver;
            return aver=(compture+match+english)/3;
        }
        //最高分
        public int highest(){
            int hig;
            return hig = ( compture>match?compture>english?compture:english:match>english?match:english);
        }

        //最低分
        public int lowest(){
            int min = compture;
            if (match> min) {
                min = match;
            }
            if (english > min) {
                min = english;
            }
           return compture;
        }


        //主方法入口
        public static void main(String[] args) {
           Student st = new Student();
            st.compture=80;
            st.match=90;
            st.english=100;
            System.out.println("总分："+ st.sum());
            System.out.println("平均分："+ st.average());
            System.out.println("最高分："+ st.highest());
            System.out.println("最低分："+ st.lowest());



        }





        }








