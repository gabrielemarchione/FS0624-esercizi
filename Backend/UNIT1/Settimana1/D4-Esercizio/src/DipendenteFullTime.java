public class DipendenteFullTime extends Dipendente {
    private double pagaOraria;
    private int oreLavorate;

    public DipendenteFullTime(String matricola, double pagaOraria, int oreLavorate) {
        super(matricola);
        this.oreLavorate = oreLavorate;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public double calculateSalary() {
        setStipendio(this.oreLavorate * this.pagaOraria);
        return getStipendio();
    }

    @Override
    public void checkIn(String str) {
        this.setOraDiInizio(str);
        this.getOraDiInizio();
    }
}