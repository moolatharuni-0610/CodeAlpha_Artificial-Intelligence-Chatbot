import java.time.LocalDate;
import java.time.LocalTime;

public class ChatBotLogic {

    public static String getResponse(String input) {

        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you today?";
        }

        else if (input.contains("how are you")) {
            return "I am fine. Thank you for asking!";
        }

        else if (input.contains("your name")) {
            return "I am an AI ChatBot developed in Java.";
        }

        else if (input.contains("date")) {
            return "Today's Date is: " + LocalDate.now();
        }

        else if (input.contains("time")) {
            return "Current Time is: " +
                    LocalTime.now().withNano(0);
        }

        else if (input.contains("java")) {
            return "Java is a powerful object-oriented programming language.";
        }

        else if (input.contains("project")) {
            return "This chatbot project uses Java Swing and NLP-based rule matching.";
        }

        else if (input.contains("bye")) {
            return "Goodbye! Have a nice day.";
        }

        else if (input.contains("help")) {
            return """
                    I can answer:
                    - Greetings
                    - Date & Time
                    - Java Questions
                    - Project Information
                    """;
        }

        else {
            return "Sorry, I don't understand that. Please try another question.";
        }
    }
}