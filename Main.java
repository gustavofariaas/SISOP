public class Main {
    

    
    public static final int SIZE = 100;

    public static void main(String[] args){
        
        int[][] m1 = new int[SIZE][SIZE];
        int[][] m2 = new int[SIZE][SIZE];
        int[][] result = new int[SIZE][SIZE];


        int k=1;
        for (int i=0 ; i<SIZE; i++) {
            for (int j=0 ; j<SIZE; j++) {
                if (k%2==0)
                    m1[i][j] = -k;
                else
                    m1[i][j] = k;
            }
            k++;
        }
        k=1;
        for (int j=0 ; j<SIZE; j++) {
            for (int i=0 ; i<SIZE; i++) {
                if (k%2==0)
                    m2[i][j] = -k;
                else
                    m2[i][j] = k;
            }
            k++;
        }

        int nThreads = (m1.length)/4;

        Thread[] t = new Thread[nThreads];
        
        long inicio = System.nanoTime(); 
        //NAO USADO
        // for (int l = 0; l < m1.length; l++) {
        //     for (int col = 0; col < m2[0].length; col++) {
        //         t[i] = new Thread(new MyRunnableThread(l, col, m1, m2, result));
        //         t[i].start();
        //         t[i].join();
        //         ++i;
        //     }
        // }

        for (int j = 0; j < nThreads; j++) {
            
                t[j] = new Thread(new MyRunnableThread(l, col, m1, m2, result));
                t[j].start();
                                
        }
        long fim = System.nanoTime();
        double total = (fim-inicio)/1000000000.0;

        System.out.println("Tempo: " + total);

    }

}

