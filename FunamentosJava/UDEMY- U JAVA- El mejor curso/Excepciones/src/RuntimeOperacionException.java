public class RuntimeOperacionException  extends RuntimeException{
    //Exception: el compilador nos obliga a  procesar la exepcion ya que se
    // consideran de tipo check exception
    //RuntimeException: el compilador no nos obliga a procesar la excepcion

    //Al manejar Exception tenemos que enviar el mensaje a al clase padre
    public RuntimeOperacionException(String mensaje){
        super(mensaje);
    }
}
