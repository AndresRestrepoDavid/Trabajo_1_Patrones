package WhatsappCenter;

public class WhatsAppService {
    private static WhatsAppService instance;

    private WhatsAppService() {}

    public static WhatsAppService getInstance() {
        if (instance == null) {
            instance = new WhatsAppService();
        }
        return instance;
    }

    public void sendMessage(String message) {
        System.out.println("Enviando mensaje a través de WhatsApp: " + message);
    }
}
