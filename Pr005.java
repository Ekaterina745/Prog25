 class Pr005 {
        public static void main(String args[]) {

//Составные операторы присваивания		
               //для арифмитических операций:
	      // +=        -=        *=      /=
	      int x = 0;
	      x = x + 5;
	      x += 5;
	      x = x - 10;
	      x -= 10;
	      //Для логических операций:
	      //&=	|=	^=

//преобразование типов при присваивании
                int i;
	        float f;

	        i = 10;
   		f = i;
              System.out.println("i = " + i + " f = " + f);
              //Автоматическое преобразование выполняется если:
	    	 // целевой тип совместим с тпом значения, которое ему присваевается 
		//целевой тип поддерживает более широкий  диапозон допустимых значний	  
	  	long L;
	        double D;
    		 
		L = 1223545543454453L;
    		D = L;		
                System.out.println("L = " + L + " D = " + D);

		//пример недопустимого автоматического преобразования типов:
		/*
		D = 1223545543454453.0;
		L = D;
		System.out.println("L = " + L + " D = " + D);	
		*/

		//"Ручное" приведение одного типа к другому
		 D = 1223545543454453.0;
		 L = (long)D;
		 System.out.println("L = " + L + " D = " + D);
                
		 System.out.println();
		 byte byte1 = 125;
		 char ch;
		 ch = (char) byte1;
		 System.out.println("ch: " + ch);

		 int integer1 = 1095;
		 ch = (char) integer1;
		 System.out.println("ch: " + ch);
		 
		 ch = 'Ю';
		 integer1 = (int) ch;
		 System.out.println("integer1: " + integer1);

		 D = (double) ch;

	}
}
