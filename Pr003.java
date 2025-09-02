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
    }
}
