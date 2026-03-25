package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int x;
    private int y;

    public OperateToCommand(Job2dDriver driver, int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver d) {
        d.operateTo(x, y);
    }
}
