package exe.lol.SpringAiSandbox;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.DefaultChatClient;
import org.springframework.ai.chat.client.DefaultChatClientBuilder;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAiSandboxApplication {
    static PoetryService pS;

    public SpringAiSandboxApplication(PoetryService pS) {
        SpringAiSandboxApplication.pS = pS;
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringAiSandboxApplication.class, args);
        pS.generate();
        System.out.println(pS.generate());
	}

}
