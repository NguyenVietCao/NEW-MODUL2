package luyen_tap_truu_tuong_interface.view;

import luyen_tap_truu_tuong_interface.Book;
import luyen_tap_truu_tuong_interface.NaturalBook;
import luyen_tap_truu_tuong_interface.SocialBook;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[]books = new Book[5];
        NaturalBook naturalBook = new NaturalBook("vui","vn","2005",12);
        NaturalBook naturalBook1 = new NaturalBook("buon","uc","2000",15);
        SocialBook socialBook = new SocialBook("xuan","us","2023","marry");
        SocialBook socialBook1 = new SocialBook("ha","krea","2022","peter");
        SocialBook socialBook2 = new SocialBook("thu","japan","2021","arigato");
        books[0]=naturalBook;
        books[1] = naturalBook1;
        books[2] = socialBook;
        books[3] = socialBook1;
        books[4] = socialBook2;

        for (Book b: books) {
            if (b instanceof NaturalBook){
                ((NaturalBook) b).display();
            }
            if (b instanceof SocialBook){
                ((SocialBook) b).display();
            }
        }

        // instanceof
        // (Son) s
    }
}
