package geometira;

/**
 * Clase para calcular propiedades geométricas de figuras tridimensionales
 */
public class Geometria {
    
    /**
     * Calcula el área superficial de una pirámide de base cuadrada.
     * 
     * @param ladoBase lado de la base cuadrada
     * @param altura altura de la pirámide
     * @return área superficial total
     */
    public double areaPiramide(double ladoBase, double altura) {
        // Área de la base (cuadrado)
        double areaBase = Math.pow(ladoBase, 2);
        
        // Calcular apotema de la pirámide
        double apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(ladoBase/2, 2));
        
        // Área lateral (4 triángulos)
        double areaLateral = 4 * (ladoBase * apotema / 2);
        
        // Área total = base + caras laterales
        return areaBase + areaLateral;
    }
    
    /**
     * Calcula el volumen de una pirámide.
     * 
     * @param ladoBase lado de la base cuadrada
     * @param altura altura de la pirámide
     * @return volumen de la pirámide
     */
    public double volumenPiramide(double ladoBase, double altura) {
        // Área de la base
        double areaBase = Math.pow(ladoBase, 2);
        
        // Volumen = (1/3) * área base * altura
        return (1.0/3.0) * areaBase * altura;
    }
    

    public double areaCono(double radio, double altura) {
        // Área de la base (círculo)
        double areaBase = Math.PI * Math.pow(radio, 2);
        
        // Generatriz (lado inclinado del cono)
        double generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
        
        // Área lateral
        double areaLateral = Math.PI * radio * generatriz;
        
        // Área total = base + área lateral
        return areaBase + areaLateral;
    }
    

    public double volumenCono(double radio, double altura) {
        // Área de la base
        double areaBase = Math.PI * Math.pow(radio, 2);
        
        // Volumen = (1/3) * área base * altura
        return (1.0/3.0) * areaBase * altura;
    }
    
 
}
