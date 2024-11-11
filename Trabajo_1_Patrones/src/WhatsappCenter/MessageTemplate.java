package WhatsappCenter;

import java.util.Map;

public abstract class MessageTemplate {
    protected String content;

    public abstract String getFormattedMessage(Map<String, String> parameters);
}
