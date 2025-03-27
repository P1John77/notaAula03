class Leao extends Animal {
    private boolean juba;

    public void cacar() {
        System.out.println("O leão está caçando.");
    }

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }
}