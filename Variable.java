import java.util.ArrayList;

public class Variable {
    
    public static ArrayList<Variable> listesVariables = new ArrayList<Variable>();

    public String id;

    public String type;

    public String contexte;

    public Variable(String type, String id, String contexte) {
        this.type = type;
        this.id = id;
        this.contexte = contexte;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContexte() {
        return this.contexte;
    }

    public void setContexte(String contexte) {
        this.contexte = contexte;
    }

}