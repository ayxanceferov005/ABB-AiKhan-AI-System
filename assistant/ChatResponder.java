public class ChatResponder {

    public void respond(String userMessage) {
        System.out.println("User: " + userMessage);

        System.out.println("AiKhan AI: Processing your request...");

        if (userMessage.contains("balance")) {
            System.out.println("AiKhan AI: Your balance is 1250 AZN 💰");
        } else if (userMessage.contains("transfer")) {
            System.out.println("AiKhan AI: Initiating money transfer process...");
        } else {
            System.out.println("AiKhan AI: Sorry, I didn't fully understand. Can you rephrase?");
        }
    }
}