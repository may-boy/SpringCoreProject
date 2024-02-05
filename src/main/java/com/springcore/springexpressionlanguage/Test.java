package com.springcore.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springexpressionlanguage/spelconfig.xml");
        Demo demo = context.getBean("demo",Demo.class);

        //By default the value for int would be 0.
        System.out.println(demo);

        //This can be used to provide the expression.
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression expression = temp.parseExpression("22+33");

        System.out.println("Value: " + expression.getValue());
    }

}
