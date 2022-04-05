package entities.consultas;

import entities.pessoas.Medico;
import entities.pessoas.Paciente;

public class Consulta {
    
  private int identificador;
  private int diaConsulta;
  private int mesConsulta;
  private int anoConsulta;
  private int horaConsulta;

  private Paciente paciente;
  private Medico medico;

  public Consulta(int diaConsulta, int mesConsulta, int anoConsulta, int horaConsulta, Paciente paciente,
      Medico medico) {
    identificador = (int)Math.floor( Math.random()*(9999-1000+1) + 1000 );
    this.diaConsulta = diaConsulta;
    this.mesConsulta = mesConsulta;
    this.anoConsulta = anoConsulta;
    this.horaConsulta = horaConsulta;
    this.paciente = paciente;
    this.medico = medico;
  }

  public int getIdentificador() {
    return identificador;
  }

  public int getDiaConsulta() {
    return diaConsulta;
  }

  public int getMesConsulta() {
    return mesConsulta;
  }

  public int getAnoConsulta() {
    return anoConsulta;
  }

  public int getHoraConsulta() {
    return horaConsulta;
  }

  public void setMomentoConsulta(int diaConsulta, int mesConsulta, int anoConsulta, int horaConsulta){
    this.diaConsulta = diaConsulta;
    this.mesConsulta = mesConsulta;
    this.anoConsulta = anoConsulta;
    this.horaConsulta = horaConsulta;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPessoa(Paciente paciente) {
    this.paciente = paciente;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  @Override
  public String toString() {
    return "##### Consulta #" 
            + identificador 
            +" ####\n"
            + "Paciente: "
            + paciente
            +"\nMédico:"
            + medico
            +"\nData: "
            + diaConsulta + "/" 
            + mesConsulta + "/" 
            + anoConsulta 
            + " || horário: "
            + horaConsulta;
  }

}
