public class Sites {

    private String browser;
    private String url;

    public Sites(String browser, String url ){
        this.browser = browser;
        this.url = url;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Sites [browser=" + browser + ", url=" + url + "]";
    }
    
}
