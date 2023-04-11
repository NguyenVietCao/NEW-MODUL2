package luyen_tap_truu_tuong_interface;

public abstract class Book {
    public  String bookName;
    public  String publishingCompany;
    public  String getPublishingYear;

    public Book() {
    }

    public Book(String bookName, String publishingCompany, String getPublishingYear) {
        this.bookName = bookName;
        this.publishingCompany = publishingCompany;
        this.getPublishingYear = getPublishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getGetPublishingYear() {
        return getPublishingYear;
    }

    public void setGetPublishingYear(String getPublishingYear) {
        this.getPublishingYear = getPublishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", getPublishingYear='" + getPublishingYear + '\'' +
                '}';
    }
}
