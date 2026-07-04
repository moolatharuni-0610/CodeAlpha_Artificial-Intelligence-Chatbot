import javax.swing.*;
import java.awt.*;

public class ChatBotGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    public ChatBotGUI() {

        setTitle("AI ChatBot");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 15));

        JScrollPane scrollPane =
                new JScrollPane(chatArea);

        inputField = new JTextField();

        sendButton = new JButton("Send");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! I am your AI ChatBot.\n");

        sendButton.addActionListener(e -> sendMessage());

        inputField.addActionListener(e -> sendMessage());

        setVisible(true);
    }

    private void sendMessage() {

        String userText = inputField.getText().trim();

        if (userText.isEmpty())
            return;

        chatArea.append("You: " + userText + "\n");

        String response =
                ChatBotLogic.getResponse(userText);

        chatArea.append("Bot: " + response + "\n\n");

        inputField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatBotGUI::new);
    }
}