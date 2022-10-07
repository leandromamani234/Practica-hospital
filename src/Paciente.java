import java.util.Date;
import java.util.List;

public class Paciente extends Medico{
   String codPaciente;
   String nombre;
   String primerApellido;
   String segundoApellido;
   String DNI;
   String fechaNacimiento;
   String numeroSeguridadSocial;
   public Paciente(){

   }

   public Paciente(String codPaciente, String nombre, String primerApellido, String segundoApellido, String DNI, String fechaNacimiento, String numeroSeguridadSocial) {
      this.codPaciente = codPaciente;
      this.nombre = nombre;
      this.primerApellido = primerApellido;
      this.segundoApellido = segundoApellido;
      this.DNI = DNI;
      this.fechaNacimiento = fechaNacimiento;
      this.numeroSeguridadSocial = numeroSeguridadSocial;
   }

   public String getCodPaciente() {
      return codPaciente;
   }

   public void setCodPaciente(String codPaciente) {
      this.codPaciente = codPaciente;
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

   public String getFechaNacimiento() {
      return fechaNacimiento;
   }

   public void setFechaNacimiento(String fechaNacimiento) {
      this.fechaNacimiento = fechaNacimiento;
   }

   public String getNumeroSeguridadSocial() {
      return numeroSeguridadSocial;
   }

   public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
      this.numeroSeguridadSocial = numeroSeguridadSocial;
   }

   @Override
   public String toString() {
      return "Paciente{" +
              "codPaciente='" + codPaciente + '\'' +
              ", nombre='" + nombre + '\'' +
              ", primerApellido='" + primerApellido + '\'' +
              ", segundoApellido='" + segundoApellido + '\'' +
              ", DNI='" + DNI + '\'' +
              ", fechaNacimiento=" + fechaNacimiento +
              ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
              '}';
   }
}
