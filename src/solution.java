public class solution {
    public int[] multiply(int[] A) {
        int[] b=new int[A.length];
        for(int i=0;i<A.length;i++){
            b[i]=multiplyA(A,i);
        }
        return b;
    }

    private int multiplyA(int[] A, int i) {
        int sum=1;
        for(int j=0;j<i;j++){
            sum=sum*A[j];
        }
        //没有第i项
        for(int k=i+1;k<A.length;k++){
            sum=sum*A[k];
        }
        return sum;
    }
}
