/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhasach;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84793
 */
public class Main {
private QuanLyNhaSach quanlynhasach;

    public Main() {
        this.quanlynhasach = new QuanLyNhaSach();
    }
    private void addBook(){
        //stub
        List <Author> authorList = new ArrayList();
        List <Publisher> publisherList = new ArrayList();
        for(int i = 0; i < 10 ; i++){
            try {
                authorList.add(new Author(String.format("%03d", i), String.format("Author %03d", i)));
                publisherList.add(new Publisher(id, name, phoneNumber, address))
            } catch (BookStoreExeption ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.quanlynhasach.add(
                new Book(String.format("%03d", i),
                        "Book 1", 
                        authorList.get(0),
                        new Publisher(id, name, phoneNumber, address), publicYear));
            
        }
    }
private void run(){
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().run;
    }
}
