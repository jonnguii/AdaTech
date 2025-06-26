package Training;

public class HumorDoDia {

    public static String medirHumor(String clima) {
        if (clima.equalsIgnoreCase("ensolarado")) {
            return "feliz";
        } else if (clima.equalsIgnoreCase("chuvoso")) {
            return "preguiça";
        }else if (clima.equalsIgnoreCase("nublado")) {
            return "desanimado";
        } else {
            return "neutro";
        }
    }
}
