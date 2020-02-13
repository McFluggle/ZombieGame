public class Cell
{
  private Terrain terrain;
  private Entity entity;

  public Cell(Terrain _T, Entity _E)
  {
    terrain = _T;
    entity = _E;
  }

  /*OnLeftClick
  OnRightClick*/

  //SetEntity
  //GetEntity

  //GetTerrian
}

class Terrain
{
  private int variant;
  private int type;

  public Terrain(int _V, int _T)
  {
    variant = _V;
    type = _T;
  }

  //GetTerrian
  //GetVariant
}

class Entity
{
  private int health;
  private int armour;
}

class Zombie extends Entity
{
  private int type;
}

//Hello!!
