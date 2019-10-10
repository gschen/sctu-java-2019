package lab_02;

    class Student2 extends Person{
        String snumber;
        String school_name;
        public String getInfo(){
            return super.getInfo()+" "+snumber+" "+school_name;
        }
    }

