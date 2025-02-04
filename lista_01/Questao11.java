package lista_01;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Questao11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try {
            byte[] salt = generateSalt();
            String originalPassword = generateHash("Senha123", salt);

            // item a)
            System.out.print("Senha: ");
            String userPassword = scanner.next();

            while (!verifyPassword(userPassword, originalPassword, salt)) {
                System.out.println("Senha incorreta!\n");

                System.out.print("Senha: ");
                userPassword = scanner.next();
            }

            System.out.println("Senha correta!\n");

            // item b)
            do {
                System.out.print("Senha: ");
                userPassword = scanner.next();

                if (!verifyPassword(userPassword, originalPassword, salt)) {
                    System.out.println("Senha incorreta!\n");
                }
            } while (!verifyPassword(userPassword, originalPassword, salt));

            System.out.println("Senha correta!\n");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InvalidKeySpecException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }

    private static String generateHash(String password, byte[] salt) throws NoSuchAlgorithmException, InvalidKeySpecException
    {
        PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 256);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        byte[] hash = factory.generateSecret(spec).getEncoded();
        return Base64.getEncoder().encodeToString(hash);
    }

    private static byte[] generateSalt()
    {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }

    private static boolean verifyPassword(String userPassword, String originalPassword, byte[] salt) throws NoSuchAlgorithmException, InvalidKeySpecException
    {
        String newHash = generateHash(userPassword, salt);
        return newHash.equals(originalPassword);
    }
}
