package KataCalc;

public class RomanNumbersCalculation {
    public static String[] inputRomans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public static String[] romanNumbers = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static int[] arabNumbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int romanArabicConverter(String a){
        int x  =0;
        for (int i = 0; i<inputRomans.length; i++){
            if(a.equals(inputRomans[i])){
                x= i+1;
                break;
            }
        }

        if (x==0){
            throw new IllegalArgumentException("Число не от I до X");
        }
        return x;

    }

    public static String arabicRomanCoverter(int a){
        StringBuilder romanNumber = new StringBuilder();
        int i = 0;
        while (a>0){
            if ((a-arabNumbers[i]) >=0){
                a-=arabNumbers[i];
                romanNumber.append(romanNumbers[i]);
            } else {
                i++;
            }

        }
        return romanNumber.toString();
    }


    public static String plus (String a , String b){
        int x = romanArabicConverter(a);
        int y = romanArabicConverter(b);
        int result = x+y;
        if (result<=0){
            throw new IllegalArgumentException("Не может быть отрицательного числа");

        } return arabicRomanCoverter(result);
    }

    public static String minus (String a , String b){
        int x = romanArabicConverter(a);
        int y = romanArabicConverter(b);
        int result = x-y;
        if (result<=0){
            throw new IllegalArgumentException("Не может быть отрицательного числа");

        } return arabicRomanCoverter(result);
    }

    public static String umn (String a , String b){
        int x = romanArabicConverter(a);
        int y = romanArabicConverter(b);
        int result = x*y;
        if (result<=0){
            throw new IllegalArgumentException("Не может быть отрицательного числа");

        } return arabicRomanCoverter(result);
    }


    public static String del (String a , String b){
        int x = romanArabicConverter(a);
        int y = romanArabicConverter(b);
        int result = x/y;
        if (result<=0){
            throw new IllegalArgumentException("Не может быть отрицательного числа");

        } return arabicRomanCoverter(result);
    }
}
