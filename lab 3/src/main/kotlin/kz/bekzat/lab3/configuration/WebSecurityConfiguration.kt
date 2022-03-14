package kz.bekzat.lab3.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler

@Configuration
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {
    @Autowired
    private val loginSuccessHandler: LoginSuccessHandler? = null

    @Autowired
    private val restAuthenticationEntryPoint: RestAuthenticationEntryPoint? = null

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
            .authorizeRequests().antMatchers("/api/**").authenticated()
            .and()
            .httpBasic()
            .and()
            .exceptionHandling()
            .authenticationEntryPoint(restAuthenticationEntryPoint)
            .and()
            .formLogin()
            .loginProcessingUrl("/api/login")
            .successHandler(loginSuccessHandler)
            .failureHandler(SimpleUrlAuthenticationFailureHandler())
        http.cors().and().csrf().disable()
        //        http.csrf().ignoringAntMatchers("/api/login").csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
    }

    @Bean
    public override fun userDetailsService(): UserDetailsService {
        val password = "123456"
        val username = "bekzat"
        val manager = InMemoryUserDetailsManager()
        val encodedPassword = passwordEncoder().encode(password)
        manager.createUser(User.withUsername(username).password(encodedPassword).roles("USER").build())
        return manager
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }
}
