public class VariablesTheme {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        byte processorCore = 4;
        boolean isComputerNote = true;
        short memorySize = 8192;
        int coreFrequency = 2200;
        long diskVolume = 2147483648L;
        float screenDiag = 14.1f;
        double accVolume = 5000.15d;
        String computerBrand = "Samsung";

        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        System.out.println("Количество ядер в процессоре: " + processorCore + " шт");
        System.out.println("Этот компьютер ноутбук? " + isComputerNote);
        System.out.println("Обьем оперативной памяти: " + memorySize + " Мгб");
        System.out.println("Частота каждого ядра: " + coreFrequency + "Мгц");
        System.out.println("Объем жесткого диска: " + diskVolume + " бит");
        System.out.println("Диагональ экрана: " + screenDiag + "дюймов");
        System.out.println("Емкость батареи: " + accVolume  + " mAh");
        System.out.println("Марка ноутбука: " + computerBrand);
    }

    public static void task2() {
        int penPrice = 100; 
        int bookPrice = 200;
        int discount = 11;
        int PriceWithDiscount;

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        discount = (penPrice + bookPrice) / 100 * discount;
        PriceWithDiscount = penPrice + bookPrice - discount;
        System.out.println("Сумма скидки: " + discount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + PriceWithDiscount + " руб."); 
    }

    public static void task3() {
        final char J = 'J';
        final char VCAP = 'V';
        final char V = 'v';
        final char A = 'a';

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.format("%4c%4c%3c%3$6c%2$3c\n", J, A, V);
        System.out.format("%1$4c%2$3c%2$2c%3$3c%3$4c%2$3c%2$2c\n", J, A, V);
        System.out.format("%c%1$3c%2c%2$c%2$c%2$c%2$c%3c%3$2c%2$3c%2$c%2$c%2$c%2$c\n", J, A, VCAP);
        System.out.format("%2c%1$c%2c%2$6c%3c%2$3c%2$6c", J, A, VCAP);
    }

    public static void task4() {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;

        System.out.println("\n\n4. Отображение min и max значений числовых типов данных");
        System.out.printf("Byte: %d %d %d", b, ++b, --b);
        System.out.printf("\nShort: %d %d %d", s, ++s, --s);
        System.out.printf("\nInteger: %d %d %d", i, ++i, --i);
        System.out.printf("\nLong: %d %d %d\n", l, ++l, --l);
    }

    public static void task5() {
        int a = 2;
        int b = 5;
        int tempStorage;

        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);

        System.out.println("\nС помощью третьей переменной: ");
        tempStorage = a;
        a = b;
        b = tempStorage;
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

    public static void task6() {
        final char sim35 = '#';
        final char sim38 = '&';
        final char sim64 = '@';
        final char sim94 = '^';
        final char sim95 = '_';

        System.out.println("\n6. Вывод символов и их кодов");
        System.out.println((int) sim35 + " " + sim35);
        System.out.println((int) sim38 + " " + sim38);
        System.out.println((int) sim64 + " " + sim64);
        System.out.println((int) sim94 + " " + sim94);
        System.out.println((int) sim95 + " " + sim95);
    }

    public static void task7() {
        char sl = '/';
        char backSl = '\\';
        char br = '(';
        char backBr = ')';
        char underscr = '_';

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        System.out.println("    " + sl + backSl + "    ");
        System.out.println("   " + sl + "  " + backSl + "   ");
        System.out.println("  " + sl + underscr + br + " " + backBr + backSl + "  ");
        System.out.println(" " + sl + "      " + backSl + " ");
        System.out.println("" + sl + underscr + underscr + underscr + sl + backSl + underscr +
                 underscr + underscr + backSl);
    }

    public static void task8() {
        int number = 123;
        int hundreds;
        int tens;
        int ones;

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        System.out.println("Число " + number + " содержит:");
        hundreds = number / 100;
        number %= 100;
        tens = number / 10;
        ones = number % 10;
        System.out.println(hundreds + " сотня");
        System.out.println(tens + " десяткa");
        System.out.println(ones + " единицы");
        number = hundreds + tens + ones;
        System.out.println("Сумма его цифр = " + number);
        number = hundreds * tens * ones;
        System.out.println("Произведение = " + number);
    }

    public static void task9() {
        int secs = 86399;
        int mins;
        int hours;

        System.out.println("\n9. Вывод времени");
        mins = secs / 60;
        secs %= 60;
        hours = mins / 60;
        mins %= 60;
        System.out.println(hours + ":" + mins + ":" + secs);
    }
}
