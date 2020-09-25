
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
public class Usuario extends Persona {
    
    private String usuario;
    private String password;
    private ArrayList<Chats> listaChats = new ArrayList();
    private ArrayList<Usuario> listaUser = new ArrayList();
    private int wifi;

    public Usuario() {
        super();
    }

    public Usuario(String usuario, String password, int wifi) {
        this.usuario = usuario;
        this.password = password;
        this.wifi = wifi;
    }

    public Usuario(String usuario, String password, int wifi, String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
        this.usuario = usuario;
        this.password = password;
        this.wifi = wifi;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Chats> getListaChats() {
        return listaChats;
    }

    public void setListaChats(ArrayList<Chats> listaChats) {
        this.listaChats = listaChats;
    }

    public ArrayList<Usuario> getListaUser() {
        return listaUser;
    }

    public void setListaUser(ArrayList<Usuario> listaUser) {
        this.listaUser = listaUser;
    }

    public int getWifi() {
        return wifi;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return super.toString()+" "+usuario;
    }
    
    
    
    
}
