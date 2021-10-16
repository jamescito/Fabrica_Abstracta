package org.james;

public class FordFocusFactory implements CocheFactory{

    @Override
    public Motor crearMotor() {
        // TODO Auto-generated method stub
        return new FocusMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
        // TODO Auto-generated method stub
        return new FocusCarroceria();
    }

}