package duongtx.wallet.models;

import java.io.Serializable;

public class History implements Serializable {
    private String content;

    public History(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
