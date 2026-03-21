public class pelendrome {
    public boolean ispeledrome(int s){

     s = 121;

        if (s < 0) return false;

        int org = s;
        int reverse = 0;

        while(s!=0){
            int digit = s%10;
            reverse = reverse *10+digit;
            s = s/10;
        }

        return org == reverse;
    }

}
