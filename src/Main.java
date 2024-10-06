public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.create();

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.create();
    }
}