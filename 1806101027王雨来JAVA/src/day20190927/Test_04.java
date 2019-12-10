package day20190927;

public class Test_04 {
    public static void main(String[] args) {
//字符串，输入你自己写
        String s="aDEfG";
//转换为CHAR数组
        char[] cs=s.toCharArray();
//倒着处理
        for(int i=cs.length-1;i>=0;i--){
//小写转大写
            if(cs[i]>='a'&&cs[i]<='z'){
                System.out.print(String.valueOf(cs[i]).toUpperCase());
                continue;
            }
//否则转小写
            if(cs[i]>='A'&&cs[i]<='Z'){
                System.out.print(String.valueOf(cs[i]).toLowerCase());
            }
        }
    }
}
