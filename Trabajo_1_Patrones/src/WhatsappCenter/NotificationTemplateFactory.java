package WhatsappCenter;

public class NotificationTemplateFactory {
    public static MessageTemplate createTemplate(String type) {
        switch (type) {
            case "welcome":
                return new WelcomeMessageTemplate();
            case "serviceInquiry":
                return new ServiceInquiryMessageTemplate();
            default:
                throw new IllegalArgumentException("Tipo de template desconocido");
        }
    }
}
