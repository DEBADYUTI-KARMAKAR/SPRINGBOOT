package in.sigma.springsecurityexample.config;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
//    @SneakyThrows
    public SecurityFilterChain security(HttpSecurity http) throws  Exception{
        http.authorizeHttpRequests((req) -> {
            req.requestMatchers("/log")
                    .permitAll()
                    .anyRequest()
                    .authenticated();
        }).httpBasic(Customizer.withDefaults());
//        http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> auth
//                .requestMatchers("/log").permitAll().anyRequest().authenticated()).httpBasic(Customizer.withDefaults());

        return http.build();

    }
}
//@Bean
//public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//    http.csrf(csrf -> csrf.disable())
//            .authorizeHttpRequests(auth -> auth
//                    .requestMatchers("/api/transactions/**").permitAll()
////                        .requestMatchers("/auth/**").permitAll()
//                    .anyRequest().authenticated());
//
//    return http.build();
//}