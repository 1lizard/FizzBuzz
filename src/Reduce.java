public class Reduce {
    public static void main(String[] args) {
        int q=100;
        int count=0;
        while(q>0){
            if (q%2==0){
                q=q/2;
            }
            else{
                q=q-1;
            }
            count++;
        }
        System.out.println(count);
    }
}
