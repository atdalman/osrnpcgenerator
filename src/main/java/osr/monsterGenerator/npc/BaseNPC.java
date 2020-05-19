package osr.monsterGenerator.npc;

import org.springframework.beans.factory.annotation.Autowired;
import osr.monsterGenerator.npc.npcAttributes.*;
import osr.monsterGenerator.service.AttributeService;

import java.util.List;

// A basic monster or NPC
public class BaseNPC {

    @Autowired
    private AttributeService attributeService;

    // Perhaps tied to body shape or distinct features?  For example, a reptilian creature could use a latin name
    // from that part of the animal kingdom
    private String name;
    private String properName;
    // Generic flat health points, if desired
    private String healthPoints;
    private Size size;
    private int experienceGiven;
    private BodyShape generalBodyShape;
    private BodySurface bodySurface;
    private Movement movement;
    private DistinctiveFeature distinctiveFeature;
    private PhysicalAttack[] physicalAttacks;
    private String[] specialAbilities;
    private String combatStrategyPrimary;
    private String combatStrategySecondary;
    private List<Motivation> motivations;

    //

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperName() {
        return properName;
    }

    public void setProperName(String properName) {
        this.properName = properName;
    }

    public String getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(String healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getExperienceGiven() {
        return experienceGiven;
    }

    public void setExperienceGiven(int experienceGiven) {
        this.experienceGiven = experienceGiven;
    }

    public void setGeneralBodyShape(BodyShape generalBodyShape) {
        this.generalBodyShape = generalBodyShape;
    }

    public BodyShape getGeneralBodyShape() {
        return generalBodyShape;
    }

    public BodySurface getBodySurface() {
        return bodySurface;
    }

    public void setBodySurface(BodySurface bodySurface) {
        this.bodySurface = bodySurface;
    }

    public DistinctiveFeature getDistinctiveFeature() {
        return distinctiveFeature;
    }

    public void setDistinctiveFeature(DistinctiveFeature distinctiveFeature) {
        this.distinctiveFeature = distinctiveFeature;
    }

    public PhysicalAttack[] getPhysicalAttacks() {
        return physicalAttacks;
    }

    public void setPhysicalAttacks(PhysicalAttack[] physicalAttacks) {
        this.physicalAttacks = physicalAttacks;
    }

    public String[] getSpecialAbilities() {
        return specialAbilities;
    }

    public void setSpecialAbilities(String[] specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    public String getCombatStrategyPrimary() {
        return combatStrategyPrimary;
    }

    public void setCombatStrategyPrimary(String combatStrategyPrimary) {
        this.combatStrategyPrimary = combatStrategyPrimary;
    }

    public String getCombatStrategySecondary() {
        return combatStrategySecondary;
    }

    public void setCombatStrategySecondary(String combatStrategySecondary) {
        this.combatStrategySecondary = combatStrategySecondary;
    }

    public List<Motivation> getMotivations() {
        return motivations;
    }

    public void setMotivations(List<Motivation> motivations) {
        this.motivations = motivations;
    }

    @Override
    public String toString() {
        return "Size: " + size.getName() + "\n" +
                "General Body Shape: " + generalBodyShape.getName() + "\n" +
                "Body Texture: " + bodySurface.getName() + "\n" +
                "Movement Style: " + movement.getMovementStyle() + "\n" +
                "Speed: " + movement.getMovementSpeed() + "\n" +
                "Limbs: " + movement.getNumLimbs();
    }
}
