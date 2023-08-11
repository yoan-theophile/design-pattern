package DesignPattern.Proxy;

public class CommandExecutorTest {

	public static void test(){
		CommandExecutor executor = new CommandExecutorProxy("theo", "mot_de_passe_incorrect");
		try {
			executor.runCommand("dir");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Message d'exception ::"+e.getMessage());
		}
		
	}

}