/*
 * Copyright (c) 2014 Austin Reuland <amreuland@gmail.com>.
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

/**
 * The Simple RoboLibBot Class.
 * This is a more simple version of the RoboLibBot class, it has pre-defined
 * functions instead of classes, making it easier to understand.
 * 
 * @author Austin Reuland <amreuland@gmail.com>
 */
public class SimpleRobot extends RoboLibBot {
    
    public SimpleRobot(){
        this("Default", "1.0.0");
    }

    /**
     * Create a Simple RoboLibBot
     * @param name
     */
    public SimpleRobot(String name){
        this(name, "1.0.0");
    }
    
    /**
     * Create a Simple RoboLibBot
     * @param name
     * @param version 
     */
    public SimpleRobot(String name, String version){
        super(name, version);
        new DisabledMode(){
            public void init(){ disabledInit(); }
            public void run(){ disabledPeriodic(); }
            public void end(){ disabledEnd(); }  
        };
        
        new TestMode(){
            public void init(){ testInit(); }
            public void run(){ testPeriodic(); }
            public void end(){ testEnd(); }  
        };
        
        new AutonMode(){
            public void init(){ autonomousInit(); }
            public void run(){ autonomousPeriodic(); }
            public void end(){ autonomousEnd(); }  
        };
        
        new TeleopMode(){
            public void init(){ teleopInit(); }
            public void run(){ teleopPeriodic(); }
            public void end(){ teleopEnd(); }  
        };
    }
    
    
    public void robotInit(){
        debug("Default SimpleRobot.robotInit() method... Overload me!");
    }

    public void disabledInit(){
        debug("Default SimpleRobot.disabledInit() method... Overload me!");
    }

    public void testInit(){
        debug("Default SimpleRobot.testInit() method... Overload me!");
    }
    
    public void autonomousInit(){
        debug("Default SimpleRobot.autonomousInit() method... Overload me!");
    }

    public void teleopInit(){
        debug("Default SimpleRobot.teleopInit() method... Overload me!");
    }

    
    boolean dpFirstRun = true;
    public void disabledPeriodic(){
        if(dpFirstRun){
            debug("Default SimpleRobot.disabledPeriodic() method... Overload me!");
            dpFirstRun = false;
        }
    }

    boolean tpmFirstRun = true;
    public void testPeriodic(){
        if(tpmFirstRun){
            debug("Default SimpleRobot.testPeriodic() method... Overload me!");
            tpmFirstRun = false;
        }
    }

    boolean apFirstRun = true;
    public void autonomousPeriodic(){
        if(apFirstRun){
            debug("Default SimpleRobot.autonomousPeriodic() method... Overload me!");
            apFirstRun = false;
        }
    }

    boolean tpFirstRun = true;
    public void teleopPeriodic(){
        if(tpFirstRun){
            debug("Default SimpleRobot.teleopPeriodic() method... Overload me!");
            tpFirstRun = false;
        }
    }
    
    public void disabledEnd(){
        debug("Default SimpleRobot.disableEnd() method... Overload me!");
    }
    
    public void testEnd(){
        debug("Default SimpleRobot.testEnd() method... Overload me!");
    }
    
    public void autonomousEnd(){
        debug("Default SimpleRobot.autonomousEnd() method... Overload me!");
    }
    
    public void teleopEnd(){
        debug("Default SimpleRobot.teleopEnd() method... Overload me!");
    }

}
