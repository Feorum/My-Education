import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class ButtonApp : JFrame(), ActionListener {
    init {
        title = "Зеленая кнопка"
        setSize(300, 200)
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = BorderLayout()

        val greenButton = JButton("Нажми!")
        greenButton.background = Color(76, 175, 80)  // Зеленый
        greenButton.foreground = Color.WHITE
        greenButton.font = Font("Arial", Font.BOLD, 18)
        greenButton.preferredSize = Dimension(150, 60)
        greenButton.addActionListener(this)

        add(greenButton, BorderLayout.SOUTH)
        pack()
        setLocationRelativeTo(null)  // По центру экрана
        isVisible = true
    }

    override fun actionPerformed(e: ActionEvent?) {
        JOptionPane.showMessageDialog(this, "Кнопка нажата!")
    }
}

fun main() {
    SwingUtilities.invokeLater { ButtonApp() }
}
