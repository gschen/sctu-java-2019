package lab_02;

abstract class Test_36 {
    final static int CoursrNo=3;
    String name;
    String type;
    int[] courses;
    String courseGrade;
    public Test_36(String name){
        this.name=name;
        courses=new int[CoursrNo];
        this.courseGrade=" ";
    }
    public abstract void calculateGrade();
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public String getCourseGrade(){
        return courseGrade;
    }
    public int getCourseScore(int courseNumber){
        return courses[courseNumber];
    }
    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setCourseScore(int courseNumber,int courseScore){
        courses[courseNumber]=courseScore;

  }
}
class Undergraduate extends Test_36{
    public Undergraduate(String name){
        super(name);
        type="本科生";
    }
    public void calculateGrade(){
        int totle=0;
        double average=0;
        for (int i=0;i<CoursrNo;i++){
            totle+=courses[i];
        }
        average=totle/CoursrNo;
        if (average>=80&&average<=100)
            courseGrade="优秀";
       else if (average>=70&&average<80)
            courseGrade="良好";
       else if (average>=60&&average<70)
            courseGrade="一般";
       else if (average>=50&&average<60)
            courseGrade="及格";
       else courseGrade="不及格";
    }
}
class Postgraduate extends Test_36{
    public Postgraduate(String name){
        super(name);
        type="研究生";
    }
    public void calculateGrade(){
        int total=0;
        double average=0;
    for(int i=0;i<CoursrNo;i++){
        total+=courses[i];
    }
    average=total/CoursrNo;
        if (average>=90&&average<=100)
            courseGrade="优秀";
        else if (average>=80&&average<90)
            courseGrade="良好";
        else if (average>=70&&average<80)
            courseGrade="一般";
        else if (average>=60&&average<70)
            courseGrade="及格";
        else courseGrade="不及格";
    }
}
class Polymorpphism{
    public static void main(String[] args) {
        Test_36[] student=new Test_36[5];
        student[0]=new Undergraduate("张三");
        student[1]=new Undergraduate("李四");
        student[2]=new Postgraduate("王五");
        student[3]=new Undergraduate("赵六");
        student[4]=new Postgraduate("陈七");
        for (int i=0;i<5;i++){
            student[i].setCourseScore(0,(90+95+100)/3);
            student[i].setCourseScore(1,(80+85+90)/3);
            student[i].setCourseScore(2,(82+85+88)/3);
            student[i].setCourseScore(3,(75+82+87)/3);
            student[i].setCourseScore(4,(80+82+84)/3);
        }
        for (int i=0;i<5;i++)
            student[i].calculateGrade();
        System.out.println("姓名"+"类型"+"成绩");
        System.out.println("--------------------");
        for (int i=0;i<5;i++){
            System.out.println(student[i].getName()+" "+student[i].getType()+" "+student[i].getCourseGrade());
        }
    }
}