/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

/**
 *
 * @author carlosmamut1
 */
public class FooterDecorator extends BaseDecorator {

    public FooterDecorator(ReportContent wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        addFooter();
        wrappee.execute();
    }

    private void addFooter() {
        System.out.println("Adding footer section...");
    }
}

