package day20191017;

import java.io.File;
import java.util.Date;

/**
 * 在src根目录下创建FileInfo类，在该类的主方法中创建文件对象，通过File类的相关方法，获取文件的相关信息
 *
 * @author zch
 *
 */
public class Test_01 {
    public static void main(String[] args) {

        String filePath = "src/com/zch/io/FileInfo.java";
        // 根据指定路径创建文件对象
        File file = new File(filePath);
        System.out.println("文件名称:" + file.getName());
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("文件的相对路径：" + file.getPath());
        System.out.println("文件的绝对路径：" + file.getAbsolutePath());
        System.out.println("是否为可执行文件：" + file.canExecute());
        System.out.println("文件可以读取：" + file.canRead());
        System.out.println("文件可以写入：" + file.canWrite());
        System.out.println("文件上级路径：" + file.getParent());
        System.out.println("文件大小：" + file.length() + "B");
        System.out.println("文件最后修改时间：" + new Date(file.lastModified()));
        System.out.println("是否文件类型：" + file.isFile());
        System.out.println("是否为文件夹：" + file.isDirectory());

    }

}



