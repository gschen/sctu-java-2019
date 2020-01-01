package tongleer;

public class Test {
        private int popSize = 4; // 种群数量
        private int maxgens = 20; // 迭代次数
        private double pxover = 1.0; // 交叉概率
        private double pmultation = 0.01; // 变异概率
        long max = 0;
        private class genotype {
            int num[] = new int[5]; // 单个基因的序列
            long fitness; // 该基因的适应度
            double selectP; // 选择概率
        }

        private genotype[] gens = new genotype[popSize];
        /**
         * 构造函数，初始化种群
         */
        public Test() {
            for (int i = 0; i < popSize; i++) {
                gens[i] = new genotype();
                int[] num = new int[5];
                for (int j = 0; j < 5; j++) {
                    int rd = Math.random()>0.5?1:0;
                    num[j] = rd;
                }
                gens[i].num = num;
                gens[i].fitness = 0;
                gens[i].selectP = 0;
            }
        }

        public void run() {
            int num = 1;
            while(maxgens > 0) {
                System.out.println("----第 " + (num++) + " 代----");
                calAll();
                print();
                pad();
                crossover();
                mutate();
                maxgens--;
            }
        }

        private void calAll() {
            calFitness();
            calSelectP();
        }

        private void calFitness() {
            for(int i=0; i<popSize; i++) {
                long fitness = 0;
                for(int j=0; j<gens[i].num.length; j++) {
                    fitness = fitness*2 + gens[i].num[j];
                }
                fitness = (long) Math.pow(fitness, 2);
                gens[i].fitness = fitness;
                if(max < fitness) max = fitness;
            }
        }

        private void calSelectP() {
            long sum = 0;
            for (int i=0; i<popSize; i++)
                sum += gens[i].fitness;
            for (int i=0; i<popSize; i++)
                gens[i].selectP = (double) gens[i].fitness/sum;
        }

        private void print() {
            for(int i=0; i<popSize; i++) {
                for(int j=0; j<5; j++) System.out.print(gens[i].num[j]);
                System.out.print("(" + gens[i].fitness + ") ");
            }
            System.out.println();
            System.out.println("最大值是：" + max);
        }

        private void pad() {
            genotype[] genos = new genotype[popSize];
            for(int i=0; i<popSize; i++) {
                int k = selectN();
                genos[i] = gens[k];
            }
            gens = genos;
        }

        private int selectN() {
            double rd = Math.random();
            double[] isSelP = new double[popSize];
            double r = 0.0;
            for(int i=0; i<popSize; i++) {
                r += gens[i].selectP;
                isSelP[i] = r;
            }
            for(int i=0; i<popSize; i++) {
                if(rd<isSelP[i]) return i;
            }
            return 0;
        }

        private void crossover() {
            int pop = (int) (popSize * pxover / 2);
            while (pop > 0) {
                int x = (int) (Math.random() * popSize);
                int y = (int) (Math.random() * popSize);
                executeCrossover(x, y);
                pop --;
            }
        }

        private void executeCrossover(int x, int y) {
            genotype[] genos = new genotype[popSize];
            for(int i=0; i<popSize; i++) {
                int k = selectN();
                genos[i] = gens[k];
            }
            gens = genos;
            int m = (int) (Math.random() * 5);
            int n = (int) (Math.random() * 5);
            int start = m<=n?m:n;
            int end = m>=n?m:n;
            for(int i=start; i<=end; i++) {
                gens[x].num[i] = gens[y].num[i];
            }
        }

        private void mutate() {
            int pop = (int) (popSize * pmultation);
            while (pop > 0) {
                int x = (int) (Math.random() * popSize);
                executeMutate(x);
                pop --;
            }
        }

        private void executeMutate(int x) {
            int i = (int) (Math.random() * 5);
            if(gens[x].num[i] == 0) {
                gens[x].num[i] = 1;
            } else {
                gens[x].num[i] = 0;
            }
        }

        public static void main(String[] args) {
            Test test = new Test();
            test.run();
        }
}
