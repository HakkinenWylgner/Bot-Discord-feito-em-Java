import events.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;


import javax.security.auth.login.LoginException;
public class DiscordBot {
    public static void main(String[] args) throws LoginException {
        final String TOKEN = "MEU TOKEN";

    // JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN); outro token
        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);

        //jdaBuilder.enableIntents(GatewayIntent.MESSAGE_CONTENT); Forma fácil de importa o GatewayIntent
        JDA jda = jdaBuilder
                .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new ReadyEventListener(), new MenssagerEventListener(), new InteractionEventListener())
                .build();
        // Abaixo temos onde é especificado os comandos e suas funcionalidades.
        jda.upsertCommand("slash-cmd", "This is a slash command").setGuildOnly(true).queue();
        jda.upsertCommand("flash-cards", "Lists all flash cards").setGuildOnly(true).queue();
        jda.upsertCommand("quiz","Gives you a random quiz"). setGuildOnly(false).queue();
    }
}
