package MissionsDay2;

public class Mission3 {
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        // switch-case yerine daha mantıklı gibi.
        String[] words = {
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };

        // Burada log10 basamak sayınısı bulmak için basit bir logaritma aslında.
        int numDigits = (int) Math.log10(number) + 1;

        StringBuilder result = new StringBuilder();
        //StringBuilder nesnesini metin birleştirme işlemleri için kullanarak
        // daha verimli ve performanslı bir çözüm elde etmeyi sağlarız.
        // Bu nedenle metin manipülasyonlarında StringBuilder tercih edilir.

        //(int) şeklinde yazmamızın nedeni veri tür dönüşümü çin kullanımıdır.
        // double resultDouble = Math.pow(2, 3);
        // Sonuç 8.0 (double türünde)
        // int resultInt = (int) resultDouble;
        // Sonuç 8 (int türünde)

        //Burada önce basamak sayısını netleştirip, append ediyoruz bir adet boşluk ile.
        for (int i = numDigits - 1; i >= 0; i--) {
            int digit = (int) (number / Math.pow(10, i)) % 10;
            result.append(words[digit]).append(" ");
        }
        //boşluksa son eleman silmek için...
        if (result.charAt(result.length() - 1) == ' ') {
            result.deleteCharAt(result.length() - 1);
        }
        //return önemli...
        return result.toString();
    }
    //mainde tanıtmadıkça göremeyiz...!
    public static void main(String[] args) {
        System.out.println(numberToWords(567));
    }
}
