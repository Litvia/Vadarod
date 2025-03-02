package by.homework.lessons.task3;

public class DataType {
    public static void main(String[] args) {

            byte b = 127;//8 бит
            short shor = 32767;//16 бит
            int i = 32767;//32 бит
            long l = 1234567891245789l;//64 бит

            float f = 125.456F;//32 бит
            double d = 125.455675;//64 бит
            double newInt = i;
            double newFloat = f;

            double doub = 2.55;
            int doubleToInt = (int) doub;
        System.out.println(doubleToInt);

            char c = 'X';//16 бит
            char ch = 65535;//16 бит

        System.out.println("Простой символ " + c);
        System.out.println("Символ соответствующий номеру " + ch);

            short newShort = b;
            long newLongInt = i;
            int intChar = c;

        System.out.println("Это порядковый номер из Unicode" + intChar);

            int aq = 5;
            int bq = 2;
            //int cq = aq/bq;
            double cq = (double) aq / bq;
        System.out.println(cq);

        byte abc=60;
        byte ax =70;
        int abcax = abc*ax;
        System.out.println(abcax);

        int binaryValue = 010101010;
        int octal = 0723615;
        int hexadecimal = 0x10Af23;

        int h,j,k;  // int по умолчанию равен 0
        int r = 3, e, p;  //способы объявления переменных

        boolean boola = true;
        boolean boolb = false;  //boolean по умолчанию равен false
        System.out.print(boolb);
        }
    }