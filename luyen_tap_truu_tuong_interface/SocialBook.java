package luyen_tap_truu_tuong_interface;

public class SocialBook extends Book implements IBook{
    private String author;

    public SocialBook(String author) {
        this.author = author;
    }

    public SocialBook(String bookName, String publishingCompany, String getPublishingYear, String author) {
        super(bookName, publishingCompany, getPublishingYear);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "SocialBook{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", getPublishingYear='" + getPublishingYear + '\'' +
                '}';
    }

    @Override
    public void display() {
        System.out.println("SocialBook{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", getPublishingYear='" + getPublishingYear + '\'' +
                '}');
    }
}
