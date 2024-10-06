package document;

import interfaces.Document;
import interfaces.DocumentFactory;

public class PDFDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();

    }
}