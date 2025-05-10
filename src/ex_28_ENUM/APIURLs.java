package ex_28_ENUM;

public enum APIURLs {
    google("google.com"),
    amazon("amazon.in");

    private String url;
    APIURLs( String url)
    {
        this.url=url;
    }
    String getUrl()
    {
        return this.url;
    }
}
