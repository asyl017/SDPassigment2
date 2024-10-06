package document;

import interfaces.Document;
import interfaces.DocumentFactory;

public class  WordDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();

    }
}