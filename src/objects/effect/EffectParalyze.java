package objects.effect;

import java.util.Random;

import objects.mob.Mob;

public class EffectParalyze extends EffectOther {
	public EffectParalyze() { super("PAR"); maxDuration=10; }

	@Override
	public String name() { return "Paralyze"; }

	@Override
	public void start(Mob m) { 
		this.duration=this.maxDuration; 
		this.affected=m; 
		m.setEffect(this); 
		m.getLog().appendMessage(m+" is paralyzed!");
	}

	@Override
	public boolean apply() {
		if(duration>0) {
			duration--;
			if((new Random()).nextInt(2)==0) {
				affected.getLog().appendMessage(affected+" is paralyzed!");
				return false;
			}
		} else {
			affected.getLog().appendMessage(affected+" is cured from paralysis!");
			affected.setEffect(new EffectNormal());
		}
		return true;
	}
}
