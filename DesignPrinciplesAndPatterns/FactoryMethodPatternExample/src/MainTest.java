public class MainTest {
    public static void main(String[] args) throws Exception {
        DocumentFactory wordFact=new WordDocumentFactory();
        Document wordDoc=wordFact.createDocument();
        wordDoc.open();

        DocumentFactory pdfFact=new PdfDocumentFactory();
        Document pdfDoc=pdfFact.createDocument();
        pdfDoc.open();

        DocumentFactory excelFact=new ExcelDocumentFactory();
        Document excelDoc=excelFact.createDocument();
        excelDoc.open();

    }
}
