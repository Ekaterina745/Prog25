//Применение различного доступа переменных внутри класса
class MyClass {
	private int a; //Закрытый доступ, значения переменной меняеться только из собственного класса MyClass
	public int b; //открытый досту, значение переменной может изменяться из любого класса 
	int c; //доступ по умолчани.( в данном случае анлог открытого доступа )
	       //Методы доступа к закрытой переменной a 
	void setA (int A) {
		if (A < 10)
			a = A;
		else {
			System.out.println("Значение параметра должно быть меньше 10");
			a = 0;
		}
	}
	int getA() {
		return a;
	}
}
//Возврат обьекта из метода 
class  ErrorMsg {
	String msgs[] = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Отсутствует место на диске",
		"Выход индекса за границы диапазона"
	};

	String getErrorMsg(int i) {
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "неверное значение ошибки";
	}	
}
class FailSoftArray {
	//Класс где реализуется отказоустойчивый массив 
	//обьявление закрытых ссылки на массив и закрытого значения ошибки доступа
	private int a[];
	private int errval;

	//Открытая переменная, где храниться размер массива 
	public int length;

	//Конструктор массива, первый параметр - размер, второй - значение при ошибке доступа 
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	//Метод доступа к элементам массива  при чтении значения элементов по индексу
	public int get(int index) {
		if(indexOK(index))
			return a[index];
		return
			errval;
	}

	//Метод чтения значения элементов по индексу, второй параметр - новое значение 
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	//Метод проверки кореектности индекса 
	private boolean indexOK(int index) {
		if(index >=0 & index < length)
			return true;
		return false;
	}
}
//Демонстрация передачи обьектов методам
class Block {
	int a, b, c;
	int V;

	Block(int i, int j, int k) {
		a = i;
		b =j;
		c = k;
		V = a*b*c;
	}

	boolean sameBlock (Block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c))
			return true;
		else
			return false;
	}

	boolean sameV (Block ob) {
		if(ob.V == V)
			return true;
		else return false;
	}
}
class Err {
	String msg; //Сообщение
	int severity;

	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}
class ErrorInfo {
	String msgs[] = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Отсутствует место на диске",
		"Выход индекса за границы диапазона"
	};
	int howbad[] = {3,3,2,4};

	Err getErrorInfo(int i) {
		if(i >= 0 & i < msgs.length)
			return new Err (msgs[i], howbad[i]);
		else
			return new Err("неверное значение ошибки", 0);
	}
}
class Overload {
	void ovlDemo() {
		System.out.println("метод запуска бкз параметров");
	}
	void ovlDemo(int a) {
		System.out.println("Один параметр: " + a);	
	}

	int ovlDemo(int a, int b) {
		 System.out.println("Два параметра: " + a + " " + b);
		 return a+b;
	}

	double ovlDemo(double a, double b) {
		 System.out.println("Два вещественных параметра: " + a + " " + b);
		 return a+b;
	}
	//Метод для демонстрации в классе Pr012 перегрузки методов при автоматическом преобразовании типов
	void ovlDemo2(int x) {
		 System.out.println("Вызван метод ovlDemo2(int): " + x);
	}

	void ovlDemo2(double x) {
		 System.out.println("Вызван метод ovlDemo2(double): " + x);
	}
	void ovlDemo2(byte x) {
		System.out.println("Вызван метод ovlDemo2(byte): " + x);
	}
}
class Square {
	int w, h;
	double R;
	String type;
	Square() {
		w = h = 0;
		R = 0.0;
		type = "Неопределенная фигура";
	}
		
	Square(int a) {
		w = h = a;
		R = 0.0;
		type = "Квадрат";
	}

	Square(int a, int b) {
		w = a;
		h = b;
		R = 0.0;
		type = "Круг";
	}

	Square(double r) {
		w = h = 0;
		R = r;
		type = "Прямоугольник";
	}

	Square(Square s) {
		w = s.w;
		h = s.h;
		R = s.R;
		type = s.type;
	}
	//вычисление площади квадрата
	 int square(int a) {
		 System.out.println("Площадь квадрата со стороной " + a + " равна " + a*a);
		 return a*a;
	 }
	 //вычисление площади круга
	  double square(double r) {
		  System.out.println("Площадь круга с радиусом " + r + " равна " + 3.14*r*r);
		  return 3.14*r*r;
	 }
	 //вычисление площади прямоугольника
	 int square(int a, int b){
	System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + a*b);
		  return a*b;
	 }
}
class Overload2 {
	//Пример перегрузки конструкторов
	int x;
	Overload2() {
	System.out.println("Выполняеться конструктор Overload2()");
	x = 0;
	}

	Overload2(int i) {
		System.out.println("Выполняеться конструктор Overload2(int)");
		x = i;
	}

	Overload2(double d) {
		System.out.println("Выполняеться конструктор Overload2(double)");
		x = (int) d;
	}

	Overload2(int i, int j) {
		System.out.println("Выполняеться конструктор Overload2(int, int)");
		x = i + j;
	}
}
class Summation {
	//Демонстрация создания одного обьекта при помощи ппередачи конструкторов уже существующую
	int sum;

	Summation(int num) {
		sum = 0;
		for(int i =1; i <= num; i++)
			sum +=i;
	}

	Summation(Summation ob) {
		sum = ob.sum;
	}
}
class Pr012 {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		ob.setA(5);
		System.out.println("Значение переменной a в обьекте ob: "+ ob.getA());
		ob.setA(10);
		System.out.println("Значение переменной a в обьекте ob: "+ ob.getA());
		//ob.a = 10; Ошибочный доступ к закрытой переменной
		//System.out.println("Значение переменной a в обьекте ob: "ob.a);	
		ob.b = 10;
		ob.c = 10;
		System.out.println("Значение переменной b в обьекте ob: "+ ob.b);
		System.out.println("Значение переменной c в обьекте ob: "+ ob.c);

		//Пример работы с отказоутойчивым масиивом 
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;

		System.out.println("\nОбработка ошибок без вывода отчетов");
		for(int i=0; i< (fs.length *2); i++)
			fs.put(i, i*10);

		for(int i=0; i< (fs.length *2); i++) {
			x = fs.get(i);
			if(x != -1)
				 System.out.print(x + " ");
		}
		 System.out.println();

		 System.out.println("\nОбработка ошибок с выводом отчета");

		 for(int i=0; i< (fs.length *2); i++) 
			if(!fs.put(i, i*10))
			  	 System.out.println("Значение индекса " + i + " находится за пределами границ массива");
	
		 for(int i=0; i< (fs.length *2); i++) {
			 x = fs.get(i);
			if(x != -1)
				 System.out.print(x + " ");
			else
			  	 System.out.println("Значение индекса " + i + " находится за пределами границ массива");
		 }
		
		 //Проверка работы методов, принимающиъ обьект Block в качестве параметра
		 Block ob1 = new Block(10,2,5);
		 Block ob2 = new Block(10,2,5);
		 Block ob3 = new Block(4,5,5);

		 System.out.println("\nob1 совпадает по размерам с ob2: " + ob1.sameBlock(ob2));

		 System.out.println("ob2 совпадает по размерам с ob3: " + ob1.sameBlock(ob3));

		 System.out.println("ob2 совпадает по обьему с ob3: " + ob1.sameV(ob3));
		 ErrorMsg err = new ErrorMsg();

		 //Применение метода, возвращающего строку
		 System.out.println("\n" + err.getErrorMsg(2));
		 System.out.println(err.getErrorMsg(7));
		
		 //применение метода, возвращающего обьект с информацией об ошибке
		 ErrorInfo err1 = new ErrorInfo();
		 Err e;

		 e = err1.getErrorInfo(2);
		 System.out.println(e.msg + " уровень: " + e.severity);

		 e = err1.getErrorInfo(7);
		 System.out.println(e.msg + " уровень: " + e.severity);

		 //Перегрузка методов ovlDemo()
		  System.out.println();
		 Overload ob4 = new Overload();
		 int resI;
		 double resD;

		 ob4.ovlDemo();
		 System.out.println();

		 ob4.ovlDemo(3);
		 System.out.println();
	
		 ob4.ovlDemo(7,8);
		 System.out.println("Возвращаемое значение: " + ob4.ovlDemo(7,8));

		 ob4.ovlDemo(2.7,3.4);
		 System.out.println("Возвращаемое значение: " + ob4.ovlDemo(2.7,3.4));

		 //Использование перегружаемого метода square() для вычисление площади различных фигур
		  System.out.println();
		  Square ob5 = new Square();
		  //Вычисление площади квадрата со стороной 4
		  int S_sq = ob5.square(4);
		  //вычисление площпди прямоугольника со сторонами 4 и 5
		  int S_rect = ob5.square(4,5);
		  // вычисление площади круга с радиусом 3.0
		  double S_ocr = ob5.square(3.0);

		  //Демонстрация автоматического преобразования типов при перегрузке методов ovlDemo2()
		  System.out.println();
		  int i1 = 5;
		  double d1 = 10.1;
		  byte b1= 7;
		  short s1 = 9;
		  float f1 = 12.1F;

		  ob4.ovlDemo2(i1);
		  ob4.ovlDemo2(d1);
		  ob4.ovlDemo2(b1);
		  ob4.ovlDemo2(s1);
		  ob4.ovlDemo2(f1);

		  //Ltvjycnhfwbz gthtuheprb rjycnhernjhjd 
		  System.out.println();
		  Overload2 ob9 = new Overload2();
		  Overload2 ob6 = new Overload2(100);
		  Overload2 ob7 = new Overload2(22.3);
		  Overload2 ob8 = new Overload2(2, 8);

		  System.out.println("ob9.x " + ob9.x);
		  System.out.println("ob6.x " + ob6.x);
		  System.out.println("ob7.x " + ob7.x);
		  System.out.println("ob8.x " + ob8.x);

		  //Демонстрация обьекта на базе существующего
		   System.out.println();
		  Summation s3 = new Summation(10);
		  Summation s2 = new Summation(s3);

		  System.out.println("s3.sum: " + s3.sum);
		  System.out.println("s2.sum: " + s2.sum);

		  ///Демонстрация работы по созданию различных обьектов Square
		  Square figure1 = new Square();
		  System.out.print("\nТип фигуры: " + figure1.type);

		  Square figure2 = new Square(5);
		  System.out.print("\nТип фигуры: " + figure2.type);

		  Square figure3 = new Square(5, 10);
		  System.out.print("\nТип фигуры: " + figure3.type);

		  Square figure4 = new Square(1.5);
		  System.out.print("\nТип фигуры: " + figure4.type);

		  Square figure5 = new Square(figure4);
		  System.out.println("\nТип фигуры: " + figure5.type);
	}
}
