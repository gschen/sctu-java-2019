package lab_02.Test_36;

public abstract class Student {
    String name;
    String category;
    int[] course = new int[3];
    String grade;

    public  double  average(){
        for (int i=0;i<course.length;i++){
            double sum = 0;
            sum += course[i];
            return sum;
        }
        return 0;
    }
}
