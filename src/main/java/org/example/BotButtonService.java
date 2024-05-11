package org.example;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class BotButtonService {
    public ReplyKeyboardMarkup menu(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4= new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardRow row6= new KeyboardRow();
        KeyboardRow row7 = new KeyboardRow();
        KeyboardRow row8= new KeyboardRow();
        KeyboardRow row9 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD57 Salatlar - 86");

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83E\uDD59 Quyuq taom - 210");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF72 Suyuq taomlar - 44");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83E\uDD51 Dieta taomlar - 21");

        KeyboardButton button4 =new KeyboardButton();
        button4.setText("\uD83C\uDF73 Nonushta - 184");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83C\uDF55 Pitsalar - 24");

        KeyboardButton button6 =  new KeyboardButton();
        button6.setText("\uD83C\uDF79 Ichimlik va kokteyllar - 51");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83C\uDF70 Piroglar - 82");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("\uD83C\uDF6A Pechenyelar - 50");

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("\uD83C\uDF7C Bolalar uchun taomlar - 3");

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("\uD83E\uDD50 Bulochkalar - 58");

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Somsalar - 46");

        KeyboardButton button12 = new KeyboardButton();
        button12.setText("\uD83E\uDDC1 Shirinliklar - 234");

        KeyboardButton button13 = new KeyboardButton();
        button13.setText("\uD83C\uDF68 Muzqaymoq - 17");

        KeyboardButton button14 = new KeyboardButton();
        button14.setText("Yarim tayyor maxsulotlar - 4");

        KeyboardButton button15 = new KeyboardButton();
        button15.setText("Bayram uchun retseptlar - 0");

        KeyboardButton button16 = new KeyboardButton();
        button16.setText("✍\uFE0F Bot haqida taklif va shikoyatlarni yuborish");

        KeyboardButton button17 = new KeyboardButton();
        button17.setText("⬅\uFE0F Ortga qaytish");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);
        row2.add(button5);
        row3.add(button6);
        row3.add(button7);
        row4.add(button8);
        row4.add(button9);
        row5.add(button10);
        row5.add(button11);
        row6.add(button12);
        row6.add(button13);
        row7.add(button14);
        row7.add(button15);
        row8.add(button16);
        row9.add(button17);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);
        rowList.add(row8);
        rowList.add(row9);

        markup.setKeyboard(rowList);
        markup.setSelective(true);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(true);

        return markup;
    }


    public ReplyKeyboardMarkup mainMenu(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("Mahsulotlar orqali qidirish");

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Retseptlar katalogi");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Foodblogerlar");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83D\uDCD1 Foydalanish bo'yicha qo'llanma");

        row.add(button);
        row1.add(button1);
        row2.add(button2);
        row3.add(button3);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        markup.setKeyboard(rowList);
        markup.setSelective(true);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(true);

        return markup;
    }


    public ReplyKeyboardMarkup menude(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("⬅\uFE0F Ortga qaytish");

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("✍\uFE0F Bot haqida taklif va shikoyatlarni yuborish");

        row.add(button);
        row1.add(button1);

        rowList.add(row);
        rowList.add(row1);
        markup.setKeyboard(rowList);
        markup.setSelective(true);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(true);
        return markup;
    }
}
