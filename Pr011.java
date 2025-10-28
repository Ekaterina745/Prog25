class Pr011 {
	public static void main(String args[]) {
		//Поразрядные операции над командами символов
		char ch;
		for(int i=0; i < 25; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);
			//сброс шестого бита у символа при помощи &
			ch = (char) ((int) ch & 65503);

			System.out.print(ch + " ");
		}
		System.out.println("\n");

		//Отображение битов в 8-ми разрядном представлении
		int t;
		byte va1;

		va1 = -126;
		for(t=128; t > 0; t = t/2) {
			if((va1 & t) !=0)  System.out.print("1 ");
			else  System.out.print("0 ");
		}
		 System.out.println("\n");

		 //Преобразование из верхнего регистра в нижний
		 for(int i = 0; i < 26; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);
			//установкка шестого бита у символа при помощи | (поразрядная операция ИЛИ)
			ch = (char) ((int) ch | 32);

			System.out.print(ch + " ");
		 }
		  System.out.println("\n");

		  //Шифрование стропин при помощи поразрядной операции исключающего ИЛИ
		  String str = "Очень секретная строка";
		  String encstr = "";
		  String decstr = "";
		  int key = 150;

		  System.out.print("Исходная строка: ");
		  System.out.println(str);

		  //Шифрование:
		  for(int i =0; i< str.length(); i++)
			  encstr = encstr + (char) (str.charAt(i) ^ key);
		  System.out.print("Зашифрованная строка: ");
		  System.out.println(encstr);

	        //расшифровка:
		  for(int i = 0; i < str.length(); i++)
			decstr = decstr + (char) (encstr.charAt(i) ^ key);

		  System.out.print("Расшифрованная строка: ");
		  System.out.println(decstr);

		  //Демонстрация использования поразрядной операции НЕ
		  byte b = -34;

		  for(t=128; t > 0; t = t/2) {
			if((b & t) !=0)  System.out.print("1 ");
			else  System.out.print("0 ");
		}
		 System.out.println("\n");

		 //Инвертирование бит в значение b
		 b = (byte) ~b;


		for(t=128; t > 0; t = t/2) {
			if((b & t) !=0)  System.out.print("1 ");
			else  System.out.print("0 ");
		}
		 System.out.println("\n" + b + "\n");

		 //операции сдвига << и >> 
		int val1 = 1;

		 for (int i = 0; i < 8; i++) {
	 	 for(t=128; t > 0; t = t/2) {
			if((val1 & t) !=0)  System.out.print("1 ");
			else  System.out.print("0 ");
		}
		 System.out.println();
		 val1 = val1 << 1;

		 } 
		 System.out.println();

		 val1 = 128;

		 for (int i = 0; i < 8; i++) {
	 		 for(t=128; t > 0; t = t/2) {
				if((val1 & t) !=0)  System.out.print("1 ");
				else  System.out.print("0 ");
		}
		 System.out.println();
		 val1 = val1 >> 1;

		 } 
		 System.out.println();

	}
}
