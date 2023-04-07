package motivity.structural.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecuter
{

    @Override
    public void runCommand(String cmd) throws IOException {
        Runtime.getRuntime().exec(cmd);
        System.out.println("cmd command excecuted...........");

    }
}
