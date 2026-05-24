import java.awt.Component
import java.awt.Dialog
import javax.swing.*

fun main() {
    SwingUtilities.invokeLater {
        val frame = JFrame("Другое Окно с текстом и кнопками")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(400, 300)
        frame.setLocationRelativeTo(null)
        val label = JLabel("Нажми кнопку")
        label.alignmentX = Component.CENTER_ALIGNMENT

        val button1 = JButton("Первая кнопка")
        button1.alignmentX = Component.RIGHT_ALIGNMENT

        val button2 = JButton("Вторая кнопка")
        button2.alignmentX = Component.RIGHT_ALIGNMENT

        val button3 = JButton("Третья кнопка")
        button3.alignmentX = Component.LEFT_ALIGNMENT

        button1.addActionListener {
            label.text = "Нажата первая кнопка"
        }

        button2.addActionListener {
            label.text = "Нажата вторая кнопка"
        }

        button3.addActionListener {
            label.text = "Нажата третья кнопка"
            val dialog = JDialog(frame, "Поздравляем!", true)
            dialog.setSize(350, 250)
            dialog.setLocationRelativeTo(frame)

            dialog.add(JLabel("Поздравляем, последняя кнопка нажата!", SwingConstants.CENTER))

            dialog.isVisible = true
        }

        val panel = JPanel()
        panel.layout = BoxLayout(panel, BoxLayout.Y_AXIS)

        panel.add(Box.createVerticalGlue())
        panel.add(label)
        panel.add(Box.createVerticalStrut(10))
        panel.add(button1)
        panel.add(Box.createVerticalStrut(10))
        panel.add(button2)
        panel.add(Box.createVerticalStrut(10))
        panel.add(button3)
        panel.add(Box.createVerticalGlue())

        frame.contentPane = panel
        frame.isVisible = true
    }
}