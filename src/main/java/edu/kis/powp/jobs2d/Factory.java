package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

public final class Factory {
    private Factory(){}

    public static DriverCommand makeRectangle(int startX, int startY, int width, int height) {
        ComplexCommand commands = new ComplexCommand();
        commands.add(new SetPositionCommand(startX, startY));
        commands.add(new OperateToCommand(startX + width, startY));
        commands.add(new OperateToCommand(startX + width, startY + height));
        commands.add(new OperateToCommand(startX, startY + height));
        commands.add(new OperateToCommand(startX, startY));
        return commands;
    }

    public static DriverCommand makeTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        ComplexCommand commands = new ComplexCommand();
        commands.add(new SetPositionCommand(x1, y1));
        commands.add(new OperateToCommand(x2, y2));
        commands.add(new OperateToCommand(x3, y3));
        commands.add(new OperateToCommand(x1, y1));
        return commands;
    }
}
