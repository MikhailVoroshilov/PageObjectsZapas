package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor() {
        return new VerificationCode("12345");
    }

  @Value
  public static class CardNumber{
      private String number;
  }

  public static CardNumber getCardNumber1() {
      return new CardNumber("5559 0000 0000 0001");
  }

  public static CardNumber getCardNumber2() {
      return new CardNumber("5559 0000 0000 0002");
  }

    public static int getRandomSum(int sum){
        Faker faker = new Faker();
        int randomSum = faker.random().nextInt(1, sum);
        return randomSum;
    }
}
