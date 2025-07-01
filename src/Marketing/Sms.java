package Marketing;

public record Sms () implements Message {
    @Override
    public void sendMessage(String message) {
        System.out.println("\nEnviando mensagem via SMS.\n");
    }
}
