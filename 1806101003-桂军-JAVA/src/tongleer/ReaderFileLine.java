package tongleer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author :
 * @date : 2018/8/30
 * @description:
 */
public class ReaderFileLine {

    /**
     * @author:
     * @date:2018/8/30
     * @description:从txt文件读取List<String>
     */
    public static List<String> getFileContent(String path) {
        List<String> strList = new ArrayList<String>();
        File file = new File(path);
        InputStreamReader read = null;
        BufferedReader reader = null;
        try {
            read = new InputStreamReader(new FileInputStream(file),"utf-8");
            reader = new BufferedReader(read);
            String line;
            while ((line = reader.readLine()) != null) {
                strList.add(line);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
        return strList;
    }

    public static void main(String[] args) {
        List<String> fileContent =
                ReaderFileLine.getFileContent("C:\\Users\\Agoni\\Desktop\\竞赛\\sss.txt");
        for (String s : fileContent) {
            System.out.println(s);
        }

    }
    public ArrayList arrayList(){
        ArrayList data_list=new ArrayList();
        List<String> fileContent =
                ReaderFileLine.getFileContent("C:\\Users\\Agoni\\Desktop\\竞赛\\sss.txt");
        for (String s : fileContent) {
            System.out.println(s);
            data_list.add(s);
        }
        return data_list;
    };

}