/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.observer_application;

import java.util.Scanner;

/**
 *
 * @author 64050030 Kitipum Nornua
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reporter reporter = new Reporter();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        reporter.addObserver(sub1);
        reporter.addObserver(sub2);
        Scanner sc = new Scanner(System.in);
        String scoreLine;
        System.out.print("Enter Score: ");
        scoreLine = sc.nextLine();
        while(!scoreLine.equals("")){
            reporter.setScoreLine(scoreLine);
            System.out.print("Enter Score: ");
            scoreLine = sc.nextLine();
        }
        sc.close();
    }
    
}
