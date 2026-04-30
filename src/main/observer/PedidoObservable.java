package observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoObservable implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers(String mensagem) {
        for (Observer observer : observers) {
            observer.atualizar(mensagem);
        }
    }

    public void alterarStatus(String status) {
        notificarObservers("Status do pedido: " + status);
    }
}