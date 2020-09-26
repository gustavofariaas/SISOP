public class MyRunnableThread implements Runnable{

    
    private int m1[][];
    private int m2[][];
    private int result[][];

    public MyRunnableThread(int m1[][], int m2[][], int result[][]) {
        this.m1 = m1;
        this.m2 = m2;
        this.result = result;
    }

    @Override
    public void run() {
        //NAO USADO
        // for (int i = 0; i < m1[0].length; i++) {
        //     result[lin][col] += m1[lin][i] * m2[i][col];
        // }
        for (int i=0 ; i<result.length; i++) {
            for (int j=0 ; j<result[0].length; j++) {
                result[i][j] = 0;
                for (int k=0 ; k<m2.length; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
    }
            
}

    
