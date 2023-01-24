package events;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;
public class MenssagerEventListener extends ListenerAdapter {

    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        super.onMessageReceived(event);

        System.out.println("Mensagem do (úsuario):" + event.getMessage().getContentDisplay());
    }

}
