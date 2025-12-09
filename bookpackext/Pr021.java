package bookpackext;
import bookpack.*;

class Pr021 {
	public static void main(String[] args) {
		Book[] books = new Book[5];

		books[0] = new Book("Портрет Дориана Грея", "О. Уайлд", 1989);
		books[1] = new Book("Приетупление и наказание", "Ф.М. Достоевский", 1971);
		books[2] = new Book("Мастер и Маргарита", "М.А. Булгаков", 1981);
		books[3] = new Book("Оно", "С. Кинг", 1986);
		books[4] = new Book("Мартин Иден", "Дж. Лондон", 1927);

		for(int i=0; i < books.length; i++)
			books[i].show();
	

		//Демонстрация доступа к защещенным переменным из подкласса, находящегося в другом пакете относительно родителя
		ExtBook[] books1 = new ExtBook[5];

		books1[0] = new ExtBook("Портрет Дориана Грея", "О. Уайлд", 1989, "Эксмо");
		books1[1] = new ExtBook("Приетупление и наказание", "Ф.М. Достоевский", 1971, "Просвящение");
		books1[2] = new ExtBook("Мастер и Маргарита", "М.А. Булгаков", 1981, "Питер");
		books1[3] = new ExtBook("Оно", "С. Кинг", 1986, "Попкорн");
		books1[4] = new ExtBook("Мартин Иден", "Дж. Лондон", 1927, "Алеф");

		for(int i=0; i < books1.length; i++)
			books1[i].show();

		//Поиск по автору 
		System.out.println("Книги под авторством Булгакова");
		for(int i=0; i< books1.length; i++)
			if(books1[i].getAuthor() == "М.А. Булгаков")
				System.out.println(books1[i].getTitle());

	//	books1[0].title = "Новое название"; запрещено модификатором protected в bookpack/Book1.java
	}
}
