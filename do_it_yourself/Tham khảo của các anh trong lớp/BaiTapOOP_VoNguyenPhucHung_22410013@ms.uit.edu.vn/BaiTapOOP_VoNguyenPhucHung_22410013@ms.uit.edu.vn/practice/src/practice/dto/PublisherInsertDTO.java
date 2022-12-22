package practice.dto;

public class PublisherInsertDTO {
    private String code;
    private String name;
    private String phone;
    private String address;

    public PublisherInsertDTO(String code, String name, String phone, String address) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
