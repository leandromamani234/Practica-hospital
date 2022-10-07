import java.util.Date;
import java.util.List;

public class Medico{
    String codMedico;
    String nombre;
    String primerApellido;
    String segundoApellido;
    String DNI;
    String fechaNAcimiento;
    String servicios;
    String hospital;
    public Medico(){

    }

    public Medico(String codMedico, String nombre, String primerApellido, String segundoApellido, String DNI, String fechaNAcimiento, String servicios, String hospital) {
        this.codMedico = codMedico;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.DNI = DNI;
        this.fechaNAcimiento = fechaNAcimiento;
        this.servicios = servicios;
        this.hospital = hospital;
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNAcimiento() {
        return fechaNAcimiento;
    }

    public void setFechaNAcimiento(String fechaNAcimiento) {
        this.fechaNAcimiento = fechaNAcimiento;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "codMedico='" + codMedico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNAcimiento=" + fechaNAcimiento +
                ", servicios=" + servicios +
                ", hospital=" + hospital +
                '}';
    }
}
