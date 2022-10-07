import java.util.Date;

public class Visita {
    String CodVisita;
    Date fechaHora;
    Hospital hospital;
    Servicio servicio;
    Medico medico;
    String diagnostico;
    String tratamientos;
    int numeroCamas;
    Date fechaSalida;
    Historial historial;
    public  Visita(){

    }

    public Visita(String codVisita, Date fechaHora, Hospital hospital, Servicio servicio, Medico medico, String diagnostico, String tratamientos, int numeroCamas, Date fechaSalida, Historial historial) {
        CodVisita = codVisita;
        this.fechaHora = fechaHora;
        this.hospital = hospital;
        this.servicio = servicio;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.numeroCamas = numeroCamas;
        this.fechaSalida = fechaSalida;
        this.historial = historial;
    }

    public String getCodVisita() {
        return CodVisita;
    }

    public void setCodVisita(String codVisita) {
        CodVisita = codVisita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "CodVisita='" + CodVisita + '\'' +
                ", fechaHora=" + fechaHora +
                ", hospital=" + hospital +
                ", servicio=" + servicio +
                ", medico=" + medico +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamientos='" + tratamientos + '\'' +
                ", numeroCamas=" + numeroCamas +
                ", fechaSalida=" + fechaSalida +
                ", historial=" + historial +
                '}';
    }
}
