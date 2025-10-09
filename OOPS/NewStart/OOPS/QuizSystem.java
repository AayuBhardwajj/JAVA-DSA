import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizSystem extends JFrame implements ActionListener {
    private String[] questions = {
        "What is the capital of France?",
        "Which planet is known as the Red Planet?",
        "What is the largest mammal?"
    };

    private String[][] options = {
        {"Paris", "Berlin", "Madrid", "London"},
        {"Mars", "Earth", "Jupiter", "Saturn"},
        {"Elephant", "Blue Whale", "Shark", "Giraffe"}
    };

    private int[] correctAnswers = {0, 0, 1};
    private int currentQuestion = 0;
    private int score = 0;
    private JButton[] optionButtons;
    private JLabel questionLabel;
    private JButton nextButton;
    private boolean answered = false; // ✅ Track if the question has been answered

    public QuizSystem() {
        setTitle("Online Quiz System");
        setLayout(new BorderLayout());

        questionLabel = new JLabel(questions[currentQuestion]);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        questionLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1));

        optionButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JButton(options[currentQuestion][i]);
            optionButtons[i].addActionListener(this);
            optionsPanel.add(optionButtons[i]);
        }

        nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!answered) {
                    JOptionPane.showMessageDialog(null, "Please select an answer before proceeding.");
                    return;
                }

                currentQuestion++;
                if (currentQuestion < questions.length) {
                    updateQuestion();
                } else {
                    showResults();
                }
                answered = false;
            }
        });

        add(questionLabel, BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.CENTER);
        add(nextButton, BorderLayout.SOUTH);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateQuestion() {
        questionLabel.setText(questions[currentQuestion]);
        for (int i = 0; i < 4; i++) {
            optionButtons[i].setText(options[currentQuestion][i]);
            optionButtons[i].setEnabled(true); // re-enable for new question
        }
    }

    private void showResults() {
        JOptionPane.showMessageDialog(this, "Quiz Over!\nYour score: " + score + "/" + questions.length);
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (answered) return;

        JButton selectedButton = (JButton) e.getSource();
        int selectedAnswer = -1;
        for (int i = 0; i < 4; i++) {
            if (selectedButton == optionButtons[i]) {
                selectedAnswer = i;
                break;
            }
        }

        if (selectedAnswer == correctAnswers[currentQuestion]) {
            score++;
            selectedButton.setBackground(Color.GREEN);
        } else {
            selectedButton.setBackground(Color.RED);
            optionButtons[correctAnswers[currentQuestion]].setBackground(Color.GREEN);
        }

        for (JButton button : optionButtons) {
            button.setEnabled(false);
        }

        answered = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizSystem());
    }
}
