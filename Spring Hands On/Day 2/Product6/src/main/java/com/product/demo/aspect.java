package com.product.demo;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
@EnableAspectJAutoProxy
@Component
@Aspect
public class aspect {



	@Before("execution(* com.product.demo.ShoppingCart.addItem(..))")
    public void beforeAddItem(JoinPoint joinPoint) {
        System.out.println("Before adding item to the shopping cart");
        System.out.println("@Before(\"execution(* com.product.demo.ShoppingCart.addItem(..))\")");
    }

    @After("execution(* com.product.demo.ShoppingCart.addItem(..))")
    public void afterAddItem(JoinPoint joinPoint) {
        System.out.println("After adding item to the shopping cart");
        System.out.println("@After(\"execution(* com.product.demo.ShoppingCart.addItem(..))\")");
    }

    @AfterReturning(pointcut = "execution(* com.product.demo.ShoppingCart.removeItemById(..))", returning = "result")
    public void afterRemoveItemById(JoinPoint joinPoint, Object result) {
        String productId = (String) joinPoint.getArgs()[0];
        System.out.println("After removing item with ID " + productId + " from the shopping cart");
        System.out.println(" @AfterReturning(pointcut = \"execution(* com.product.demo.ShoppingCart.removeItemById(..))\"");
    }

    @Around("execution(* com.product.demo.ShoppingCart.updateItemById(..))")
    public void aroundUpdateItemById(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String productId = (String) proceedingJoinPoint.getArgs()[0];
        System.out.println("Before updating item with ID " + productId + " in the shopping cart");
        proceedingJoinPoint.proceed(); // Execute the original method
        System.out.println("After updating item with ID " + productId + " in the shopping cart");
        System.out.println(" @Around(\"execution(* com.product.demo.ShoppingCart.updateItemById(..))\")");
    }

    @AfterThrowing(pointcut = "execution(* com.product.demo.ShoppingCart.*(..))", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Throwable exception) {
        System.out.println("Exception occurred in method: " + joinPoint.getSignature().getName());
        System.out.println("Exception message: " + exception.getMessage());
        System.out.println("@AfterThrowing(pointcut = \"execution(* com.product.demo.ShoppingCart.*(..))\"");;
    }

}
