
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Privado extends Chats{
    
    public ArrayList<Mensajes> listaMen = new ArrayList();
    public Usuario user;

    public Privado() {
        super();
    }

    public Privado(Usuario user) {
        this.user = user;
    }

    public ArrayList<Mensajes> getListaMen() {
        return listaMen;
    }

    public void setListaMen(ArrayList<Mensajes> listaMen) {
        this.listaMen = listaMen;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Privado{" + "user=" + user + '}';
    }
    
    
    
}
