package Marketing;

public record Email() implements Message{
    @Override
    public void sendMessage(String message) {
        System.out.println("\nEnviando mensagem via Email.\n");
    }
}
