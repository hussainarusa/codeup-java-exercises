import java.util.Random;

public class ServerNameGenerator {
    private static final String[] adjectives = {
            "dedicated", "dynamic", "energetic", "fearless", "grateful",
            "harmonious", "innovative", "jovial", "keen", "luminous"
    };

    private static final String[] nouns = {
            "photon", "orbit", "nebula", "galaxy", "nova",
            "quasar", "satellite", "telescope", "universe", "zenith"
    };

    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);

        String serverName = adjective + "-" + noun;

        System.out.println("Here is your server name:");
        System.out.println(serverName);
    }

    private static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}
