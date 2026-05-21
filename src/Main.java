import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Задача №1 объявление переменных
        var dog = 8.0 ;
        var cat = 3.6 ;
        var paper = 763789 ;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача №2 сложение

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача №3 вычитание

        dog = dog - 3.5;
        cat = cat -1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача №4 присвоение значения с последующим сложением и делением

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача №5 аналогично заданию №4 с небольшими арифметическими усложнениями

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задание №6 вес и разница веса двух боксёров

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var TotalWeight = boxer1 + boxer2;

        System.out.println("Общий вес :" +TotalWeight+"кг");

        var WeightDifference = boxer2 - boxer1;
        System.out.println("Разница между бойцами :"+WeightDifference+"кг");
        //Задача №7 узнать остаток от деления

        var remainder = boxer2 % boxer1;
        System.out.println("остаток от деления "+ remainder+" кг");
        //Задача №8 посчитать часы работы всех сотрудников

        var TotalNumber = 640;
        var WorkDay = 8;
        var worker = TotalNumber / WorkDay;
        System.out.println("Всего работников в компании :"+worker+" человек");

        worker = worker + 94;  //добавил к 80сотрудникам еще 94
        TotalNumber = WorkDay * worker; /*чтобы выяснить общее кол-во часов,умножаю рабочий
          день на число работников*/

        System.out.println("Если в компании работает "+worker+" сотрудника,то всего :"
                +TotalNumber+" часов может быть поделено между сотрудниками");

           // Домашнее задание №3
           // Задача 1
          byte b = 127;
          short s = 30000;
          int i = 1000000;
          long l = 1000000000L;
          float f = 1.5F;
          double d = 5.52654256;
          System.out.println("Значение переменной - b с типом byte равно : " +b + "\n" + "Значение " +
                "переменной - s с типом short равно : "+s +"\n"+"Значение переменной - " +
                "i с типом int равно : "+i+"\n"+"Значение переменной - l с типом long " +
                "равно : "+l+"\n"+"Значение переменной - f c типом float " +
                "равно :  "+f+"\n"+"Значение переменной - d с типом double равно : "+
                d);
        // Задание №2
           float f1 = 27.12F;
           long l1 = 987678965549L;
           float f2 = 2.786F;
           short s1 = 569;
           short s2 = -159;
           short s3 = 27897;
           byte b1 = 67;
           //Задание №3
           byte master1 = 23;
           byte master2 = 27;
           byte master3 = 30;
           int totalPaper = 480;
           int student = totalPaper / (master1+master2+master3);
           System.out.println("На каждого ученика рассчитано "+student+" листов бумаги");
           //Задание №4
           short min20 = 20/2;
           short day = (60*24)/2;
           int day3 = day*3;
           int month = day*30;
        System.out.println("За 20 минут машина производит "+min20+"  штук бутылок"+"\n"+"За сутки машина" +
                " производит "+ day+" штук бутылок"+"\n"+"За три дня машина производит "+day3+" штук бутылок" +
                "\n"+"За " + "месяц машина производит "+month+" штук бутылок");
























    }
}