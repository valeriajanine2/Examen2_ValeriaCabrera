
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class binarioChats {
    
    private ArrayList<Mensajes> listaChats = new ArrayList(); //memoria ram
    private File archivo = null;//memoria rom

    public binarioChats(String path) {
        archivo = new File(path);
    }

    public ArrayList<Mensajes> getListaChats() {
        return listaChats;
    }

    public void setListaChats(ArrayList<Mensajes> listaChats) {
        this.listaChats = listaChats;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaChats=" + listaChats;
    }

    //extra mutador

    public void setMensaje(Mensajes m){
        listaChats.add(m);
    }

    public void cargarArchivo() {
        try {            
            listaChats = new ArrayList();//limpiar el arraylist
            Mensajes temp;
            if (archivo.exists()) {//para evitar exception
                  FileInputStream entrada = new FileInputStream(archivo); //apuntar al archivo
                ObjectInputStream objeto = new ObjectInputStream(entrada);//apuntando hacia el canal
                try {
                    //leyendo de objeto en objeto
                    while ((temp = (Mensajes) objeto.readObject()) != null) {//iterar lo que esta en el buffer
                        listaChats.add(temp);//se agrega cada objeto al arraylist
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();//cerrar el canal
                entrada.close();//cerrar el objeto
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);//apuntando hacia el archivo
            bw = new ObjectOutputStream(fw);//apuntando hacia el canal
            //sobreescribir sobre el archivo
            for (Mensajes t : listaChats) {
                bw.writeObject(t);//escribiendo objetos
            }
            //cada nodo del arraylist se escribe
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
