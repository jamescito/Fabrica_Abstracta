package org.james;

public class OpelAstracFactory implements CocheFactory{

    @Override
    public Motor crearMotor() {
        // TODO Auto-generated method stub
        return new AstraMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
        // TODO Auto-generated method stub
        return new AstraCarroceria();
    }
    
}
