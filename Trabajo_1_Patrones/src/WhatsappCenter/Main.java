package WhatsappCenter;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia del servicio de WhatsApp
        WhatsAppService service = WhatsAppService.getInstance();
        
        // Construir el mensaje de bienvenida usando el patrón Builder
        Builder<String> welcomeMessageBuilder = new MessageBuilder()
                .setTemplate("welcome")
                .addParameter("name", "Juan");
        String welcomeMessage = welcomeMessageBuilder.build();


        // Enviar el mensaje de bienvenida
        service.sendMessage(welcomeMessage);

        // Construir el mensaje de consulta de servicios usando el patrón Builder
        String services = "1. Cambio de aceite\n2. Revisión de frenos\n3. Ajuste de cadena";
        Builder<String> serviceInquiryMessageBuilder = new MessageBuilder()
                .setTemplate("serviceInquiry")
                .addParameter("name", "Juan")
                .addParameter("services", services);
        String serviceInquiryMessage = serviceInquiryMessageBuilder.build();


        // Enviar el mensaje de consulta de servicios
        service.sendMessage(serviceInquiryMessage);
    }
}
