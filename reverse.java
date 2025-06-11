public class reverse{
    public static void main(String args[]){
        int n = 10899;
        int ld,reverse=0;
        while (n>0){
            ld=n%10;
            reverse=reverse*10+ld;
            n=n/10;
        }
        System.out.print(reverse);
    }
}
   