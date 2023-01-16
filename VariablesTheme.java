public class VariablesTheme {
    public static void main(String[] args) {
        createVariables();
        calculateDiscountPrice();
        printJava();
        printMinMax();
        swapVariables();
        printSymbolCode();
        printAsciiDuke();
        printDigits();
        printTime();
    }

    private static void createVariables() {
        System.out.println("1. Создание переменных и вывод их значений на консоль\n");

        byte processorCoreQuantity = 4;
        boolean isComputerNote = true;
        short memorySize = 8192;
        int coreFrequency = 2200;
        long diskVolume = 2147483648L;
        float screenDiag = 14.1f;
        double accVolume = 5000.15d;
        char modelIndex = 'S';

        System.out.println("Количество ядер в процессоре: " + processorCoreQuantity + " шт");
        System.out.println("Этот компьютер ноутбук? " + isComputerNote);
        System.out.println("Обьем оперативной памяти: " + memorySize + " Мгб");
        System.out.println("Частота каждого ядра: " + coreFrequency + "Мгц");
        System.out.println("Объем жесткого диска: " + diskVolume + " бит");
        System.out.println("Диагональ экрана: " + screenDiag + "дюймов");
        System.out.println("Емкость батареи: " + accVolume  + " mAh");
        System.out.println("Индекс модели: " + modelIndex);
    }

    private static void calculateDiscountPrice() {
        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int penPrice = 100; 
        int bookPrice = 200;
        int discount = 11;
        int discountPrice = 0;

        discount = (penPrice + bookPrice) / 100 * discount;
        discountPrice = penPrice + bookPrice - discount;
        System.out.println("Сумма скидки: " + discount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice + " руб."); 
    }

    private static void printJava() {
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J   a  v     v  a");
        System.out.println("   J  a a  v   v  a a");
        System.out.println("J  J aaaaa  V V  aaaaa");
        System.out.println(" JJ a     a  V  a     a");
    }

    private static void printMinMax() {
        System.out.println("\n4. Отображение min и max значений числовых типов данных");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;

        System.out.printf("Byte: %d %d %d", maxByte, ++maxByte, --maxByte);
        System.out.printf("\nShort: %d %d %d", maxShort, ++maxShort, --maxShort);
        System.out.printf("\nInteger: %d %d %d", maxInt, ++maxInt, --maxInt);
        System.out.printf("\nLong: %d %d %d\n", maxLong, ++maxLong, --maxLong);
    }

    private static void swapVariables() {
        System.out.println("\n5. Перестановка значений переменных");

        int a = 2;
        int b = 5;
        int temp = 0;

        System.out.println("Исходные значения: a = " + a + ", b = " + b);

        System.out.println("\nС помощью третьей переменной: ");
        temp = a;
        a = b;
        b = temp;
        System.out.println("Результат: a = " + a + ", b = " + b);

        System.out.println("\nC помощью арифметических операций: ");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Результат: a = " + a + ", b = " + b);

        System.out.println("\nC помощью побитовой операции ^ : ");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Результат: a = " + a + ", b = " + b);
    }

    private static void printSymbolCode() {
        System.out.println("\n6. Вывод символов и их кодов");

        char symbol35 = '#';
        char symbol38 = '&';
        char symbol64 = '@';
        char symbol94 = '^';
        char symbol95 = '_';

        System.out.println((int) symbol35 + " " + symbol35);
        System.out.println((int) symbol38 + " " + symbol38);
        System.out.println((int) symbol64 + " " + symbol64);
        System.out.println((int) symbol94 + " " + symbol94);
        System.out.println((int) symbol95 + " " + symbol95);
    }

    private static void printAsciiDuke() {
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backSlash = '\\';
        char openBracket = '(';
        char closeBracket = ')';
        char underScore = '_';

        System.out.println("    " + slash + backSlash + "    ");
        System.out.println("   " + slash + "  " + backSlash + "   ");
        System.out.println("  " + slash + underScore + openBracket + " " + closeBracket + 
                backSlash + "  ");
        System.out.println(" " + slash + "      " + backSlash + " ");
        System.out.println("" + slash + underScore + underScore + underScore + slash + backSlash + 
                underScore + underScore + underScore + backSlash);
    }

    private static void printDigits() {
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");

        int number = 123;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        int allNumberAddition = 0;
        int allNumberMultiplication = 0;

        System.out.println("Число " + number + " содержит:");
        hundreds = number / 100;
        number %= 100;
        tens = number / 10;
        ones = number % 10;
        System.out.println(hundreds + " сотня");
        System.out.println(tens + " десяткa");
        System.out.println(ones + " единицы");
        allNumberAddition = hundreds + tens + ones;
        System.out.println("Сумма его цифр = " + allNumberAddition);
        allNumberMultiplication = hundreds * tens * ones;
        System.out.println("Произведение = " + allNumberMultiplication);
    }

    private static void printTime() {
        System.out.println("\n9. Вывод времени");

        int initialSecs = 86399;
        int secs = 0;
        int mins = 0;
        int hours = 0;

        mins = initialSecs / 60;
        secs = initialSecs % 60;
        hours = mins / 60;
        mins %= 60;
        System.out.println(hours + ":" + mins + ":" + secs);
    }
}
