package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;
    private LinkedList<Grupo>gruposContacto;


    public Contacto(String nombre,String alias, String direccion, String telefono, String email){
        this. nombre=nombre;
        this. alias=alias;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
        gruposContacto=new LinkedList<>();
        assert !nombre.isBlank();
        assert !alias.isBlank();
        assert !direccion.isBlank();
        assert !telefono.isBlank();
        assert !email.isBlank();
        assert email.contains("@");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto " + nombre + ", :" + alias + ", " + direccion + ", " + telefono
                + ", " + email+ "\n";
    }

    public LinkedList<Grupo> getGruposContacto() {
        return gruposContacto;
    }

    public void agregarGrupoContacto(Grupo grupo){
        gruposContacto.add(grupo);
    
}

    public void setGruposContacto(LinkedList<Grupo> gruposContacto) {
        this.gruposContacto = gruposContacto;
    }

    
}
