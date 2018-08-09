package Player.Mage;

import Player.Interfaces.IDefend;
import Player.Interfaces.ISpell;
import Player.Player;

public abstract class Mage extends Player {
    private ISpell spell;
    private IDefend defend;

    public Mage(String name) {
        super(name);
        this.spell = null;
        this.defend = null;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public IDefend getDefend() {
        return defend;
    }

    public void setDefend(IDefend defend) {
        this.defend = defend;
    }

    public int defendWithDefender(){
        return this.defend.defend();
    }

    public String castSpell(){
        return this.spell.cast();
    }
}
