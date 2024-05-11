package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new MyBots("6788486128:AAEEHPzLAvWsU2nLsyrpMMqH54cG2Z78syI"));

        }catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}