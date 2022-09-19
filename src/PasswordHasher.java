import java.util.Random;

public class PasswordHasher extends Hasher {
    @Override
    public String hash(String input) {
        char[] chars = input.toCharArray();
        Random rand = new Random(chars[0] + chars[chars.length - 1]);
        for (int i = 0; i < chars.length; i++) {
            int next = rand.nextInt();
            chars[i] += next % 0b11111111 < 33 ? (next % 0b11111111) + 33 : next % 0b11111111;
        }
        return String.valueOf(chars);
    }

    public static Hasher create() {
        return new PasswordHasher();
    }
}
