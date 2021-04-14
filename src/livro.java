/*
data: 16/09
classe
*/
class livro {
  //atributos
  //private indica o encapsulamento
  private String editora; 
  private String sumario;
  private String tema;
  private String capa;
  private int numerodepaginas;

  //métodos
  public void seteditora(String editora){
    if(editora == ""){
      System.out.println("favor informar algum valor: ");
    }else{
      this.editora = editora;
    }
  }
  public String geteditora(){
    return this.editora;
  }
  public void setsumario(String sumario){
    this.sumario = sumario; 
  }
  public String getssumario(){
    return this.sumario;
  }
  public void settema(String tema){
    this.tema = tema; 
  }
  public String getstema(){
    return this.tema;
  }
  public void setcapa(String capa){
    this.capa = capa; 
  }
  public String getscapa(){
    return this.capa;
  }
  public void setnumerodepaginas(int numerodepaginas){
    this.numerodepaginas = numerodepaginas; 
  }
  public int getsnumerodepaginas(){
    return this.numerodepaginas;
  }
}
