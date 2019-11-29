package lab_03.Test_09;

import java.io.*;
import java.util.ArrayList;

public class BookList {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        bookList.raw();
    }

    ArrayList<Book> book = new ArrayList<>();
    public void raw(){
        try {
            FileReader fileReader = new FileReader("D:\\javatxt\\books.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            File f = new File("D:\\javatxt\\bookss.txt");
            if(!f.exists()){
                try {
                    f.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            FileWriter fileWriter = new FileWriter(f);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String strline = reader.readLine();
            writer.write(strline+"\r\n");
            while ((strline=reader.readLine()) != null){
                String str[] =strline.split("\\s{2,}");
                book.add(new Book(str[0],str[1],str[2],str[3],str[4]));
            }
            book.get(2).increase(20);
            book.get(3).increase(30);
            for (int i = 0; i < book.size() ; i++) {
                writer.write(book.get(i).toString());
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
