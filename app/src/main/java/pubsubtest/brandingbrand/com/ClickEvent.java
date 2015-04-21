package pubsubtest.brandingbrand.com;

/**
 * Created by danielclayton on 4/21/15.
 */
public class ClickEvent {
    private String content;

    public ClickEvent() {

    }

    public ClickEvent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
