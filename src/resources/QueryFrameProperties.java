package resources;

public class QueryFrameProperties {

    private String title;
    private final String header;
    private final String[] cmbxFilterString;
    private final String[] headersTable;

    public QueryFrameProperties(String title, String header, Titles headersTable, String[] cmbxFilterString) {
        this.title = title;
        this.header = header;
        this.headersTable = headersTable.getEncabezado();
        this.cmbxFilterString = cmbxFilterString;
    }

    public String getTitle() {
        return title;
    }

    public String getHeader() {
        return header;
    }

    public String[] getCmbxFilterString() {
        return cmbxFilterString;
    }

    public String[] getHeadersTable() {
        return headersTable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
