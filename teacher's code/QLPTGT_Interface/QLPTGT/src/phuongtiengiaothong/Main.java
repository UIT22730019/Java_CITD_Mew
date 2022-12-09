package phuongtiengiaothong;

import java.util.logging.Level;
import java.util.logging.Logger;
import phuongtiengiaothong.datamanagement.FileDataManagement;

/**
 * Main.
 *
 * @author hasu
 */
public class Main {

    private static final String FILE_PATH = "ptgt.csv";
    QuanLyPhuongTienGiaoThong qlptgt;

    private void run() throws Exception {
        qlptgt = new QuanLyPhuongTienGiaoThong();
        qlptgt.setDataManagement(new FileDataManagement(Main.FILE_PATH));
//        qlptgt.setDataManagement(new SQLDataManagement());
        qlptgt.run();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new Main().run();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
