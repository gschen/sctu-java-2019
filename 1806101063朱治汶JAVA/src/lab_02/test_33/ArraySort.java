package lab_02.test_33;

import java.util.*;

//next()和nextLine()的区别详解
/*next()方法在读取内容时，会过滤掉有效字符前面的无效字符，对输入有效字符之前遇到的空格键、Tab键
 *或Enter键等结束符，next()方法会自动将其过滤掉；只有在读取到有效字符之后，next()方法才将其后的
 * 空格键、Tab键或Enter键等视为结束符；所以next()方法不能得到带空格的字符串。
 */
/*nextLine()方法字面上有扫描一整行的意思，它的结束符只能是Enter键，即nextLine()方法返回的是
 *Enter键之前没有被读取的所有字符，它是可以得到带空格的字符串的。
 */

/*Collections：
 *1.Shuffle（element）：洗牌方法，将当前集合内的数据进行随机排序。
 *2.Reverse（element）：逆序排序，对当前集合的元素按照相反的顺序进行排序
 *3.Sort（element）：对当前集合进行升序排序,实现Comparable接口的类，只能使用一种排序方案，这种
 * 方案叫作“自然比较”方案。
 */



public class ArraySort {
    public static void main(String[] args) {
        Scanner  s=new Scanner(System.in);
        System.out.println("请输入数组：");
        String  str=s.nextLine();


        String [] st=str.split(" ");
        //Arrays.asList(st);
        List<String> li= Arrays.asList(st);
        Collections.sort(li,new Comparator<String>() {

            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.print(li);
    }
}
