import javax.swing.*

fun main() {
    SwingUtilities.invokeLater {
        val frame = JFrame("Пример формы")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(400, 200)
        frame.setLocationRelativeTo(null)

        val panel = JPanel()
        val label = JLabel("Введите имя:")
        val textField = JTextField(15)
        val button = JButton("Привет!")

        button.addActionListener {
            JOptionPane.showMessageDialog(frame, "Привет, ${textField.text}!")
        }

        panel.add(label)
        panel.add(textField)
        panel.add(button)
        frame.contentPane.add(panel)
        frame.isVisible = true
    }
}
