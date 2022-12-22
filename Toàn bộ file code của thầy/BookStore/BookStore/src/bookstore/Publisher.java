package bookstore;

/**
 * Publisher.
 *
 * @author hasu
 */
public class Publisher extends BookStoreObject {

    private String phoneNumber;
    private String address;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) throws BookStoreException {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new BookStoreException("Phone number is null or blank");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public final void setAddress(String address) throws BookStoreException {
        if (address == null || address.isBlank()) {
            throw new BookStoreException("Address is null or blank");
        }
        this.address = address;
    }

    public Publisher() {
    }

    public Publisher(
            String id,
            String name,
            String phoneNumber,
            String address) throws BookStoreException {
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
