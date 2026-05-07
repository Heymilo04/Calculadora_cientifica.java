import java.util.ArrayList;

public class calculadora {
    private double resultado;
    private ArrayList<String> historial;
    private int operacionesRealizadas;
    
    public calculadora() {
        this.resultado = 0;
        this.historial = new ArrayList<>();
        this.operacionesRealizadas = 0;
    }
    
    //getter
    public double getResultados() {
        return resultado;
    }
    
    public ArrayList<String> getHistorial() {
        return historial;
    }
    
    public int getOperacionesRealizadas() {
        return operacionesRealizadas;
    }
    
    public void sumar(double a, double b) {
        resultado = a + b;
        registrarOperacion(a + " + " + b +  "= " + resultado);
    }
    
    public void restar(double a, double b) {
        resultado = a - b;
        registrarOperacion(a + " - " + b +  "= " + resultado);
    }
    
    public void multiplicar(double a, double b) {
        resultado = a * b;
        registrarOperacion(a + " * " + b +  "= " + resultado);
    }
    
    public void dividir(double a, double b) {
        if (b == 0 ) {
            System.out.println("la division por cero no es posible.");
        }
        
        resultado = a / b;
        registrarOperacion(a + " / " + b +  "= " + resultado);
    }
    
    public void raiz(double a) {
        resultado = Math.sqrt(a);
        registrarOperacion("Raiz de: " + a + "= " + resultado);
    }
    
    public void potencia(double a, double b) {
        resultado = Math.pow(a, b);
        registrarOperacion(a + "^" + b + "= " + resultado);
    }
    
    public void seno(double a) {
        resultado = Math.sin(a);
        registrarOperacion("Seno de: " + a + "= " + resultado);
    }
    
    public void coseno(double a) {
        resultado = Math.cos(a);
        registrarOperacion("Coseno de: " + a + "= " + resultado);
    }
    
    private void registrarOperacion(String operaciones) {
        historial.add(operaciones);
        operacionesRealizadas++;
        
    }
    
    @Override
    public String toString() {
        return "resultados: " + resultado + "\noperaciones realizadas: " + operacionesRealizadas + "\nHistorial: " + historial;
    }
}
