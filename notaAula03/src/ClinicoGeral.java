class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public void receitar() {
        System.out.println("Clínico geral receitando medicamentos.");
    }

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
}