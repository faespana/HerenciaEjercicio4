package figurasgeometricasapp.entities;

import figurasgeometricasapp.interfaces.CalculosFormas;

public final class FigurasGeometricas implements CalculosFormas{
    
    

    @Override
    public double calcularArea() {
        System.out.println(PI);
        return 0.986;
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    
}
