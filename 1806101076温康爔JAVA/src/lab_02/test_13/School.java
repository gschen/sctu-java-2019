package lab_02.test_13;

class School extends ComputerAverage {

    @Override
    double average(int a, double[] data) {
        return 0;
    }
    double []data;
    School(){

    }
    School(double []data){
        this.data=data;
    }
    public double average(double[] data) {
        double sum=0;
        for(int i=0;i<data.length;i++){
            sum+=data[i];
        }
        sum=sum/data.length;
        return sum;
    }
}
