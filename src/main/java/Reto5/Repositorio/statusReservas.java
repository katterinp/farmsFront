package Reto5.Repositorio;

/**
 *
 * @author Katterin Penaranda
 */
public class statusReservas {
    
    private int completed;
    
    private int cancelled;

    public statusReservas(int completed, int cancelled) {
        this.completed = completed;
        this.cancelled = cancelled;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getCancelled() {
        return cancelled;
    }

    public void setCancelled(int cancelled) {
        this.cancelled = cancelled;
    }
    
}
