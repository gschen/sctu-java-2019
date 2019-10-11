package Lab03;

import java.io.File;

public class ListFile02 {
        public void listJavaFile(String fileName) {
            File file = new File(fileName);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName();
                    if (name.trim().toLowerCase().endsWith("")) {
                        System.out.println(name + "\t");
                    }
                    if (files[i].isDirectory()) {
                        String path = files[i].getPath();
                        listJavaFile(path);
                    }
                }
            }
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            ListFile02 listfile = new ListFile02();
            listfile.listJavaFile("D:\\Program Files\\Java\\jdk-12");
        }

    }
