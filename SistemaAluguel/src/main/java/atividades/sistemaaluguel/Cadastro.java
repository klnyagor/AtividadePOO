package atividades.sistemaaluguel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yagor
 */
public class Cadastro <T>{
    private List<T> elementos;

    public Cadastro() {
        this.elementos = new ArrayList<>();
    }
    public void add(T novo){
        elementos.add(novo);
    }
    
    public T get(int pos){
        return this.elementos.get(pos);
    }
    public List<T> getElementos() {
        return elementos;
    }

    public void setElementos(List<T> elementos) {
        this.elementos = elementos;
    }

    public void mostrar(){
        for (T t: elementos){
            System.out.println(t);
        }
    }
}
