package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatMember;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.chatmember.ChatMember;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyBots extends TelegramLongPollingBot {
    BotButtonService buttonService = new BotButtonService();
    public MyBots (String botToken){
        super(botToken);
    }
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
            String chatId = update.getMessage().getChatId().toString();
            String text = update.getMessage().getText();
            if (text.equals("/start")){
                try {
                    File file = new File("C:\\robiya.txt");
                    FileWriter writer = new FileWriter(file);
                    writer.write(chatId);
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


//                InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
//                List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
//                List<InlineKeyboardButton> row1 = new ArrayList<>();
//                InlineKeyboardButton button1 = new InlineKeyboardButton();
//                button1.setText("Kanalga obuna bo'lish");
//                button1.setUrl("https://t.me/muslihaaat");
//                row1.add(button1);
//                List<InlineKeyboardButton> row2 = new ArrayList<>();
//                InlineKeyboardButton button2 = new InlineKeyboardButton();
//                button2.setText("Tekshirish");
//                button2.setCallbackData("check");
//                row2.add(button2);
//
//                rowList.add(row1);
//                rowList.add(row2);
//
//                markup.setKeyboard(rowList);
//
//                SendMessage message = new SendMessage();
//                message.setText("✅ Botdan to`liq foydalanish uchun PazandaBor kanaliga obuna bo`ling!\n" +
//                        "\n" +
//                        "P.s: Obuna bo`lgandan keyin tekshirish tugmasini bosing.");
//                message.setChatId(chatId);
//                message.setReplyMarkup(markup);
//
//                try {
//                    execute(message);
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }

            } else if (text.equals("⬅\uFE0F Ortga qaytish")) {
                SendMessage message = new SendMessage();
                message.setText("Bosh menyuga xush kelibsiz. Quyidagilardan birini tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(buttonService.mainMenu());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83E\uDD57 Salatlar - 86")) {
                SendMessage message = new SendMessage();
                message.setText("Tanlagan katalogga mos 6 ta retsept topdim:⏬⏬⏬\n" +
                        "\n" +
                        "1. <a href='https://t.me/pazandabor/1974'>Judayam mazali sochniy oson salat</a>\n" +
                        "2.  <a href='https://t.me/pazandabor/1919'>Yogurtli brokoli salat</a>\n" +
                        "3. <a href = 'https://t.me/pazandabor/1908'>Mazali {fantaziya} salati</a>\n" +
                        "4. <a href = 'https://t.me/pazandabor/1850'>Mazzasi qarsildoq baqlajon salati</a>\n" +
                        "5. <a href = 'https://t.me/pazandabor/1783' >Restoran Usulida Baqlajonli Salat</a>\n" +
                        "6. <a href = 'https://t.me/pazandabor/1753' >Funchuza salati</a>\n");
                message.setParseMode(ParseMode.HTML);
                message.setChatId(chatId);
                message.setReplyMarkup(buttonService.menude());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\\uD83C\\uDF72 Suyuq taomlar - 44")) {
                SendMessage message = new SendMessage();
                message.setText("Tanlagan katalogga mos 6 ta retsept topdim:⏬⏬⏬\n" +
                        "\n" +
                        "1. <a href = 'https://t.me/pazandabor/2003'>No`xotlari ezilib chiqadigan Moxora</a>\n" +
                        "2. <a href = 'https://t.me/pazandabor/1957'>Sirni sup </a>\n" +
                        "3. <a href = 'https://t.me/pazandabor/1942>Ko’za sho’rva </a>\n" +
                        "4. <a href = 'https://t.me/pazandabor/1887>Qatiqli ugra taomi </a>\n" +
                        "5. <a href = 'https://t.me/pazandabor/1858'>Uyg`urcha manpar </a>\n" +
                        "6. <a href = 'https://t.me/pazandabor/1764' > Qaymoq tamli akroshka </a>");
                message.setParseMode(ParseMode.HTML);
                message.setChatId(chatId);
                message.setReplyMarkup(buttonService.menude());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\\uD83C\\uDF73 Nonushta - 184")) {
                SendPhoto photo = new SendPhoto();
                photo.setCaption("Omlet");
                photo.setPhoto(new InputFile(new File("C:\\Users\\ACER\\Desktop\\Java R\\e0ef5d81588273f193d58ec8fc4bc4b4.jpg")));
                photo.setChatId(update.getMessage().getChatId());
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Mahsulotlar orqali qidirish")) {
                SendMessage message = new SendMessage();
                message.setText("\uD83E\uDD29 Tabriklaymiz! Siz endi uyingizda bor masalliqlarga mos retseptlarni qidirib topishingiz mumkin!\n" +
                        "\n" +
                        "\uD83D\uDC47 Buning uchun pastdagi tugmalardan õzingizga kerakli bõlimni tanlang.");
                message.setChatId(chatId);
                message.setReplyMarkup(buttonService.menu());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("✍\uFE0F Bot haqida taklif va shikoyatlarni yuborish")) {
                SendMessage message = new SendMessage();
                message.setText("Loyiha haqida o'z fikringizni bildiring fikringiz biz uchun muhim\uD83D\uDE0A");
                message.setChatId(chatId);
                message.setReplyMarkup(buttonService.menude());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("Retseptlar katalogi")) {
                SendMessage message = new SendMessage();
                message.setText("\uD83E\uDD29 Tabriklaymiz! Siz endi uyingizda bor masalliqlarga mos retseptlarni qidirib topishingiz mumkin!\n" +
                        "\n" +
                        "\uD83D\uDC47 Buning uchun pastdagi tugmalardan õzingizga kerakli bõlimni tanlang.");
                message.setChatId(chatId);
                message.setReplyMarkup(buttonService.menu());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDCD1 Foydalanish bo'yicha qo'llanma")) {
                InputFile file = new InputFile(new File("C:\\Users\\ACER\\Desktop\\Java R\\viddeo_2023-07-08_15-58-18.mp4"));
                SendVideo photo = new SendVideo();
                photo.setVideo(file);
                photo.setCaption("\uD83E\uDD17 Foydalanish bo'yicha qo'llanmaga xush kelibsiz!\n" +
                        "\n" +
                        "Videoda ro'yxatdan o'tish va foydalanish to'liq tushuntirib berilgan\n" +
                        "\n" +
                        "✅ Mahsulot orqali qidirish - bu o'zingizda bor maxulotlarni tanlash orqali shu maxsulotlarga mos retseptlarni topasiz. Eng kamida 2 ta maxsulot tanlashingiz mumkin.\n" +
                        "\n" +
                        "✅ Retseptlar katalogi - bu bo'limda retseptlarni maxsulotlarga qarab emas ularni turlari orqali topasiz. Masalan: Salatlar, ovqatlar ichmliklar va h.k\n" +
                        "\n" +
                        "✅ Foodblogerlar - bu bo'limda siz o'zingiz yoqtiradigan foodblogerning retseptlarini topishingiz mumkin.\n" +
                        "\n" +
                        "\uD83D\uDCF1 Bu bot sizga retseptlarni telegramda turib oson topishingizga yordam beradi. Agar qandaydur kamchilik yoki takliflaringiz bo'lsa \"✍\uFE0F Bot haqida taklif va shikoyatlarni yuborish\" tugmasini bosish orqali bizga o'z murojaatlaringizni yuborishingiz mumkin.\n" +
                        "\n" +
                        "\uD83D\uDCF2 Bundan tashqari siz botga kirmasdan turib istalgan chatda retsept qidirishingiz mumkn. Buning uchun siz chatga @retseptizla_bot so'zidan keyin retsept nomini yozishingiz kifoya.\n" +
                        "\n" +
                        "\uD83D\uDCDD Fikrlaringizni biz bilan ulashing.");
                photo.setReplyMarkup(buttonService.menude());
                photo.setChatId(chatId);

                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if (update.hasCallbackQuery()) {
            String data = update.getCallbackQuery().getData();
            if (data.equals("check")){
                GetChatMember member = new GetChatMember();
                member.setChatId("@muslihaaat");
                member.setUserId(update.getCallbackQuery().getMessage().getChatId());
                ChatMember user = null;
                try {
                    user = execute(member);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

                String status = user.getStatus();
                if (status.equals("member") || status.equals("creator") || status.equals("administrator")){
                    SendMessage message = new SendMessage();
                    message.setText("Bosh menyuga hush kelibsiz. Quyidagi menyulardan birini tanlang");
                    message.setChatId(update.getCallbackQuery().getMessage().getChatId());
                    message.setReplyMarkup(buttonService.mainMenu());
                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    SendMessage message = new SendMessage();
                    message.setText("Obuna bo'lmagansiz");
                    message.setChatId(update.getCallbackQuery().getMessage().getChatId());
                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "https://t.me/retsept_izla8_bot";
    }
}
