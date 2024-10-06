package document;

import interfaces.Document;
import interfaces.DocumentFactory;

public class DocumentCreator {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.create();

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.create();

    }
}