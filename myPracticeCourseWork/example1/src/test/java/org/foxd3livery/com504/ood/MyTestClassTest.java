/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foxd3livery.com504.ood;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author João
 */
public class MyTestClassTest {
    
    
    @Test
    public void shouldAnswerWithTrue()
    {
        MyTestClassLog4j myTest = new MyTestClassLog4j();
        myTest.writeAboutMe();
    }
    
    @Test
    public void shouldAnswerWithName()
    {
        MyTestClassLog4j myTest = new MyTestClassLog4j();
       String result=  myTest.talkAboutMe("Joao");
       System.out.print(result);
       
       assertTrue("talking about Joao".equals(result));
    }
    
    
    
}
