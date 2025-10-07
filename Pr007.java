//Использование оператора прекращения итерации в цикле 
//Оператор break при выходе из цикла 
class Pr007 {
	public static void main(String args[]) {
		int num;
		num = 100;
		int i = 0;
		for(i=0; i < num; i++) {
			if(i*i >= num)
				break;
			System.out.print(i + " ");
		}
		System.out.println("Цикл завершен");
		System.out.println("текущее значение i: " + i);

		//оператор break во вложенных циклах
		for (i=0; i<3; i++) {
			  System.out.println("счетчик внешнего цикла: " + i);
			    System.out.print("    счетчик внутренего цикла: ");

			    int t = 0;
			    while(t < 100) {
				    if (t==10)
					    break;
				      System.out.print(t + " ");
				      t++;
			    }
			      System.out.println();
		}
		System.out.println("циклы завершились");
		System.out.println();

		//Оператор break в роли оператора goto
		for(i=1; i<4; i++) {
one:			 { 
two:	 			    {
three:		    			 {
						 System.out.println("\ni равно " + i);
						 if(i==1) break one;
						 if(i==2) break two;
						 if(i==3) break three;

						  System.out.println("не выполняется");
					     }
					  System.out.println("после блока three");
				     }
				    System.out.println("после блока two");
			}  
			System.out.println("после блока one");

		}
		System.out.println("после цикла for");

		System.out.println();
		//Второй пример использования оператора break c меткой
done:		for (i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					System.out.println(k + " ");
					if(k == 5) break done;
				}
				System.out.println("после цикла по k"); //не выполняется
			}
			 System.out.println("после цикла по j"); //не выполняется
		}
		 System.out.println("после цикла по i");

		  System.out.println();
		  //илюстрация влияния позиции метки на поведение циклов 
		  int x=0, y=0;

stop1:		  for(x=0; x<5; x++) {
			  for(y=0; y<5; y++) {
				  if(y==2) break stop1;
				   System.out.println("x и y: " + x + " " + y);
			  }
		  }
		  System.out.println();

		 for(x=0; x<5; x++) 
stop2:		 {
			       for(y=0; y<5; y++) {
                                  if(y==2) break stop2;										                     System.out.println("x и y: " + x + " " + y);
			       }
		 }
		 System.out.println();
		
		 //оператор continue
		 for(i=0; i<=10; i++) {
			if((i%2) != 0)
				continue;
			System.out.print(i + " ");
		 }
		 System.out.println();

		 //применение continue с меткой
outerloop:
		 for(i=1; i<10; i++) {
			 System.out.print("\nвнешний цикл: проход " + i + ", внутренний цикл: ");
			 for(int j=1; j<10; j++) {
				 if(j==5)
					 continue outerloop;
				 System.out.print(j);
			 }
		 }
		 System.out.println();

		 //пример использования вложенного цикла для нахождения делителей
		 System.out.println();
		 for(i=2; i<=100; i++) {
			 System.out.print("Делители " + i + ": ");
			 for(int j=2; j<i; j++)
				 if ((i%j) == 0)
					 System.out.print(j + " ");
			 System.out.println();
		 }
		  System.out.println("\n");

		   System.out.println("вторая версия поиска делителя");
outerloop1:

		 
		 for(i=2; i<=100; i++) {
			 System.out.print("Делители " + i + ": ");
			 for(int j=2, k=1; j<i; j++) {

				 if ((i%j) == 0) {
					 System.out.print(j + " ");
			 		k++;
		 }
		 if (k>5)
			 continue outerloop1;
			}
			 System.out.println();
		}
	}
}
