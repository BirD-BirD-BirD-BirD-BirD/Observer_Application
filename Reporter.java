/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.observer_application;

/**
 *
 * @author 64050030 Kitipum Nornua
 */
public class Reporter extends Source{
    String scoreLine;
    public void setScoreLine(String scorestr){
        scoreLine = scorestr;
        notifyObservers();
    }
    public String getScoreLine(){
        return scoreLine;
    }
}
