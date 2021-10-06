package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/27/19.
 */
@Controller
public class I18nController {

    private final GreetingService greetingService;

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService, EnglishGreetingRepository englishGreetingRepository) {
        this.greetingService = greetingService;
        this.englishGreetingRepository=englishGreetingRepository;
    }

    public String sayHello(){
        return englishGreetingRepository.getGreeting();
    }
}
