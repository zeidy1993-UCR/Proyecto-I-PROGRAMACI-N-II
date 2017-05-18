/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Zeii
 */
public class Clerk extends User{
    private String placeOfWork;

    public Clerk() {
        super();
    }

    public Clerk(String identification, String name, String email, String phone, String username, String password, String placeOfWork) {
        super(identification, name, email, phone, username, password);
        this.placeOfWork = placeOfWork;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
    
}
