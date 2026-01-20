import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "strato_ships")
public abstract class StratoShip implements Action {
	@Id
	@Column(name = "name", nullable = false, length = 150)
	private String name;

	@Column(name = "hp", nullable = false)
	private int hp;

    protected List<Action> actions = new ArrayList<>();

    public abstract void loadActions();

	protected StratoShip() {
		// JPA only
	}

	protected StratoShip(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	@Override
	public abstract void doAction(Position target);
}
