public class #bfSon#bf extends Father{
    
    private int sonValue;
    
    public Son() {
        super(); // <-- Esta línea es añadida por el compilador. La palabra reservada "super"
                 //     es usada para hacer referencia a alguna característica de
                 //     la clase padre inmediata. En este caso hace referencia al
                 //     consutructor sin argumentos de "Father".
        sonValue = 20;
    }
    
    public int getSonValue() {
        return sonValue;
    }
}
