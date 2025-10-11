/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

/**
 *
 * @author carlosmamut1
 */
public class HeaderDecorator extends BaseDecorator {

    public HeaderDecorator(ReportContent wrappee) {
        super(wrappee);
    }



    private void addHeader() {
        System.out.println("Adding header section...");
    }

    @Override
    public void execute() {
        addHeader();
        wrappee.execute();
    }
}

