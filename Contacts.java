class Contacts{
    private String fistName;
    private String lastName;
    private String address;
    private String city;
    private String zip;
    private String phoneNumber;
    private String email;

    Contacts(String f,String l,String address ,String city,String zip,String phoneNumber,String email){
           this.fistName=f;
           this.lastName=l;
           this.address=address;
           this.city=city;
           this.zip=zip;
           this.phoneNumber=phoneNumber;
           this.email=email;
    }

    public String getFistName() {
        return fistName;
    }
    public void setFirstName(String fistName) {
        this.fistName = fistName;
    }

    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }


    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}