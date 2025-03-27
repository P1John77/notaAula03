class Cavalo extends Animal {
    private String raca;

    public void fugir() {
        System.out.println("O cavalo está fugindo.");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}