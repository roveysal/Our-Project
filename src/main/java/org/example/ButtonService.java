package org.example;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class ButtonService {
    public ReplyKeyboardMarkup firstPage(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDE96Yetkazib berish");

        KeyboardButton button1 =new KeyboardButton();
        button1.setText("\uD83C\uDFC3 Olib ketish");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDD19Orqaga");

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        row.add(button);
        row.add(button1);
        row1.add(button2);

        rowList.add(row);
        rowList.add(row1);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        markup.setOneTimeKeyboard(true);

        return markup;
    }
    public ReplyKeyboardMarkup menu(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDD19Orqaga");

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDED2Savatcha");

        KeyboardRow row = new KeyboardRow();
        row.add(button);
        row.add(button1);

        rowList.add(row);
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        markup.setOneTimeKeyboard(true);

        return markup;
    }
}
