package motivity.structural.proxy;

public class ProxyPatternMain
{
    public static void main(String[] args) {
        CommandExecuter executer = new CommandExecutorProxy("sat] ya","1234");
        try {
            executer.runCommand("ls -ltr");
            executer.runCommand("rm -rf C://Users//Satyanarayana//OneDrive - Motivity Labs//Documents//184029_salslip_0722.pdf");
        } catch (Exception e) {
            System.out.println("Exeption message : "+e.getMessage());
        }
    }
}
