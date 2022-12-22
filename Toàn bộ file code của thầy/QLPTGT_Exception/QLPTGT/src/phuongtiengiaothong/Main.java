package phuongtiengiaothong;

import phuongtiengiaothong.datamanagement.FileDataManagement;

/**
 * Main.
 *
 * @author hasu
 */
public class Main {

    private static final String FILE_PATH = "ptgt.csv";
    QuanLyPhuongTienGiaoThong qlptgt;

    private void run() throws PTGTException {
        qlptgt = new QuanLyPhuongTienGiaoThong();
        qlptgt.setDataManagement(new FileDataManagement(Main.FILE_PATH));
        qlptgt.run();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new Main().run();
        } catch (PTGTException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
