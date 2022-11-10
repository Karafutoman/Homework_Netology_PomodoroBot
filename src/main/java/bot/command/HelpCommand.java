package bot.command;

import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;

public class HelpCommand extends ServiceCommand {
    public HelpCommand(String commandIdentifier, String description) {
        super(commandIdentifier, description);
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] strings) {
        //обращаемся к методу суперкласса для отправки пользователю ответа
        sendAnswer(absSender, chat.getId(),
                "Привет! Я тайм-менеджер Pomodoro!\n" +
                        "Я помогу тебе сосредоточиться на решении важных проблем\n" +
                        "Тебе нужно задать количество задач, а я буду тебе сообщать когда работать, а когда отдыхать!\n" +
                        "Начни командой '/start'!");
    }
}
