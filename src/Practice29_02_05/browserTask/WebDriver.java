package Practice29_02_05.browserTask;

public interface WebDriver extends SearchContext{
    void get(String url);
    void close();
    void quit();
    void getTitle();
}
