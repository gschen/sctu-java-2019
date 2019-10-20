package src.boke1;

public class Employee {
    public static Employee[] employees = new Employee[10000];
    protected Integer id;
    private String name;
    private String salary;
    private String sex;

    public Employee(){

    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSalary(String next) {
        return salary;
    }


    public void setSalary(String salary) {
        this.salary = salary;
    }


    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }

    public void show() {
        System.out.println(id+"\t"+name+"\t"+sex+"\t"+salary);
    }

}
