package luyen_tap_truu_tuong_interface;

public class NaturalBook extends Book implements IBook{
    private int getPublishingVolume;

    public NaturalBook(int getPublishingVolume) {
        this.getPublishingVolume = getPublishingVolume;
    }

    public NaturalBook(String bookName, String publishingCompany, String getPublishingYear, int getPublishingVolume) {
        super(bookName, publishingCompany, getPublishingYear);
        this.getPublishingVolume = getPublishingVolume;
    }
    @Override
    public String toString() {
        return "NaturalBook{" +
                "getPublishingVolume=" + getPublishingVolume +
                ", bookName='" + bookName + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", getPublishingYear='" + getPublishingYear + '\'' +
                '}';
    }

    @Override
    public void display() {
        System.out.println("NaturalBook{" +
                "getPublishingVolume=" + getPublishingVolume +
                ", bookName='" + bookName + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", getPublishingYear='" + getPublishingYear + '\'' +
                '}');

    }
}
