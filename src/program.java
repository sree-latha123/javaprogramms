public class program {
    public static void main(String[] args){
        int num=123, rev=0;
        System.out.println("input number is "+num);
        for(;num!=0;)
        {
            int n=num%10;
            rev=rev*10+n;
            num=num/10;

        }
        System.out.println("Reverse number is "+rev);

        }
    }

