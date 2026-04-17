public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public Document clone() {
        return new TextDocument();
    }

    @Override
    public String getType() {
        return "Text";
    }

    public String toString() {
        return "Type: Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount;
    }
}