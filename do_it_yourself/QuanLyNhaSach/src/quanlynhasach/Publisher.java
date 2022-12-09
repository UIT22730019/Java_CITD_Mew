/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhasach;

/**
 *
 * @author 84793
 */
public class Publisher extends BookStoreObject {

    private String phoneNumber;
    private String address;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) throws BookStoreExeption {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new BookStoreExeption("Phone number is null or Empty");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public final void setAddress(String address) throws BookStoreExeption {
        if (address == null || address.isBlank()) {
            throw new BookStoreExeption("Address is null or Empty");
        }
        this.address = address;
    }

    public Publisher() {
    }

    public Publisher(
            String id,
            String name,
            String phoneNumber,
            String address
    ) throws BookStoreExeption {
        super(id, name);
        this.setPhoneNumber(phoneNumber);
        this.setAddress(address);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Publisher publisher) {
            return this.getId().equalsIgnoreCase(publisher.getId());
        }
        return super.equals(obj);
    }


}
