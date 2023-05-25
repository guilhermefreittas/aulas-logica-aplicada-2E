public class Pessoa {

    //atributos da pessoa
    public String nome;
    public String sobrenome;

    //métodos de classe
    public void falar(){
        System.out.println("falei");
    }
    // sobrecarga do método falar()
    public String falar(String volume){
        return "falei" + volume;
    }



}
