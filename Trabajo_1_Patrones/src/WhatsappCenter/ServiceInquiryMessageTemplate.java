package WhatsappCenter;

import java.util.Map;

public class ServiceInquiryMessageTemplate extends MessageTemplate{

    public ServiceInquiryMessageTemplate(){
        this.content = "Hola {name}, ¿Qué servicio te gustaría adquirir hoy?" +
                " Mira nuestras opciones: {services}";
    }
    @Override
    public String getFormattedMessage(Map<String, String> parameters) {
        String services = parameters.get("services");
        return content.replace("{name}", parameters.get("name"))
                .replace("{services}", services);
    }
}
