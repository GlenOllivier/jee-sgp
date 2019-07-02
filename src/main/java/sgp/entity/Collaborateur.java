package sgp.entity;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Collaborateur {
    private String id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String address;
    private String securityNumber;
    private String proEmail;
    private String photo;
    private ZonedDateTime creationDateTime;
    private boolean active;
    private String intitulePoste;
    private Departement departement;
    private String phoneNumber;

    private static int nextID = 1;

    public Collaborateur() {
        id = "M" + nextID++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String getProEmail() {
        return proEmail;
    }

    public void setProEmail(String proEmail) {
        this.proEmail = proEmail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ZonedDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(ZonedDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getIntitulePoste() {
        return intitulePoste;
    }

    public void setIntitulePoste(String intitulePoste) {
        this.intitulePoste = intitulePoste;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Collaborateur{");
        sb.append("id='").append(id).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", address='").append(address).append('\'');
        sb.append(", securityNumber='").append(securityNumber).append('\'');
        sb.append(", proEmail='").append(proEmail).append('\'');
        sb.append(", photo='").append(photo).append('\'');
        sb.append(", creationDateTime=").append(creationDateTime);
        sb.append(", active=").append(active);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collaborateur that = (Collaborateur) o;
        return active == that.active &&
                Objects.equals(id, that.id) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(birthDate, that.birthDate) &&
                Objects.equals(address, that.address) &&
                Objects.equals(securityNumber, that.securityNumber) &&
                Objects.equals(proEmail, that.proEmail) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(creationDateTime, that.creationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, birthDate, address, securityNumber, proEmail, photo, creationDateTime, active);
    }
}
