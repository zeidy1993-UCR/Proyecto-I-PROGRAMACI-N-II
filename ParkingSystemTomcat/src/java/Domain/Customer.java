/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Equipo
 */
public class Customer {

    private String identification;
    private String name;
    private String email;
    private String phone;
    private String username;
    private String password;
    private boolean disabilityPresented;

    public Customer() {
    }

    public Customer(String identification, String name, String email, String phone, String username, String password, boolean disabilityPresented) {
        this.identification = identification;
        this.name = name;
        this.email = email;
        this.phone = phone;

        this.username = username;
        this.password = password;
        this.disabilityPresented = disabilityPresented;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDisabilityPresented() {
        return disabilityPresented;
    }

    public void setDisabilityPresented(boolean disabilityPresented) {
        this.disabilityPresented = disabilityPresented;
    }

  
    
    

}