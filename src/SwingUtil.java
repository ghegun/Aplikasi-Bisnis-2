
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SwingUtil {
    public void setActive(boolean active, JButton ...buttons) {
        for (JButton button : buttons) {
            button.setEnabled(active);
        }
    }
    
    public void setActive(boolean active, JTextField ...texts) {
        for (JTextField text : texts) {
            text.setEnabled(active);
        }
    }
    
    public void clearText(JTextField ...texts) {
        for (JTextField text : texts) {
            text.setText("");
        }
    }

    public void setActive(boolean active, JMonthChooser ...months) {
       for (JMonthChooser month : months){
           month.setEnabled(active);
       }
    }
    
    public void setActive(boolean active, JYearChooser ...years) {
       for (JYearChooser year : years){
           year.setEnabled(active);
       }
    }

    public void setActive(boolean b, JMonthChooser Bulan, JYearChooser Tahun) {
    }

}
