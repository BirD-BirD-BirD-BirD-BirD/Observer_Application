/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.observer_application;

import java.util.ArrayList;

/**
 *
 * @author 64050030 Kitipum Nornua
 */
public class Source {
    ArrayList<MyObserver> observers;
    public Source(){
        observers = new ArrayList<>();
    }
    
    public void addObserver(MyObserver obj){
        observers.add(obj);
    }
    
    public void notifyObservers(){
        for(MyObserver observer: observers){
            observer.update(this);
        }
    }
}
