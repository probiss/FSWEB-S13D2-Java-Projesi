package MissionsDay2;

public class Mission2 {
    public static boolean isPerfectNumber(int num) {
        if( num <= 0) {
            return false;
        }

        int perfect = 0;

        for(int i = 1; i <= num/2 ; i++) {
            if (num % i == 0) {
                perfect += i;
            }
        }
        return  perfect == num;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
    }
