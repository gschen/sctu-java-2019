package tongleer;


import java.awt.Point;
import java.util.Iterator;
import java.util.Vector;

    public class MIN {
        public static HandleCsv csvread=new HandleCsv();
        public static String[] lis=csvread.Handle();
        public static final int k =lis.length/2 ;
        public static double[][] DistanceMatrix = new double[k][k];
        public static Vector<Vector<Point>> cluster = new Vector();

        public static double distance(Point p0, Point p1) {
            double distance;
            distance = Math.pow(p0.getX() / 10000 - p1.getX() / 10000, 2)
                    + Math.pow(p0.getY() / 10000 - p1.getY() / 10000, 2);
            distance = Math.sqrt(distance);
            return distance;
        }

        public static void Algorithm(Point[] p0) {
            // 1.compute distance matrix
            for (int i = 0; i < p0.length; i++) {
                for (int j = i; j < p0.length; j++) {
                    double result = distance(p0[i], p0[j]);

                    DistanceMatrix[i][j] = result;
                }
            }
            double max = (double) 0;
            for (int i = 0; i < cluster.size(); i++) {
                for (int j = i + 1; j < cluster.size(); j++) {
                    for (int ii = 0; ii < cluster.get(i).size(); ii++) {
                        for (int jj = 0; jj < cluster.get(j).size(); jj++) {
                            double dstc = distance(cluster.get(i).get(ii), cluster.get(j).get(jj));
                            if (dstc > max) {
                                max = dstc;
                            }
                        }
                    }
                }
            }

            int r1 = 0, r2 = 0;
            while (cluster.size() != 1) {
                double min = max;
                for (int i = 0; i < cluster.size(); i++) {
                    for (int j = i + 1; j < cluster.size(); j++) {
                        for (int ii = 0; ii < cluster.get(i).size(); ii++) {
                            for (int jj = 0; jj < cluster.get(j).size(); jj++) {
                                double dstc = distance(cluster.get(i).get(ii), cluster.get(j).get(jj));
                                if (dstc < min) {
                                    min = dstc;
                                    r1 = i;
                                    r2 = j;
                                }
                            }
                        }
                    }
                }
                for (int k = 0; k < cluster.get(r2).size(); k++) {
                    cluster.get(r1).add(cluster.get(r2).get(k));
                }
                cluster.removeElementAt(r2);
                System.out.println("***");
                for(int i=0;i<cluster.size();i++){
                    System.out.print("{");
                    for(int j=0;j<cluster.get(i).size();j++){
                        System.out.print(cluster.get(i).get(j));
                    }
                    System.out.println("}");
                }
                System.out.println("***");
            }
        }

        public static void main(String[] args) {
//            // TODO Auto-generated method stub
            Point[] p = new Point[k];
//            p[0] = new Point(31, 102);
//            p[1] = new Point(41, 80);
//            p[2] = new Point(41, 80);
//            p[3] = new Point(40, 81);
//            p[4] = new Point(38, 105);
//            p[5] = new Point(47, 88);
//            System.out.println(p.length);
            System.out.println(p.length);
            int k_num=0;
            for (int i=0;i<lis.length;i=i+2){
                double a1=Double.valueOf(lis[i])*100000;
                double a2=Double.valueOf(lis[i+1])*100000;
                int x1=(int)a1;
                int x2=(int)a2;
//                System.out.println(x1);
//                System.out.println(x2);
                p[k_num]=new Point(x1,x2);

                k_num+=1;

            }
            System.out.println(k_num);
            System.out.println(p.length);
            System.out.println(lis.length);


            for (int i = 0; i < k; i++) {
                Vector<Point> clst = new Vector();


                clst.addElement(p[i]);
                cluster.addElement(clst);
            }

            Algorithm(p);
        }
    }

