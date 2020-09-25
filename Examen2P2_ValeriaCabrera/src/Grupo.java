
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
public class Grupo extends Chats{
    
    private String nombre;
    private ArrayList<Usuario> miembros = new ArrayList();
    private Usuario admin;
    private ArrayList<Mensajes> listaMen = new ArrayList();

    public Grupo() {
        super();
    }

    public Grupo(String nombre, Usuario admin) {
        this.nombre = nombre;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getAdmin() {
        return admin;
    }

    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }

    public ArrayList<Mensajes> getListaMen() {
        return listaMen;
    }

    public void setListaMen(ArrayList<Mensajes> listaMen) {
        this.listaMen = listaMen;
    }

    @Override
    public String toString() {
        return nombre+" - "+admin;
    }
    
    
    
    
    
}
