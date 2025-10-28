//Строки из символов
class Pr010 {
	public static void main (String args[]) {
		System.out.println("");//Пустая строка как аргумент метода println
		System.out.print("\n");//Символ перевода строеи как аргумент меода Print()
		String str1 = "Первая строка";
		//String str2 = 'a';символы и строки не совместимы в качестве типов данных
		String str3 = "a";
		int a = 3355;
		System.out.println(str1 + " " + a);
		String str4 = str1 + " " + a;
		System.out.println(str4);
		str4 = a + " " + str1;

		System.out.println(str4);

		String str5; //Создание строковой переменной
			     //
		str5 = ""; //создание пустой строки
		
		String str6 = new String("Строка 6");//Создание строки 

		String str7 = new String(str6);//Копирование значения str6 в str7

		str7 = str6; //Копирование ссылки на строку str6 в ссылочную переменную str7
		//Неизменяемость строк
		str7 = "Cтарое значение str7";
		str6 = str7;
		str7 = "Новое значение str7";
		System.out.println("Значение str7: " + str7 + "\nЗначение str6 " + str6);		

		//операции над строками:
		
		//проверка строк на эквивалентность
		boolean eqstr76 = str7.equals(str6);
		String str8 = "Первая строка";
		if (str8.equals(str1))
			System.out.println("str8 и str1 эквивалентны");
		if (str6 == str7)
			System.out.println("str8 и str1 ссылаются на один и тот же  объект");
		//определение длинны строки в символах(возвращает целое число)
		System.out.println("Длинна строки str1:" + str1.length() + " символов");
		//Доступ к символу в строке по ууказанному индексу
		for (int i=1; i<str1.length(); i++)
			 System.out.print(str1.charAt(i) + " ");
		 System.out.println();

		//метод сравнения строк
		 System.out.println("Результат сравнения str6 и str7 " + str6.compareTo(str7));
		 if ( str6.compareTo(str7)>0)
			 System.out.println("str6 больше, чем str7");
		 else if ( str6.compareTo(str7) < 0)
			 System.out.println("str6 меньше, чем str7");
		 else
			 System.out.println("str6 равна str7");

		 //поиск подстроки (возвращает индекс первого вхождения подстроки в встроку)
		 System.out.println("индекс первого вхождения подстроки: " + str1.indexOf("строка"));
		 for (int i=str1.indexOf("строка"); i<str1.length(); i++)
			   System.out.print(str1.charAt(i) + " ");
		 System.out.println();
		 //поиск подстроки с возвращением индекса подстроки в строкук
		 str8 = "Строка, строка, строка и строка. 4 слова \"строка\"";
		 System.out.println("индекс первого вхождения подстроки: " + str8.lastIndexOf("строка"));

		 //массивы строк
		 System.out.println();
		 String strs[] = {"Первая часть", "Вторая часть", "Третья часть","Четвертая часть", "массива строк"};
		 System.out.println("исходный массив:");
		 for(String s : strs)
			 System.out.print(s + " ");
		 System.out.println("\n");

		 //Изменение элементов массива
		 strs[2] = "Третья изменненая часть";
		 strs[3] = "и четвертая часть тоже изменилась у массива строк";
		 System.out.println("изменненый массив:");
		 for(String s : strs)
			 System.out.print(s + " ");
		 System.out.println("\n");		 
		
		 //работа с подстрокой
		 String orgstr = "Оригинальная строка для операции с подстрокой";

		 String substr = orgstr.substring(13, 19);
		 System.out.println("оригинальное значение в orgstr: " + orgstr);
		 System.out.println("Значение, сохраненное в substr: " + substr);
		 System.out.println();

		 //строки при правлении в операторе switch
		String command = "dfsfsf";

		switch(command) {
			case "connect":
			      System.out.println("Подключение");
			      break;
			case "cancel":
			     System.out.println("отмена");
			case "disconnect":
			     System.out.println("Отключение");
			     break;
			default:
			     System.out.println("Неподдерживаемая команда");
			     break;

		}

		//Работа с командной строкой
		System.out.println();
		System.out.println("Программе передано " + args.length + " аргументов в командной строке");
		System.out.println("Список аргументов: ");
		int i = 0;
		for(String s : args) {
			i++;
			System.out.println("Аргумент " + i + ": " + s);
		}

		//Обработка агрументов командной строки внутри метода main

		String numbers[][] = {
			{"Дир.", "(+ 7 383) 244-01-70"},
			{"Зам. дир.", "(+ 7 383) 252-02-10"},
			{"Менеджер", "(+ 7 383) 252-02-15"},
			{"Диспетчер", "(+ 7 383) 244-10-18"}
		};

		if(args.length != 1)
			 System.out.println("Необходимо указать один аргумент");
		else{
			for(i=0; i<numbers.length; i++) {
				if(numbers[i][0].equals(args[0])) {
					 System.out.println(numbers[i][0]+ ": " + numbers[i][1]);
					 break;
				}
			}
			if(i == numbers.length)
				 System.out.println("Информация не найдена");
		}
	}
}
