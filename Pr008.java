//Знакомство с обьектами
class Avto {
	int pass; //Количество пассажиров включая водителя
	int V; //емкость топливного бака в литрах
	double rash; //расход топлива в литрах/100км
		     //Метод вычисления растояния которое авто проедет на полном баке:
	double range() {  
		return ((double)(V*100))/rash;	
	}
}
class ChkNum {
	boolean isEven(int x) {
		if((x%2) ==0) return true;
		else return false;
	}
}
class IsFact {
	boolean isFactor(int a, int b) {
		if((b%a) == 0) return true;
		else return false;
	}
}
class Pr008 {
	public static void main(String args[]) {
		double range;
		Avto bmw = new Avto();
		bmw.pass = 5;
		bmw.V = 80;
		bmw.rash = 12.5;

		System.out.println("\nИнформация о BMW X5: ");

		System.out.println("Количество пассажиров у BMW X5: " + bmw.pass);
		System.out.println("Обьем бака у BMW X5: " + bmw.V + " л ");
		//Вызов метода вычисления растояние в нутри метода System.out.println();
		System.out.println("Расход топлива у BMW X5: " + bmw.rash + " л/100км" + "\nРастояние для bmw: " + bmw.range() + " км");

	//	range = ((double)(bmw.V * 100)) / bmw.rash;
		range = bmw.range();
	        System.out.println("bmw X5 проедет на полном баке " + range + " км");	

		System.out.println("\nИнформация о Mercedes SLC 43: ");

		Avto mercedes = new Avto();
		mercedes.pass = 2;
		mercedes.V = 60;
		mercedes.rash = 10.2;
		 System.out.println("Количество пассажиров у mercedes: " + mercedes.pass);
		 System.out.println("Обьем бака у mercedes: " + mercedes.V + " л ");
		 System.out.println("Расход топлива у mercedes: " + mercedes.rash + " л/100км");

	//	 range = ((double)(mercedes.V * 100)) / mercedes.rash;
		range = mercedes.range();
		   System.out.println("mercedes CLS 43 проедет на полном баке " + range + " км");

		   //Хранение значений в простых типах переменных
		   int p1 = 50, p2 = 75;
		   p1 = p2;
		   p2 = 100;
		   System.out.println("Значения р1 и р2: " + p1 + " " + p2 );

		   //Хранение значений в обьектных типах
		   //Операции присваивания означают копирование ссылки на обьект а не на всех значениях обьекта
		   Avto bmw1, bmw2;
		   bmw1 = bmw;
		   bmw2 = mercedes;
		   bmw1.rash = 14.5;
		   System.out.println("Расход для bmw и bmw1: " + bmw.rash + " " + bmw1.rash);
		   bmw2.rash = 9.99;
		    System.out.println("Расход для bmw2 и mercedes: " + bmw2.rash + " " + mercedes.rash);
	
	    	    //Использование параметров при вызове метода
		    ChkNum e = new ChkNum();
		    if(e.isEven(10)) System.out.println("10 - четное");
		    if(e.isEven(9)) System.out.println("9 - четное");
		    if(e.isEven(8)) System.out.println("8 - четное");

		    //вызов метода с двумя параметрами
		    IsFact x = new IsFact();
		   	 if(x.isFactor(2, 20)) System.out.println("2 - делитель");
	        	if(x.isFactor(3, 20)) System.out.println("3 - делитель");
			if(x.isFactor(4, 20)) System.out.println("4 - делитель");
	}
}

