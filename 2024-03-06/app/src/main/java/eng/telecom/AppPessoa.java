package eng.telecom;

public class AppPessoa {

    public static void main(String[] args) {
        Pessoa [] vetor = new Pessoa[10];

        Pessoa victor = new Pessoa();

        victor.setTelephone("+55 (48) 9 9130-1613");
        victor.setSex("Masculino");
        victor.setName("Victor Evandro de Lima Guerra");
        victor.setEmail("victorevandro94@gmail.com");
        victor.setCpf("104.016.469-20");
        victor.setBirthday("08/12/2005");
        victor.setAddress("Rua Pedro Bunn, 1565");

//        System.out.println(victor);

        Pessoa nicoly = new Pessoa();

        nicoly.setTelephone("+55 (48) 9 9111-4053");
        nicoly.setEmail("ncolyscha@gmail.com");
        nicoly.setName("Nicoly da Anunciação");
        nicoly.setAddress("Rua aveiro");
        nicoly.setCpf("894.535.445-65");
        nicoly.setSex("Femenino");
        nicoly.setBirthday("12/11/2004");

        vetor[0] = victor;
        vetor[1] = nicoly;

//        for (int i = 0; i < vetor.length; i++) {
//            if(vetor[i] != null) {
//                System.out.println(vetor[i] + "\n");
//            }
//        }

        for(Pessoa p:vetor){
            if(p != null){
                System.out.println(p + "\n");
            }
        }
    }

}
