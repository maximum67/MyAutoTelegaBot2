import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.validation.OverridesAttribute;
import java.util.*;


public class MyAutoTelegaBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "MyAutoTelegaBot";
    }

    @Override
    public String getBotToken() {
        BotKey botKeyToken = new BotKey();
        return botKeyToken.getKey();
    }

    @Override
    public void onUpdateReceived(Update update) {
        /* ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setOneTimeKeyboard(false);
        keyboardMarkup.setResizeKeyboard(true);


            KeyboardButton k1 = new KeyboardButton("Привет");
            KeyboardButton k2 = new KeyboardButton("работает");
            KeyboardButton k3 = new KeyboardButton("когда");
            ArrayList<KeyboardRow> kbr = new ArrayList<>();
            KeyboardRow kbr1 = new KeyboardRow();
            KeyboardRow kbr2 = new KeyboardRow();
            KeyboardRow kbr3 = new KeyboardRow();
            kbr1.add(k1) ;
            kbr2.add(k2);
            kbr3.add(k3);
            kbr.add(kbr1);
            kbr.add(kbr2);
            kbr.add(kbr3);

            keyboardMarkup.setKeyboard(kbr);
             if (update.hasMessage() && !update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Создайте объект SendMessage с обязательными полями
            // message.setChatId(update.getMessage().getChatId().toString());
            //message.setText(logicBots.BotResponse(update.getMessage().getText()));
            message.setReplyMarkup(keyboardMarkup);
            try {
                execute(message); // Способ вызова для отправки сообщения
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            kbr.clear();
             } */

        if (update.hasMessage() && update.getMessage().hasText() ) {
            SendMessage message = new SendMessage(); // Создайте объект SendMessage с обязательными полями
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(logicBots.BotResponse(update.getMessage().getText()));

            try {
              execute(message); // Способ вызова для отправки сообщения
            } catch (TelegramApiException e) {
              e.printStackTrace();
            }

             //KeyboardButton kb1 = new KeyboardButton("Вопрос");
             //KeyboardButton kb2 = new KeyboardButton("Ответ");


        }
    }


}
