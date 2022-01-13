import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppConfig {

    public ConsoleInterface consoleInterface(ConsoleInterface consoleInterface){
        ConsoleInterface console = new ConsoleInterface();
        console.Start();
        return consoleInterface;
    }


}
