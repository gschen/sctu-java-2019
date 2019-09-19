package lab_02.text_05;

public class Cube {
    private int length;
    private int width;
    private int height;

    private Cube(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;

    }
    private void result(){
        int cuba = this.length * this.width * this.height;
        System.out.println("Ìå»ýÊÇ£º"+ cuba);
    }

    public static void main(String[] args) {
        Cube cube1=new Cube(5,8,6);


        cube1.result();
    }
}
