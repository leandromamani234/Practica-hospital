import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hospital> hospitales= new ArrayList<>();
        List<Servicio> servicios= new ArrayList<>();
        Ciudad oruro=new Ciudad("or", "Oruro");
        Medico medico8= new Medico("787","saul","mol","Con","45","14/45/7","odontologia","Cochabamba");
        Servicio servicio = new Servicio("od","odontologia",17,"bueno",hospitales);
        Hospital hospital = new Hospital("45","Cochabamba",oruro,778747,servicios,medico8);
        Paciente paciente= new Paciente("78","carl","hul","almn","7854","78/sep/441","1234");
        System.out.println(hospital.toString());

    }
}