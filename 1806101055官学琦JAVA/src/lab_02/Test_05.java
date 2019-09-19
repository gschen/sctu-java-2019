package lab_02;

public class Test_05 {
    public static void main(String[] args) {
        Volume volume=new Volume(5,10,6);
        volume.print();
    }
}


class Volume{
    private float len;
    private float height;
    private float lg;
    public Volume(float len,float height,float lg){
        this.height=height;
        this.len=len;
        this.lg=lg;
    }
    public float vl(){
        return lg*len*height;
    }

    public float getHeight() {
        return height;
    }

    public float getLen() {
        return len;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLg() {
        return lg;
    }

    public void setLen(float len) {
        this.len = len;
    }

    public void setLg(float lg) {
        this.lg = lg;
    }
    public void print(){
        System.out.println("当前立方体的体积为："+this.vl());
    }
}





