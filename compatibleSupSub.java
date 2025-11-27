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
class x {
    int a;
    x(int i) {
        a = i;
    }
}
class Y {
    int a;
    Y(int i) {
        a = i;
    }
}
class X {
    int a;
    X(int i) {
        a = i;
    }
}
X x = new X(10);
X x2;
x2 = x
Y y = new Y(10);
class Z extends X {
    int b;
    Z(int i, int j) {
        super(j);
        b = i;
    }
}
Z z = new Z(10, 5);
z.a
x2
x2 = z
x2.a
z.b