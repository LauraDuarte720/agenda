package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Grupo {
    

    private String nombre;
    private Categoria categoria;
    private LinkedList<Contacto>contactos;
    

    public Grupo(String nombre,Categoria categoria){
        this.nombre=nombre;
        this.categoria=categoria;
        contactos=new LinkedList<>();
        assert !nombre.isBlank();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarContacto(Contacto contacto){
        if (validarContacto(contacto.getNombre(), contacto.getTelefono())){
            Agenda.mostrarMensaje("EL contacto con nombre "+contacto.getNombre()+ " y telefono " +contacto.getTelefono()+ " ya esta creado");
        }else{
            contactos.add(contacto);
        }
    }

    public boolean validarContacto(String nombre,String telefono ){
        boolean nombreTelefonoRepetido=false;
        for(Contacto contacto:contactos){
            if (contacto.getNombre().equals(nombre)){
                if (contacto.getTelefono().equals(telefono)){
                    nombreTelefonoRepetido=true;
                }
            }    
        }
        return nombreTelefonoRepetido;
    }

    public void removerContacto(String nombre, String telefono){
        for (Contacto contacto:contactos){
            if (contacto.getNombre().equals(nombre)){
                if(contacto.getTelefono().equals(telefono)){
                    contactos.remove(contacto);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Grupo " + nombre + ", categoria " + categoria + " esta conformado  por: \n" + contactos;
    }

    

}
