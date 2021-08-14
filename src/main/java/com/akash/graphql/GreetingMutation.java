package com.akash.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingMutation implements GraphQLMutationResolver {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting newGreeting(String message, String name) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);
        greeting.setName(name);

        return greetingRepository.save(greeting);
    }
}
