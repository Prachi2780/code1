public class pattern {
    public static void main(String[] args) {
        for(int i=9;i>=1;i-=2)
        {
            for(int j=i;j<=9;j+=2)
            {
                if(i>=j)
                {
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
