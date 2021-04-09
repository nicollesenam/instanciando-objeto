/*
data: 23/09
classe
*/
class Main {
  public static void main(String[] args) {
    //instanciar um objeto
    livro pequenoprincipe = new livro(); //o new cria o objeto
 
    pequenoprincipe.seteditora("saraiva");
    pequenoprincipe.setsumario("introdução, capítulo 1");
    pequenoprincipe.settema("filosofia");
    pequenoprincipe.setcapa("desenho");
    pequenoprincipe.setnumerodepaginas(200);

    System.out.println("editora " + pequenoprincipe.geteditora());
    System.out.println("sumario " + pequenoprincipe.getssumario());
    System.out.println("tema " + pequenoprincipe.getstema());
    System.out.println("capa " + pequenoprincipe.getscapa());
    System.out.println("numerodepaginas " + pequenoprincipe.getsnumerodepaginas());

    }
}