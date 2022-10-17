import javax.swing.*;
import java.awt.*;

public class FilterForm extends JDialog {
    private JPanel StoreFilter;
    private JComboBox comboBox;
    private JTextField HourField;
    private JTextField RatingField;
    private JButton applyFiltersButton;
    private JLabel typeLabel;
    private JLabel openDuringLabel;
    private JLabel ratingLabel;

    public FilterForm(JFrame parent) {
        super(parent);
        this.setTitle("Filters");
        this.setContentPane(this.StoreFilter);
        this.setMinimumSize(new Dimension(450,427));
        this.setModal(true);
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FilterForm((JFrame) null);
    }
}
