public class Pessoa extends Animal {

    //atributos da pessoa

    public String sobrenome;

    //métodos de classe
    public void falar(){
        System.out.println("falei");
    }
    // sobrecarga do método falar()
    public String falar(String volume){
        return "falei" + volume;
    }

    //sobrescrita do método
    public void comer(){
        System.out.println("comeu como pessoa");
    }

}
