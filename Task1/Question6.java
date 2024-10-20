package GUVI_CLASSTASKS.Task1;
public class Question6 {
    public static void main(String[] args) {
        int k=5;
        for (int i=0;i<5;i++){
            for(int j=k;j>0;j--){
                if((i+j)>k){
                    System.out.print(j+" ");
                }else{
                    System.out.print(k-i+" ");
                }
            }
            System.out.println();
        }
    }
}
