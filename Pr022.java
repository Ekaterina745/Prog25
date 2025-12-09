class ByTwos implements Series {
	int start; //начальное значение последовательности 
	int val; //текущее значение 
	int prev; //предыдущее значение в последовательности
	
	ByTwos() {
		start = 0;
		val = 0;
		prev = -2;
	}

	public int getNext() {
		prev = val;
		val += 2;
		return val;
	}

	public void reset() {
		val = start;
		prev = start -2;
	}

	public void setStart(int x) {
		start = x;
		prev = x -2;
		val = x;
	}

	int getPrevious() {
		return prev;
	}

}
class Pr022 {
	public static void main(String[] args) {
		 
		//работа с последовательностью через 2 значения
		System.out.println("Последовательность \" Через 2\"\n");
		ByTwos ob = new ByTwos();

		for(int i=0; i < 5; i++) {
			System.out.println("Очередное значение: " + ob.getNext());
			System.out.println("Предыдушее значение: " + ob.getPrevious());
		}
		System.out.println("\nСброс");
		ob.reset();

		for(int i=0; i < 5; i++) {
			System.out.println("Очередное значение: " + ob.getNext());
			System.out.println("Предыдушее значение: " + ob.getPrevious());
		}
		System.out.println("\nИзменяем стартовое значение на 100");

		ob.setStart(100);
		for(int i=0; i < 5; i++) {
			System.out.println("Очередное значение: " + ob.getNext());
			System.out.println("Предыдушее значение: " + ob.getPrevious());
		}
		 
		//работа с последовательностью через 3 значения
		System.out.println("Последовательность \" Через 2\"\n");
		ByThrees ob1 = new ByThrees();

		for(int i=0; i < 5; i++) {
			System.out.println("Очередное значение: " + ob1.getNext());
		}
		System.out.println("\nСброс");
		ob1.reset();

		for(int i=0; i < 5; i++) {
			System.out.println("Очередное значение: " + ob1.getNext());
		
		}
		System.out.println("\nИзменяем стартовое значение на 100");

		ob1.setStart(100);
		for(int i=0; i < 5; i++) {
			System.out.println("Очередное значение: " + ob1.getNext());
	
		}
		//Использование ссылочной переменной интерфейса для доступа к разным реализациям методов
		
		Series s;
		s = new ByTwos();
		System.out.println("Интерфейсная переменная ссылаеться на объект ByTwos" + s.getNext());
		s = new ByThrees();
		System.out.println("Интерфейсная переменная ссылаеться на объект ByThrees" + s.getNext());

		
	}
}
