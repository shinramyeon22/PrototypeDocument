public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument();

        System.out.println("Creating a Text Document prototype.");
        textPrototype = new TextDocument();

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public Document createPdf(String fileName, String author, int pageCount) {
        PdfDocument clone = (PdfDocument) pdfPrototype.clone();
        clone.setFileName(fileName);
        clone.setAuthor(author);
        clone.setPageCount(pageCount);
        return clone;
    }

    public Document createText(String filePath, String encoding, int wordCount) {
        TextDocument clone = (TextDocument) textPrototype.clone();
        clone.setFilePath(filePath);
        clone.setEncoding(encoding);
        clone.setWordCount(wordCount);
        return clone;
    }

    public Document createSpreadsheet(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument clone = (SpreadsheetDocument) spreadsheetPrototype.clone();
        clone.setSpreadsheetName(spreadsheetName);
        clone.setRowCount(rowCount);
        clone.setColumnCount(columnCount);
        return clone;
    }
}