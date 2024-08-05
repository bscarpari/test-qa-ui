package br.tec.db.tests.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

@SuppressWarnings("deprecation")
public class DataFakerGenerator {
    private static final Faker faker = new Faker(new Locale("en"));

    public String emailFaker() {
        return faker.internet().emailAddress();
    }

    public String passwordFaker() {
        return faker.internet().password();
    }

    public String nameFaker() {
        return faker.pokemon().name();
    }
}