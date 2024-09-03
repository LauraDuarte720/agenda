package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;


public class Agenda {
    private String nombre;
    private LinkedList<Contacto>contactosAgenda;
    private LinkedList<Grupo>grupos;
    private LinkedList<Reunion>reuniones;

    public Agenda(String nombre){
        this.nombre=nombre;
        contactosAgenda=new LinkedList<>();
        grupos=new LinkedList<>();
        reuniones=new LinkedList<>();
        assert !nombre.isBlank();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Contacto> getContactosAgenda() {
        return contactosAgenda;
    }

    public void setContactosAgenda(LinkedList<Contacto> contactosAgenda) {
        this.contactosAgenda = contactosAgenda;
    }

    public LinkedList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(LinkedList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public LinkedList<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(LinkedList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    
    public static void mostrarMensaje( String mensaje) {
        System.out.println(mensaje);
    }

    public void agregarContactoAgenda(Contacto contacto){
        if (validarContacto(contacto.getNombre(), contacto.getTelefono())){
            Agenda.mostrarMensaje("EL contacto con nombre "+contacto.getNombre()+ " y telefono " +contacto.getTelefono()+ " ya esta creado");
        }else{
            contactosAgenda.add(contacto);
        }
    }


    public void agregarGrupo(Grupo grupo){
            grupos.add(grupo);
        
    }

    public void agregarreuniones(Reunion reunion){
            reuniones.add(reunion);
    }

    public boolean validarContacto(String nombre,String telefono ){
        boolean nombreTelefonoRepetido=false;
        for(Contacto contacto:contactosAgenda){
            if (contacto.getNombre().equals(nombre)){
                if (contacto.getTelefono().equals(telefono)){
                    nombreTelefonoRepetido=true;
                }
            }    
        }
        return nombreTelefonoRepetido;
    }

    @Override
    public String toString() {
        return "Agenda " + nombre + ", cuyos contactos son" + contactosAgenda + "\n, sus grupos son:\n " + grupos
                + "\n, reuniones:\n" + reuniones;
    }

    public void removerContacto(String nombre, String telefono ){
        for (Contacto contacto:contactosAgenda){
            if (contacto.getNombre().equals(nombre)){
                if(contacto.getTelefono().equals(telefono)){
                    contactosAgenda.remove(contacto);
                    break;
                }
            }
        }
    }

    public void removerGrupo(String nombre ){
        for (Grupo grupo:grupos){
            if (grupo.getNombre().equals(nombre)){
                grupos.remove(grupo);
               break;
                
            }
        }
    }

    public void removerReunion(String descripcion ){
        for (Reunion reunion:reuniones){
            if (reunion.getDescripcion().equals(descripcion)){
                reuniones.remove(reunion);
                break;
                
            }
        }
    }

    public void actualizarContacto(String alias,String direccion,String email, String nombre, String telefono ){
        for (Contacto contacto:contactosAgenda){
            if (contacto.getNombre().equals(nombre)){
                if (contacto.getTelefono().equals(telefono))
                contacto.setAlias(alias);
                contacto.setDireccion(direccion);
                contacto.setEmail(email);
                break;
            }
        }
    }

    public void actualizarReunion(LocalDate fecha,LocalTime hora, String descripcion){
        for (Reunion reunion:reuniones){
            if (reunion.getDescripcion().equals(descripcion)){
                reunion.setFecha(fecha);
                reunion.setHora(hora);
                break;
            }
        }
    }

    public void actualizarGrupo(Categoria categoria,String nombre){
        for (Grupo grupo:grupos){
            if (grupo.getNombre().equals(nombre)){
                grupo.setCategoria(categoria);
                break;
            }
        }
    }
    
}
