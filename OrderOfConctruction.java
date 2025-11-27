class A {
    A() {
        System.out.println("Конструктор класса А");
    }
}
class B extends A {
    B() {
        System.out.println("Конструктор класса В");
    }
}
class C extends B {
    C() {
        System.out.println("Конструкор класса С");
    }
}
C c = new C();