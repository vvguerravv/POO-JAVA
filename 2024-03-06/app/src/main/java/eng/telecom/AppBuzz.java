package eng.telecom;

public class AppBuzz {

    public static void main(String[] args) {

        BuzzLightyear buzzLightyear = new BuzzLightyear();

        System.out.println(buzzLightyear.laserActive()); ;
        System.out.println(buzzLightyear.beating());
        buzzLightyear.openCloseHelmet();
        buzzLightyear.openCloseWing();
        buzzLightyear.openCloseHelmet();
        buzzLightyear.openCloseWing();
        System.out.println(buzzLightyear.laserActive());
        System.out.println(buzzLightyear.speakBuzz());

    }

}
