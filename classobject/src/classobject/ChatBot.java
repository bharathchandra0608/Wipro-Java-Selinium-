package classobject;


class ChatBot {
    void respond(String message) {
        message = message.toLowerCase();

        if (message.contains("hi") || message.contains("hello")) {
            System.out.println("ChatBot: Hello! How can I assist you?");
        } else {
            System.out.println("ChatBot: I'm not sure how to respond to that.");
        }
    }



public class ChaBot {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot();  

       
        bot.respond("Hi");
        bot.respond("hello");
        bot.respond("What's your name?");
        bot.respond("Bye");
    }
}
}