package motivity.structural.proxy;

public class CommandExecutorProxy implements CommandExecuter{

    private boolean isAdmin;
    private CommandExecuter executer;

    public CommandExecutorProxy(String user,String pwd)
    {
        if("satya".equals(user)&& "1234".equals(pwd))
        {
            isAdmin = true;
            executer = new CommandExecutorImpl();
        }
    }
    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin)
        {
            executer.runCommand(cmd);
        }
        else {
            if(cmd.trim().startsWith("rm"))
            {
                throw new Exception("rm command is not allowed for non admin user .");
            }else {
                executer.runCommand(cmd);
            }
        }

    }
}
