package lab02.Test_09;

public class Student {
        Student(String xuehao,String banhao,String name,String sex,int age){
            this.xuehao = xuehao;
            this.banhao = banhao;
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        //“学号”、“班号”、“姓名”、“性别”、“年龄”
        String xuehao;
        String banhao;
        String name;
        String sex;
        int age;
        //获得学号”、“获得班号”、“获得性别”、“获得姓名”、“获得年龄”
        void getxuehao(){
            System.out.println("学号为：" + xuehao);;
        }
        void getbanhao(){
            System.out.println("班号为：" + banhao);
        }
        void getname(){
            System.out.println("姓名：" + name);
        }
        void getsex(){
            System.out.println("性别：" + sex);
        }
        void getage(){
            System.out.println("年龄：" + age);
        }
        public String toString(){
            return "学号:"+xuehao+"班号:"+banhao+"姓名："+name+"性别："+sex+"年龄"+age;
        }
        public static void main(String[] args) {
            Student student = new Student("18010634","1","zhu","男",2);
            student.getage();
            student.getbanhao();
            student.getname();
            student.getsex();
            student.getxuehao();
            System.out.println(student.toString());
        }
}
