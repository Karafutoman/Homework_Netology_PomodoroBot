package bot.command;

import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;

public class StartCommand extends ServiceCommand {
   public static boolean isStart = false;

    public StartCommand(String commandIdentifier, String description) {
        super(commandIdentifier, description);
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] strings) {
        //обращаемся к методу суперкласса для отправки пользователю ответа
        sendAnswer(absSender, chat.getId(),
                "Пожалуйста, введите количество дел или '/help' для вызова помощи");
        isStart = true;
    }
}
