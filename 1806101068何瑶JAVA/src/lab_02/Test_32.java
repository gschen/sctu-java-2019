package lab_02;
import java.util.HashMap;
import java.util.Map;
public class Test_32 {
    Test_32(){
        Map<String,String>person=new HashMap<>();
        person.put("id","1");
        person.put("name","张三");
        person.put("sex","男");
        person.put("age","25");
        person.put("love","爱学java");
        System.out.println("id---->"+person.get("id"));
        System.out.println("name---->"+person.get("张三"));
        System.out.println("sex---->"+person.get("男"));
        System.out.println("age---->"+person.get("25"));
        System.out.println("love---->"+person.get("爱学java"));
        System.out.println("改变前的容量大小为"+person.size());
        System.out.println("删除的值为"+person.remove("age"));
        System.out.println("改变后的容量大小为"+person.size());
    }

    public static void main(String[] args) {
        new Test_32();
    }
}
