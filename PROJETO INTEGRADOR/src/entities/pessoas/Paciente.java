package entities.pessoas;

public class Paciente extends Pessoa {

  private String endereco;

  public Paciente(String nome, String cpf, String endereco) {
      super(nome, cpf);
      this.endereco = endereco;
  }

  public String getEndereco() {
      return endereco;
  }

  public void setEndereco(String endereco) {
      this.endereco = endereco;
  }


    @Override
    public boolean equals(Object obj) {
        
        if( ! (obj instanceof Paciente) ) return false;

        Paciente other = (Paciente) obj;

        return super.getNome().equals(other.getNome()) 
                && super.getCpf().equals(other.getCpf())
                && getEndereco().equals(other.getEndereco()); 
    }

    @Override
    public String toString() {
        return super.toString()
                + "Endreço:" 
                + endereco;
    }

  
    
}
