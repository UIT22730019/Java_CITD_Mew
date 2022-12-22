package phuongtiengiaothong.datamanagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import phuongtiengiaothong.IDataMangement;
import phuongtiengiaothong.PTGTException;

/**
 *
 * @author hasu
 */
public class FileDataManagement implements IDataMangement {

    private final String filePath;
    private final String filePath2 = "bb";

    public FileDataManagement(String filePath) throws PTGTException {
        if (filePath == null || filePath.isBlank()) {
            throw new PTGTException("filePath is null or blank");
        }
        this.filePath = filePath;
    }

    @Override
    public List<String> loadData() {
        return readStringFromFile();
    }

    @Override
    public boolean saveData(List<String> dataList) {
        return saveStringToFile(dataList);
    }

    @Override
    public boolean add(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(List<String> dataList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(List<String> dataList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(List<String> dataList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<String> readStringFromFile() {
        List<String> dataObjectList = new ArrayList();
        try ( Scanner sc = new Scanner(new File(this.filePath))) {
            String data;
            // read entity header
            String nextLine = sc.nextLine();
            while (sc.hasNextLine()) {
                data = sc.nextLine();
                if (!data.isBlank()) {
                    dataObjectList.add(data);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return dataObjectList;
    }

    public boolean saveStringToFile(List<String> dataList) {
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(this.filePath, false))) {
            // append entity header
//            writer.append(getEntityHeader());
            for (String data : dataList) {
                if (!data.isBlank()) {
                    writer.append("\n");
                    writer.append(data);
                }
            }
            writer.flush();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
