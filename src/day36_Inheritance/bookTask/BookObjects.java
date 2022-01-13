package day36_Inheritance.bookTask;

public class BookObjects {
    public static void main(String[] args) {
        Ebook book1 = new Ebook();
        book1.setInfo("Harry Potter", "Kids", "Alexander", 15.65);
        book1.setInfo("Long", 650);

        book1.readBook();

        System.out.println(book1);

        AudioBook book2 = new AudioBook();
        book2.setInfo("Cosmetology", "Beauty", "Magz", 125.50);
        book2.setInfo(15.32, "Man");
        book2.listen();

        System.out.println(book2);

    }
}
