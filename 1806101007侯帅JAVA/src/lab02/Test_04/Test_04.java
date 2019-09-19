package lab02.Test_04;

 class Staff {
    //属性
    private String name;
    private String numb;
    private float money;
    private float up;
    /* 方法 */
    private void getName(){
        System.out.println("员工的名字是："+this.name);
    }
    private void getNumb(){
        System.out.println("员工的工号是："+this.numb);
    }

    private void getMoney(){
        System.out.println("员工的工资是："+this.money);
    }
    private void getUp(){
        System.out.println("工资的增加额度："+this.up);
    }
    private void sum(){
        System.out.println("增加额度后的工资总额："+(this.up+this.money));
    }

    public static void main(String[] args) {
        Staff st= new Staff();
        st.money = 100000;
        st.name = "王麻子";
        st.numb = "1433223";
        st.up = 6000;
        st.getMoney();
        st.getName();
        st.getNumb();
        st.getUp();
        st.sum();
    }
}
