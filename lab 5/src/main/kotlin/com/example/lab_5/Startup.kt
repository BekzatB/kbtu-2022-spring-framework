package com.example.lab_5

import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.boot.CommandLineRunner
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import java.util.*

@Component
class Startup(private val applicationContext: ApplicationContext) :
    CommandLineRunner {
    @Throws(Exception::class)
    override fun run(vararg args: String) {
        val beanDefinitionRegistry = applicationContext as BeanDefinitionRegistry
        val beans = applicationContext.getBeanDefinitionNames()
        Arrays.sort(beans)
        for (bean in beans) {
            println("Bean name: $bean")
            val beanDefinition = beanDefinitionRegistry.getBeanDefinition(bean)
            if (beanDefinition.beanClassName != null) {
                if (beanDefinition.beanClassName!!.startsWith("com.welltestedlearning")) {
                    println(" --> Class name: " + beanDefinition.beanClassName + ", scope: " + beanDefinition.scope)
                }
            }
        }
    }
}
