package MissionsDay2;

public class Mission1 {
    public static boolean isPalindrome(int num){

        num = Math.abs(num);
        int normalNum = num;
        int reverse = 0;

        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return normalNum == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-55000055));
    }

    //StringBuilder'ın reverse() metodu sayesinde orijinal metni
    // değiştirmeden kolayca tersine çevirebiliriz. Bu, metin
    // işlemlerinde veya dizi işlemlerinde oldukça faydalı bir işlemdir.
}
