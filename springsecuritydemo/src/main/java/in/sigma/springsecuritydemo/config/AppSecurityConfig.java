package in.sigma.springsecuritydemo.config;

import in.sigma.springsecuritydemo.service.CustomerService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

    @Autowired
    private CustomerService customerService;

    @Bean
    public BCryptPasswordEncoder pwdEncoder(){
        return new BCryptPasswordEncoder();

    }

    @Bean
    public DaoAuthenticationProvider authProvider(){
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(customerService);
        authProvider.setPasswordEncoder(pwdEncoder());
//        authProvider.setUserDetailsService(customerService);
        return authProvider;
    }

    @Bean
    @SneakyThrows
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config){
        return config.getAuthenticationManager();

    }

    @Bean
    public SecurityFilterChain security(HttpSecurity http) throws Exception{
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests((req)->{
                    req.requestMatchers("/register","/login")
                    .permitAll()
                    .anyRequest()
                    .authenticated();
        });
        return http.build();
    }
}