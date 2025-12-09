class FixQ implements ICharQ {
	private char[] q;
	private int putloc, getloc;

	public FixQ(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	//реализуем методы интерфейса
	public void put(char ch) {
		if(putloc==q.length) {
			System.out.println(" - очередь переполнена");
			return;
		}
		q[putloc++] = ch;
	}

	public char get() {
		if(getloc==putloc) {
			System.out.println(" - очередь пустая");
			return (char) 0;
		}
		return q[getloc++];
	}
}
