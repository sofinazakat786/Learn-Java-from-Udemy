import java.time.Year;

public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title can't be null or blank");
        }
        this.title = title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isBlank()) {
            throw new IllegalArgumentException("Publisher can't be null or blank");
        }
        this.publisher = publisher;
    }

    public int getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Issue Number can't be 0 or less");
        }
        this.issueNumber = issueNumber;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear < 999 || publicationYear > Year.now().getValue()) {
            throw new IllegalArgumentException("Invalid Year");
        }
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\n" +
               "Publisher: " + this.publisher + "\n" +
               "Issue Number: " + this.issueNumber + "\n" +
               "Publication Year: " + this.publicationYear;
    }
}
