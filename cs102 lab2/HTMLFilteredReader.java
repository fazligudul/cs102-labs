public class HTMLFilteredReader extends MySimpleURLReader {

    public HTMLFilteredReader(String url) {
        super(url);
        //TODO Auto-generated constructor stub
    }
    @Override
    public String getPageContents() {
        // return only text not html
        String pageContents = super.getPageContents();
        pageContents = getUnfilteredPageContents(pageContents);
        return pageContents;
    }
    public String getUnfilteredPageContents(String pageContents){
        //return original page with html codes
        StringBuilder filteredContents = new StringBuilder();

        boolean withinTag = false;
        for (int i = 0; i < pageContents.length(); i++) {
            char c = pageContents.charAt(i);
            if (c == '<') {
                withinTag = true;
            } else if (c == '>') {
                withinTag = false;
            } else if (!withinTag) {
                filteredContents.append(c);
            }
        }
        return filteredContents.toString();
    }
}
