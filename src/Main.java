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







      }
}
