public class Cell
{
  private Terrain terrain;
  private Entity entity;

  public Cell(Terrain _T, Entity _E)
  {
    this.terrain = _T;
    this.entity = _E;
  }

  /*OnLeftClick
  OnRightClick*/

  public void setEntity(Entity _E)
  {
    this.entity = _E;
  }
  public Entity getEntity()
  {
    return this.entity;
  }

  public Terrain getTerrain()
  {
    return this.terrain;
  }
}

class Terrain
{
  private int variant;
  private int type;

  public Terrain(int _V, int _T)
  {
    this.variant = _V;
    this.type = _T;
  }

  public int getVariant()
  {
    return this.variant;
  }
  public int getType()
  {
    return this.type;
  }
}

class Entity
{
  private int health;
  private int armour;

  public Entity(int _H, int _A)
  {
    this.health = _H;
    this.armour = _A;
  }

  public void dealDamage(int damageDealt, boolean piercing)
  {
    int damageToArmour = min(damageDealt, Armour);
    int damageToHealth = damageDealt - damageToArmour;

    this.armour = this.armour - damageToArmour;

    if (damageToArmour == 0 || piercing)
    {
      this.health = this.health - damageToHealth;
    }

    if (this.health == 0)
    {
      //Kill
    }
  }
}

class Zombie extends Entity
{
  private int type;
}
