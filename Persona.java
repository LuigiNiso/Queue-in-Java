public class Persona {
    private String codice;
    private String nome;
    private String cognome;
    
    public Persona(String codice, String nome, String cognome) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
    }
    public String getCodice() {
        return codice;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Persona [codice=" + codice + ", cognome=" + cognome + ", nome=" + nome + "]";
    }
}
