package WhatsappCenter;

public class Main {

    public static void main(String[] args) {
        // Obtener la instancia del servicio de WhatsApp
        WhatsAppService service = WhatsAppService.getInstance();
        System.out.println("Se obtuvo la instancia/conexión de WhatsAppService");

        // Construir el mensaje usando el patrón Builder
        String welcomeMessage = new MessageBuilder()
                .setTemplate("welcome")
                .addParameter("name", "Juan")
                .build();

        service.sendMessage(welcomeMessage);

        String services = "1. Cambio de aceite\n2. Revisión de frenos\n3. Ajuste de cadena";
        String serviceInquiryMessage = new MessageBuilder()
                .setTemplate("serviceInquiry")
                .addParameter("name", "Juan")
                .addParameter("services", services)
                .build();

        service.sendMessage(serviceInquiryMessage);

    }
}
