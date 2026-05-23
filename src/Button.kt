import java.awt.Component
import javax.swing.*

fun main() {
    SwingUtilities.invokeLater {
        val frame = JFrame("Окно с текстом и кнопками")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(400, 300)
        frame.setLocationRelativeTo(null)

        val label = JLabel("Нажми кнопку")
        label.alignmentX = Component.CENTER_ALIGNMENT

        val button1 = JButton("Первая кнопка")
        button1.alignmentX = Component.CENTER_ALIGNMENT

        val button2 = JButton("Вторая кнопка")
        button2.alignmentX = Component.CENTER_ALIGNMENT

        button1.addActionListener {
            label.text = "Нажата первая кнопка"
        }

        button2.addActionListener {
            label.text = "Нажата вторая кнопка"
        }

        val panel = JPanel()
        panel.layout = BoxLayout(panel, BoxLayout.Y_AXIS)

        panel.add(Box.createVerticalGlue())
        panel.add(label)
        panel.add(Box.createVerticalStrut(10))
        panel.add(button1)
        panel.add(Box.createVerticalStrut(10))
        panel.add(button2)
        panel.add(Box.createVerticalGlue())

        frame.contentPane = panel
        frame.isVisible = true
    }
}