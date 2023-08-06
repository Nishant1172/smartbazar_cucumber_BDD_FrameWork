package hooks;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class homeHooks {
    @Before
    public void Intialization(){
        System.out.println("lunching the browser : ");
    }
    @BeforeStep
    public void login(){
        System.out.println("Before execution each the steps file");
    }

    @Before("@systemTest")
    public void b (){
        System.out.println(" before System features file  particular feature file");
    }

    @After("@systemTest")
    public void a(){
        System.out.println("after system features file particular feature file");
    }
    @AfterStep
    public void max(){
        System.out.println("After execution each the steps file");
    }

    @After
    public void sutDown(){
        System.out.println("close the Browser:");
    }
}
