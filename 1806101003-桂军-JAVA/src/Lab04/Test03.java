package Lab04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Test03 {
    public static void main(String[] args) {
        ReentrantLock r1=new ReentrantLock(); //定义一个互斥锁类型
        Condition c = r1.newCondition();//定义一个字母锁条件
        Condition c2 = r1.newCondition();//定义一个数字锁条件
        new Thread(new Runnable(){

            public void run() {

                try{//逻辑严谨性,定义一个try finally,保证一定释放锁;
                    r1.lock();//获取锁
                    for (int i = 1; i <=52; i++) {
                        System.out.println(i+" ");
                        if(i%2==0){
                            c.signalAll();//唤醒字母进程
                            try {
                                c2.await();//让数字进程等待
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                    }
                }finally{
                    r1.unlock();//释放锁
                }
            }

        }).start();



        new Thread(new Runnable(){
            @Override
            public void run() {

                try{
                    r1.lock();
                    for (int i = 0; i < 26; i++) {
                        System.out.println((char)('A' + i) + " ");
                        c2.signalAll();
                        try {
                            if(i!=25){//最后一个字母不用进入等待状态
                                c.await();
                            }

                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }

                    }
                }finally{
                    r1.unlock();
                }

            }
        }).start();

    }
}
