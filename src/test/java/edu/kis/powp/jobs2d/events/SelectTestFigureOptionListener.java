package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import edu.kis.powp.jobs2d.Factory;
import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
    private int numberOfTestFigure = 0;

    private List<Runnable> figures = List.of(
            () -> {FiguresJoe.figureScript1(driverManager.getCurrentDriver());},
            () -> {FiguresJoe.figureScript2(driverManager.getCurrentDriver());},
            () -> {Factory.makeRectangle(2, 2, 10, 10).execute(driverManager.getCurrentDriver());},
            () -> {Factory.makeTriangle(0, 0, 20, 0, 20, 20).execute(driverManager.getCurrentDriver());}
    );

    public SelectTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public SelectTestFigureOptionListener(DriverManager driverManager, int numberOfTestFigure) {
        this(driverManager);
        this.numberOfTestFigure = numberOfTestFigure;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        figures.get(numberOfTestFigure).run();
    }
}
