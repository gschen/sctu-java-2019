package lab_02.Test_10;

public class BeiJingPeople extends ChinaPeople{
    String city;
    public BeiJingPeople(String name,String country,String city){
        super("sam","BeiJing");
        this.name = name;
        this.country = country;
        this.city = city;
        }

    @Override
    public String toString() {
        return "BeiJingPeople{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}