/*
 * Copyright (c) 2014 Westwood Robotics <code.westwoodrobotics@gmail.com>.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package org.wwr.robolib.robot;

import edu.wpi.first.wpilibj.communication.FRCControl;

/**
 *
 * @author Austin Reuland <amreuland@gmail.com>
 */
public abstract class AutonMode extends RobotMode {

    protected AutonMode() {
        super(ModeSwitcher.GameMode.kAuton);
    }
    
    /**
     * {@inheritDoc}
     */
    protected final void modeRun(){
        FRCControl.observeUserProgramAutonomous();
        run();
    }
}