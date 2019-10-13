package Lab02.Test06;

public class Triangle
{
    double length1,length2,length3;//girth,area;
    Triangle(double x,double y,double z)
    {
        length1 = x;
        length2 = y;
        length3 = z;
    }
    void set_length1(double length1)
    {
        this.length1 = length1;
    }
    void set_length2(double length2)
    {
        this.length2 = length2;
    }
    void set_length3(double length3)
    {
        this.length3 = length3;
    }
    double get_length1()
    {
        return this.length1;
    }
    double get_length2()
    {
        return this.length2;
    }
    double get_length3()
    {
        return this.length3;
    }
    double comarea()
    {
        double p;
        double area;
        p = (length1 + length2 + length3)/2.0f;
        area = Math.sqrt(p*(p - length1)*(p - length2)*(p - length3));
        return area;
    }
    float comgirth()
    {
        double girth;
        girth = length1 + length2 + length3;
        return (float) girth;
    }

}

