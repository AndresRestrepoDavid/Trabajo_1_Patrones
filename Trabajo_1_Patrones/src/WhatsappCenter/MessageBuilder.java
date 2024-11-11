package WhatsappCenter;

import java.util.HashMap;
import java.util.Map;

public class MessageBuilder {
    private String template;
    private Map<String, String> parameters = new HashMap<>();

    public MessageBuilder setTemplate(String template) {
        this.template = template;
        return this;
    }

    public MessageBuilder addParameter(String key, String value) {
        parameters.put(key, value);
        return this;
    }

    public String build() {
        MessageTemplate messageTemplate = NotificationTemplateFactory.createTemplate(template);
        return messageTemplate.getFormattedMessage(parameters);
    }
}
