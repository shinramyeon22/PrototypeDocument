public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public Document clone() {
        return new PdfDocument();
    }

    @Override
    public String getType() {
        return "PDF";
    }

    public String toString() {
        return "Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount;
    }
}