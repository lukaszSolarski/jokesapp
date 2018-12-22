package com.solar.springframework5.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {

    /*
    ChuckNorrisQuotes was declared as Bean, because the ChuckNorrisQuotes comes from external library.
    It's good convention to act this way, because using external library you don't control the source code
    and you can utilize it to use in your all application.
     */
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
