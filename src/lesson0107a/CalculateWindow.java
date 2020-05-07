package lesson0107a;

import org.mariuszgromada.math.mxparser.Expression;

import javax.swing.*;
import java.awt.*;

public class CalculateWindow extends JFrame {
    private JTextField textField;
    private JPanel panel;
    private JLabel labelResult;
    private JSlider slider;
    private JLabel labelSlider;

    private void createUIComponents() {
        panel = new JPanel();
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void finalizeUIComponents() {
        textField.setBorder(BorderFactory.createEmptyBorder());
        textField.addActionListener(e -> {
            String resultString;
            Expression expression = new Expression(textField.getText());
            double result = expression.calculate();
            if (Double.isNaN(result)) {
                resultString = "expression error";
            } else {
                resultString = String.format("%." + slider.getValue() + "f", result);
            }
            labelResult.setText(resultString);
        });

        setTitle("The Simple but Powerful Calculator");
        pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width - getWidth()) / 2;
        int y = (dim.height - getHeight()) / 2;
        setLocation(x, y);

        setResizable(false);
        setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        panel.setLayout(new GridBagLayout());
        panel.setName("");
        panel.setPreferredSize(new Dimension(450, 150));
        textField = new JTextField();
        textField.setBackground(new Color(-855310));
        Font textFieldFont = this.$$$getFont$$$("Arial", -1, 24, textField.getFont());
        if (textFieldFont != null) textField.setFont(textFieldFont);
        textField.setHorizontalAlignment(0);
        textField.setText("");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textField, gbc);
        labelResult = new JLabel();
        Font labelResultFont = this.$$$getFont$$$("Arial", Font.BOLD, 24, labelResult.getFont());
        if (labelResultFont != null) labelResult.setFont(labelResultFont);
        labelResult.setHorizontalAlignment(0);
        labelResult.setText("write expression and type <enter>");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelResult, gbc);
        slider = new JSlider();
        slider.setEnabled(true);
        slider.setExtent(0);
        slider.setInverted(false);
        slider.setMajorTickSpacing(2);
        slider.setMaximum(4);
        slider.setMinimum(0);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setSnapToTicks(true);
        slider.setValue(2);
        slider.setValueIsAdjusting(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(slider, gbc);
        labelSlider = new JLabel();
        labelSlider.setHorizontalAlignment(0);
        labelSlider.setHorizontalTextPosition(0);
        labelSlider.setText("digits after comma");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelSlider, gbc);
        final JSeparator separator1 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(separator1, gbc);
        final JSeparator separator2 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(separator2, gbc);
        final JSeparator separator3 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(separator3, gbc);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

}
