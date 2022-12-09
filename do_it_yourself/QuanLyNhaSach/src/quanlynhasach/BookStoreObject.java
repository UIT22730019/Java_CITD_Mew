/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhasach;

/**
 *
 * @author 84793
 */
public abstract class BookStoreObject {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public final void setId(String id) throws BookStoreExeption {
        if (id != null && !id.isBlank()) {
            this.id = id;
        } else {
            throw new BookStoreExeption("Id null or empty");
        }
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) throws BookStoreExeption {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            throw new BookStoreExeption("Name is null or empty");
        }
    }

    public BookStoreObject() {
    }

    public BookStoreObject(String id, String name) throws BookStoreExeption {
        this.setId(id);
        this.setName(name);
    }
    
    
}
