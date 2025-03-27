class Cirurgiao extends Medico {
    @Override
    public void tratarPaciente() {
        System.out.println("Cirurgião realizando tratamento especializado.");
    }

    public void fazerIncisao() {
        System.out.println("Cirurgião fazendo incisão cirúrgica.");
    }
}