package co.com.choucair.certification.techincalTest.util;
import java.util.Random;

public class PasswordGenerator{
    public static void main(String[] args) {
        System.out.println(generatePassword());
    }

    public static char[] generatePassword() {
        int length = 10;
        String upCaLe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String loCaLe = "abcdefghijklmnopqrstuvwxyz";
        String spChar = "!@#$";
        String num = "1234567890";
        String combChar = upCaLe + loCaLe + spChar + num;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = loCaLe.charAt(random.nextInt(loCaLe.length()));
        password[1] = upCaLe.charAt(random.nextInt(upCaLe.length()));
        password[2] = spChar.charAt(random.nextInt(spChar.length()));
        password[3] = num.charAt(random.nextInt(num.length()));

        for(int i = 4; i< length ; i++) {
            password[i] = combChar.charAt(random.nextInt(combChar.length()));
        }
        return password;
    }
}