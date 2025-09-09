class Pr003 {
    public static void main(String args[])  {

	    // Обьявление целой переменной
            int var1, var2 = 20;

	    //Обьявление логической переменной
           boolean varb=true;

	   //обьявление вещественных переменных
	   double vard=10.3, vard2; 
	   var1 = 10;

	   //проверка условия 
             if  (var1>var2) {
                      int var3 =300;
		      System.out.println(var3);
	     }	     
            else {
		    int var4 =300;
		    System.out.println(var4);
       }
       if (varb) {
	       System.out.println(var1);
       }

       //деление двух целых чисел
       System.out.println("Результат деления var1 на var2");
       System.out.println(var1/var2);

       //приведение результата  деления к типу double 
       vard2 =(double)var1/var2;
        System.out.println("Результат деления var1 на var2 с явным преобразованием к double");
       System.out.println(vard2);
       
       //Простые типы данных в java
       byte byte_var;
       System.out.println("Значения byte_var:");
       for (int i=100; i<=150; i++) {
	       byte_var=(byte)i;
	     System.out.print(byte_var + ", ");
       }
       short short_var;
       System.out.println("тип данных short имеет разрядность 16 бит и значения от -32 768 до 32 767");
       System.out.println("тип данных int имеет разрядность 32 бита");
       System.out.println("тип данных long имеет разрядность 64 бита");

       long long_var = 4000000000L;

       //пример использования типа данных long
       int int_var = 2000000000;
       long_var =(long) int_var*int_var;
       int_var = int_var*int_var;
       System.out.println("значение int_var: " + int_var);
      System.out.println("значение long_var: " + long_var);
      //Вычисление гипотенузы при помощи метода math.sqrt
      double a = 3.0, b = 4.0;
      double c = Math.sqrt(a*a +b*b);
      System.out.println("Длинна гипотенузы: " + c);

      //Использованиесимвольного типа данных
      char ch;
      ch = 'X';
      System.out.println("Значение ch: " + ch);
      int_var = (int) ch;
      System.out.println("Значение int_var: " + int_var);

      ch++;
      System.out.println("Значение ch: " + ch);

      ch = 90;
      System.out.println("Значение ch: " + ch);

      ch = 'А';
      for (int i = (int) ch; i < (int) 'А' + 66; i++) { 
              
	      System.out.print(ch++ + ", ");
        }
       System.out.println();

       //спользаование логического типа данных
       varb = false;
       System.out.println("Значение varb:" + varb);

       varb = true;
       System.out.println("Значение varb:" + varb);

       if(varb)
	       System.out.println("Выполняется, если varb == true");
       varb = false;
       if(varb)
               System.out.println("Выполняется, если varb == true");
            
       System.out.println("Результат лосравнения 10>9: " + (10>9));
    }
}
