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
        Grupo grupo2=new Grupo ("Cita",Categoria.FAMILIA);
        Reunion reunion =new Reunion("Trabajo",LocalDate.of(2024, 2, 4) , LocalTime.of(2, 00, 00));
        Reunion reunion2 =new Reunion("Fiesta",LocalDate.of(2024, 11, 9) , LocalTime.of(4, 30, 00));
        Contacto contacto=new Contacto("Juliana", "Juli", "7 de Agosto", "222","jv@gmail.com" );
        Contacto contacto2=new Contacto("Sara", "Saris", "Calarca", "555","sb@gmail.com" );
        grupo.agregarContacto(contacto);
        grupo2.agregarContacto(contacto);
        Agenda.mostrarMensaje(grupo.toString());
        Agenda.mostrarMensaje(grupo2.toString());
        reunion.agregarContacto(contacto);
        reunion.agregarContacto(contacto2);
        Agenda.mostrarMensaje(reunion.toString());
        reunion.removerContactoAsistente("Juliana", "222");
        Agenda.mostrarMensaje(reunion.toString());
        Agenda.mostrarMensaje(reunion.toString());
        Agenda agenda =new Agenda("Agenda Personal");
        agenda.agregarContactoAgenda(contacto);
        agenda.agregarContactoAgenda(contacto2);
        agenda.agregarGrupo(grupo2);
        agenda.agregarGrupo(grupo);
        agenda.agregarreuniones(reunion);
        agenda.agregarreuniones(reunion2);
        Agenda.mostrarMensaje(agenda.toString());

    
    }

    
}
