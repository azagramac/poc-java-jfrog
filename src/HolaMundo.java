package blog.azagra.dev.holamundo;

import blog.azagra.dev.mensajes.Mensaje;
import blog.azagra.dev.despedida.Despedida;

public class HolaMundo {
    public String saludar() {
        return Mensaje.saludar();
    }

    public String despedirse() {
        return Despedida.saludar();
    }

    public static void main(String[] args) {
        HolaMundo hm = new HolaMundo();
        System.out.println(hm.saludar());
        System.out.println(hm.despedirse());
    }
}
