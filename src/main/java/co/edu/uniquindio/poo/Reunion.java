package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Reunion {
    private String descripcion;
    private LocalDate fecha;
    private LocalTime hora;
    private LinkedList<Contacto>contactosReunion;

    
    public Reunion(String descripcion, LocalDate fecha, LocalTime hora){
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.hora=hora;
        contactosReunion=new LinkedList<>();
        assert !descripcion.isBlank();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LinkedList<Contacto> getContactosReunion() {
        return contactosReunion;
    }

    public void setContactosReunion(LinkedList<Contacto> contactosReunion) {
        this.contactosReunion = contactosReunion;
    }

    public void agregarContacto(Contacto contacto){
        if (validarContacto(contacto.getNombre(), contacto.getTelefono())){
            Agenda.mostrarMensaje("EL contacto con nombre "+contacto.getNombre()+ " y telefono " +contacto.getTelefono()+ " ya esta creado");
        }else{
            contactosReunion.add(contacto);
        }
    }

    public boolean validarContacto(String nombre,String telefono ){
        boolean nombreTelefonoRepetido=false;
        for(Contacto contacto:contactosReunion){
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
        return "Reunion" + descripcion + ", " + fecha + ", " + hora + ". La reunion esta conformada por: \n"+ contactosReunion;
    }

    public void removerContactoAsistente(String nombre, String telefono ){
        for (Contacto contacto:contactosReunion){
            if (contacto.getNombre().equals(nombre)){
                if(contacto.getTelefono().equals(telefono)){
                    contactosReunion.remove(contacto);
                    break;
                }
            }
        }
    }

    
}
