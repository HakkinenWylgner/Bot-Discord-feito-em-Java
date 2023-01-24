package events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class InteractionEventListener extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);
        System.out.println("Interaction!");

//        event.reply("Hello there!").setEphemeral(true).queue();
//        System.out.println(event.getName());

        switch (event.getName()) {
            case "flash-cards":
                event.reply("aqui estão seus flashcards").setEphemeral(true).queue();
                break;
            case "quiz":
                event.reply("Quiz Comando").setEphemeral(true).queue();
                break;
            case "slash-cmd":
                event.reply("Comando de barra").setEphemeral(true).queue();
                break;
        }
    }
}
