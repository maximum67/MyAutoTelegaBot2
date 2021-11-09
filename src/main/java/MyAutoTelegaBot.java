import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.validation.OverridesAttribute;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


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
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Создайте объект SendMessage с обязательными полями
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(logicBots.BotResponse(update.getMessage().getText()));

            try {
                execute(message); // Способ вызова для отправки сообщения
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            KeyboardButton kb1 = new KeyboardButton("Вопрос");
            KeyboardButton kb2 = new KeyboardButton("Ответ");
            List <KeyboardRow> kb = new List<KeyboardRow>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<KeyboardRow> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(KeyboardRow keyboardButtons) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends KeyboardRow> c) {
                    return false;
                }

                @Override
                public boolean addAll(int index, Collection<? extends KeyboardRow> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }

                @Override
                public KeyboardRow get(int index) {
                    return null;
                }

                @Override
                public KeyboardRow set(int index, KeyboardRow element) {
                    return null;
                }

                @Override
                public void add(int index, KeyboardRow element) {

                }

                @Override
                public KeyboardRow remove(int index) {
                    return null;
                }

                @Override
                public int indexOf(Object o) {
                    return 0;
                }

                @Override
                public int lastIndexOf(Object o) {
                    return 0;
                }

                @Override
                public ListIterator<KeyboardRow> listIterator() {
                    return null;
                }

                @Override
                public ListIterator<KeyboardRow> listIterator(int index) {
                    return null;
                }

                @Override
                public List<KeyboardRow> subList(int fromIndex, int toIndex) {
                    return null;
                }
            };
            //kb[0] = kb1;
            //kb[1] = kb2;

            ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
            //keyboardMarkup.setKeyboard(kb);

        }
    }


}
