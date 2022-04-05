package entities.pessoas;

public class Medico extends Pessoa {

  private String especialidade;

  public Medico(String nome, String cpf, String especialidade) {
      super(nome, cpf);
      this.especialidade = especialidade;
  }

  public String getEspecicialidade() {
      return especialidade;
  }

  public void setEspecicialidade(String especialidade) {
      this.especialidade = especialidade;
  }

  
    @Override
    public String toString() {
        return super.toString()
                + "Especialidade:" 
                + especialidade;
    }

    @Override
    public boolean equals(Object obj){

        if ( !(obj instanceof Medico) ) return false;

        Medico other = (Medico) obj;

        return super.getNome().equals(other.getNome()) 
                && super.getCpf().equals(other.getCpf())
                && getEspecicialidade().equals(other.getEspecicialidade());

    }
    
}
