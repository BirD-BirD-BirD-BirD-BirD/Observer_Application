/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.observer_application;

/**
 *
 * @author Admin
 */
public class Subscriber implements MyObserver{

    @Override
    public void update(Source observer) {
        System.out.println("live result: " + ((Reporter)observer).getScoreLine());
    }    
}
