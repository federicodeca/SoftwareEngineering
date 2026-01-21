public interface StratoShipAbstractFactory {
    SkyShip createAttack(String name, int hp);
    SpaceShip createDefense(String name, int hp);
}