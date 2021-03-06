package objects.effect;

import objects.mob.Mob;

public class EffectPoison extends EffectOther {
	public EffectPoison() { super("PSN"); maxDuration=25; }
	
	@Override
	public String name() { return "Poison"; }
	
	@Override
	public void start(Mob m) { 
		this.duration=this.maxDuration; 
		this.affected=m; 
		m.setEffect(this); 
		m.getLog().appendMessage(m+" is poisoned!");
	}
	
	@Override
	public boolean apply() {
		if(duration>0) {
			affected.hp-=1;
			affected.getLog().appendMessage(affected+" suffer from poison!");
			if(affected.hp<=0) {
				affected.murder();
				return false;
			}
			duration--;
		} else {
			affected.getLog().appendMessage(affected+" is cured from poison!");
			affected.setEffect(new EffectNormal());
		}
		return true;
	}
}
