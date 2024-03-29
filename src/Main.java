public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Порция сахара весит " + onePortion + " кг");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        byte e = 1;
        float g = e + 1f;
        System.out.println(g);

        //task1
        System.out.println("Задача 1");
        byte one = 120;
        System.out.println(one);
        short two = 1200;
        System.out.println(two);
        int three = 1200000;
        System.out.println(three);
        long four = 1200000000L;
        System.out.println(four);
        float five = 1.2f;
        System.out.println(five);
        double six = 1222.12;
        System.out.println(six);

        //task2
        System.out.println("Задача 2");
        float z = 27.12f;
        System.out.println(z);
        long x = 987678965549L;
        System.out.println(x);
        double v = 2.786;
        System.out.println(v);
        short n = 569;
        System.out.println(n);
        short m = -159;
        System.out.println(m);
        short s = 27897;
        System.out.println(s);
        byte f = 67;
        System.out.println(f);

        //task3
        System.out.println("Задача 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short paper = 480;
        int sheets = paper / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + sheets +  " листов бумаги».");

        //task4
        System.out.println("Задача 4");
        byte performance = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;
        int workProductivity = performance/2;
        int bottle1 = time1 * workProductivity;
        System.out.println("За " + time1 + " минут, машина произвела " + bottle1 + " штук бутылок!");
        int bottle2 = time2 * workProductivity;
        System.out.println("За " + time2 + " минут, машина произвела " + bottle2 + " штук бутылок!");
        int bottle3 = time3 * workProductivity;
        System.out.println("За " + time3 + " минут, машина произвела " + bottle3 + " штук бутылок!");
        int bottle4 = time4 * workProductivity;
        System.out.println("За " + time4 + " минут, машина произвела " + bottle4 + " штук бутылок!");

        //task5
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte waite = 2;
        byte brown = 4;
        int totalClasses = totalCans/(waite+brown);
        int totalClasses1 = totalClasses * waite;
        int totalClasses2 = totalClasses * brown;
        System.out.println("«В школе, где " + totalClasses + " классов, нужно " + totalClasses1 + " банок белой краски и " + totalClasses2 + " банок коричневой краски».");

        //task6
        System.out.println("Задача 6");
        byte bananas = 5;
        short milk = 200;
        byte iceCreamSundae = 2;
        byte rawEggs = 4;
        int bananas1 = bananas * 80;
        int milk1 = milk * 105;
        int iceCreamSundae1 = iceCreamSundae * 100;
        int rawEggs1 = rawEggs * 70;
        int sportsBreakfast = bananas1 + milk1 + iceCreamSundae1 + rawEggs1;
        System.out.println(sportsBreakfast + " в граммах!");
        int grPerKg = 1000;
        float weightKg = sportsBreakfast/ (float)grPerKg;
        System.out.println(weightKg + " в килограммах!");

        //task7
        System.out.println("Задача 7");
        short weight = 7;
        short gram1 = 250;
        short gram2 = 500;
        int kgPerGr = 1000;
        int weightGr = kgPerGr * weight;
        int day1 = weightGr/ gram1;
        System.out.println(day1 + " дней потребуется, если спортсмен будет терять по "+ gram1 + " гр. в день!");
        int day2 = weightGr/gram2;
        System.out.println(day2 + " дней потребуется, если спортсмен будет терять по "+ gram2 + " гр. в день!");
        int day3 = (day1 + day2) /2;
        System.out.println(day3+ " в среднем потребуется дней");

        //task8
        System.out.println("Задача 8");
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int increase1  = (Masha / 100) * 10; // повысили на
        int increase2 = (Denis / 100) * 10; // повысили на
        int increase3 = (Kristina / 100) * 10; // повысили на
        int result1 = increase1 + Masha; //новая зп
        int result2 = increase2 + Denis; // новая зп
        int result3 = increase3 + Kristina; //новая зп
        byte month = 12;
        int annualIncomeNew1 = result1 * month; //годовая новая зп
        int annualIncomeNew2 = result2 * month; //годовая новая зп
        int annualIncomeNew3 = result3 * month; //годовая новая зп
        int annualIncomeOld1 = Masha * month; //годовая старя зп
        int annualIncomeOld2 = Denis * month; //годовая старя зп
        int annualIncomeOld3 = Kristina * month; //годовая старя зп
        int difference1 = (annualIncomeNew1 - annualIncomeOld1); //разница за год
        int difference2 = (annualIncomeNew2 - annualIncomeOld2); //разница за год
        int difference3 = (annualIncomeNew3 - annualIncomeOld3); //разница за год
        System.out.println("Маша теперь получает " + result1 + " рублей. Годовой доход вырос на " + difference1 + " рублей.");
        System.out.println("Денис теперь получает " + result2 + " рублей. Годовой доход вырос на " + difference2+ " рублей.");
        System.out.println("Кристина теперь получает " + result3 + " рублей. Годовой доход вырос на " + difference3 + " рублей.");


    }
}