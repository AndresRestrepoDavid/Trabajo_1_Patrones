package WhatsappCenter;

import java.util.Map;

public class WelcomeMessageTemplate extends MessageTemplate {
    public WelcomeMessageTemplate() {
        this.content = "Bienvenido, {name}!";
    }


    @Override
    public String getFormattedMessage(Map<String, String> parameters) {
        return content.replace("{name}", parameters.get("name"));
    }
}
