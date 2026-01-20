public class Fighter extends SkyShip {
    public Fighter() {
        this.name = "Caccia Stellare";
        this.hp = 100;
        loadActions();
    }

    @Override
    public void loadActions() {
        this.actions.add(new PointAttack()); // Mossa specifica
    }
}