package document;

import interfaces.Document;

public class PDFDocument implements Document {
    @Override
    public void create() {
        System.out.println("PDF Document created.");

    }
}