package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Grupo grupo=new Grupo("cumpelaños", Categoria.FIESTA);
        Reunion reunion =new Reunion("Trabajo",LocalDate.of(2024, 2, 4) , LocalTime.of(2, 00, 00));
        Contacto contacto=new Contacto("Juliana", "Juli", "7 de Agosto", "222","jv@gmail.com" );
        Contacto contacto2=new Contacto("Sara", "Saris", "Calarca", "555","sb@gmail.com" );
        Contacto contacto3=new Contacto("Juan", "Juanitio", "El  paraiso", "467", "jj@gmail.com");
        Contacto contacto4=new Contacto("Mariana", "Mari", "El granada", "888", "mm@gmail.com");
        Contacto contacto5=new Contacto("Jacobo", "Jaco", "La aurora", "777", "jb@gmail.com");
        Agenda.mostrarMensaje(grupo.toString());
        grupo.agregarContacto(contacto);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);
        grupo.agregarContacto(contacto5);
        reunion.agregarContacto(contacto5);
        reunion.agregarContacto(contacto4);
        Agenda.mostrarMensaje(reunion.toString());
        reunion.removerContactoAsistente("Juliana", "222");
        Agenda.mostrarMensaje(reunion.toString());
        Agenda.mostrarMensaje(reunion.toString());
        Agenda agenda =new Agenda("Agenda Personal");
        agenda.agregarContactoAgenda(contacto);
        agenda.agregarContactoAgenda(contacto2);
        agenda.agregarGrupo(grupo);
        agenda.agregarReuniones(reunion);
        Agenda.mostrarMensaje(agenda.toString());

    
    }

    
}
