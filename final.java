A a = new A();
B b = new B();
a = b
a.meth()
class A {
    void meth() {
        System.out.println("Метод meth() класса А");
    }
    final void meth2() {
	    System.out.println("Метод meth2 не допускает переопределения в подклассах");
    }
}
b = new B()
b = new B()
a = b
a.meth()
class B extends A {
	void meth() {
		System.out.println("Метод meth() класа B");
	}
	//Переопределение  метода meth2() запрещено
	//void meth2()
	//System.out.println("Метод meth2() не допускает переопределения ");
}
final class C {
    int i=10;
}
class D extends A {
    int j = 20;
}
class ErrorMsg {
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR =2;
    final int INDEXERR = 3;
    String[] msgs = {
        "Ошибка вывода",
        "Ошибка ввода",
        "Переполнение диска",
        "Выход индекса за границы массива"
    };
    String getErrorMsg(int i) {
        if(i >= 0 & i < msgs.length)
        return msgs[i];
        else
        return "Неизвестная ошибка";
    }
}
