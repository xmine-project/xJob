package flxxd.xJob.commands;

import com.google.common.collect.Lists;
import flxxd.xJob.Main;
import flxxd.xJob.helpers.AbstractCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.mrbrikster.chatty.api.ChattyApi;

import java.util.List;

public class Job extends AbstractCommand {
    public Job () {
        super("job");
    }

    @Override
    public void execute (CommandSender sender, String label, String[] args) {
        Player send3r = Bukkit.getPlayer(sender.getName());
        ChattyApi chatty = ChattyApi.get();

        assert send3r != null;

        if (args.length == 0) {
            send3r.sendActionBar(Main.getValue("actionBars.global.noArguments"));
            return;
        }
    }

    public List<String> complete (CommandSender sender, String[] args) {
        return Lists.newArrayList();
    }
}