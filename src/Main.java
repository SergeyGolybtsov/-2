public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte a = 100;
        short b = 16542;
        int c = 64512;
        long d = 12643123;
        float f = 28.21f;
        double g =68.659867;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной g с типом double равно " + g);

        System.out.println("Задание 2");
        float n1 = 27.12f;
        long n2 = 987678965549L;
        double n3 = 2.786;
        boolean n4 = 11 < 10;
        char n5 = 596;
        short n6 = -159;
        int n7 = 27897;
        byte n8 = 67;
        System.out.println(n5);
        System.out.println(n4);

        System.out.println("Задание 3");
        short teacher1 = 23;
        short teacher2 = 27;
        short teacher3 = 30;
        short paper = 480;
        int student = teacher1 + teacher2 + teacher3;
        int sheet = paper / student;
        System.out.println("На каждого ученика расчитано " + sheet + " листов бумаги");

        System.out.println("Задание 4");
        byte car = 16 / 2; //за 1 мин
        int car20 = car * 20;
        System.out.println("За 20 минут машина произвела бутылок " + car20 + " штук");
        int carDay = car * (24*60);
        System.out.println("За сутки машина произвела бутылок " + carDay + " штук");
        int carDay3 = carDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + carDay3 + " штук");
        int carMonth = carDay * 30;
        System.out.println("За месяц машина произвела бутылок " + carMonth + " штук");

        System.out.println("Задание 5");
        byte brownPot = 4;
        byte whitePot = 2;
        byte totalPot = 4 + 2; //банок на класс
        byte pot = 120;
        int purchased = pot / totalPot; // всего классов
        int k1 = purchased * whitePot; // белой краски
        int k2 = purchased * brownPot; //коричневой краски
        System.out.println("В школе, где " + purchased + " классов, нужно " + k1 + " банок белой краски и " + k2 + " банок коричневой краски");

        System.out.println("Задание 6");
        int banana = 80; // вес 1 банана
        int milk = 105; // вес 100мл молока
        int iceCream = 100; // вес 1 мороженого
        int egg = 70; // вес 1 яйца
        float mix = (banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);
        float kg = mix / 1000;
        System.out.println(kg+ " кг");

        System.out.println("Задание 7");
        int l1 = 250; // в день
        int l2 = 500; // в день
        int l3 = 7 * 1000; // нужно скинуть грамм
        int l4 = l3 / l1; // нужно дней если 250 в день
        int l5 = l3 / l2; // нужно дней если 500 в день
        int l6 = (l4 + l5) / 2; // среднее количество дней
        System.out.println(l4 + " дней понадобится, если рацион будет 250 грамм в день");
        System.out.println(l5 + " дней понадобится, если рацион будет 500 грамм в день");
        System.out.println(l6 + " это среднее количество дней для похудения");

        System.out.println("Задание 8");
        float mash = 67760;
        float den = 83690;
        float kris = 76230;
        float procent = 10;
        float mash1 = (mash / 100) * procent;// увеличена ЗП на
        float den1 = (den / 100) * procent;// увеличена ЗП на
        float kris1 = (kris / 100) * procent;// увеличена ЗП на
        float mash2 = mash + mash1;//ЗП стала
        float den2 = den + den1;//ЗП стала
        float kris2 = kris + kris1;//ЗП стала
        System.out.println("Маша теперь получате " + mash2 + " рублей. Годовой доход вырос на " + mash1 + " рублей");
        System.out.println("Денис теперь получате " + den2 + " рублей. Годовой доход вырос на " + den1 + " рублей");
        System.out.println("Кристина теперь получате " + kris2 + " рублей. Годовой доход вырос на " + kris1 + " рублей");
    }
}