class Pr004 {
      public static void main(String args[]) {
              //Арифмитические операции
	      System.out.println("Знак операции\tВыполняемое действие");
	      System.out.println("+\t\tСложение\n-\t\tВычитание\n*\t\tУмножение\n/\t\tДеление");
	      System.out.println("%\t\tДеление по модюлю\n++\t\tИнкримент\n--\t\tДекримент");

	      //Операции сравнения
	      System.out.println("\nЗнак операции\tВыполняемое действие");
	      System.out.println("==\t\tРавентсво\n!=\t\tНеравенство\n>\t\tБольше\n<\t\tМеньше");
	      System.out.println(">=\t\tБольше или равно\n<=\t\tМеньше или равно");

	     //Логические операции
	      System.out.println("\nЗнак операции\tВыполняемое действие");
	      System.out.println("&\t\tИ\n|\t\tИЛИ\n^\t\tИсключающее ИЛИ");
	      System.out.println("&&\t\tУкороченное И\n||\t\tУкороченное ИЛИ\n!\t\tНЕ");

	     //примеры вывполненеия логических операций
	     System.out.println();
	     System.out.println("p\tq\tp&q\tp|q\tp^q\t!p");
	     boolean p=false, q=false;
	     System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p);
	    p=true;
	   System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p);
	  q=true; p=false; 
	  System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p);
	  p=true;
	  System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p);
      }
}
