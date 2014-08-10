package xyz.luan.sabv.entities;

import java.util.List;
import java.util.Map;

import xyz.luan.sabv.customs.PalindromeString;
import xyz.luan.sabv.validations.Array;
import xyz.luan.sabv.validations.Numeric.Max;
import xyz.luan.sabv.validations.Numeric.Min;
import xyz.luan.sabv.validations.Required;

public class God {

    private String name;

    @Required
    @Array(minLength = 2)
    private Power @Required [] powers;

    @Required
    @Array(maxLength = 2)
    private List<@Required Weakness> weaknesses;

    @Required
    @Array.Fixed(3)
    private float @Array.Fixed(4) [] @Min(3.5) @Max(4) [] calculationMatrix;

    private @Array(minLength = 1) Map<@PalindromeString @Required String, @Required @Array(minLength = 1) List<@Required @Array.Fixed(3) float @Array.Fixed(4) [] @Min(3.5) @Max(4) []>> secondaryMatrixesByName;

    public God(String name, Power[] powers, List<Weakness> weaknesses, float[][] calculationMatrix, Map<String, List<float[][]>> secondaryMatrixesByName) {
        this.name = name;
        this.powers = powers;
        this.weaknesses = weaknesses;
        this.calculationMatrix = calculationMatrix;
        this.secondaryMatrixesByName = secondaryMatrixesByName;
    }

    public String getName() {
        return name;
    }

    public Power[] getPowers() {
        return powers;
    }

    public List<Weakness> getWeaknesses() {
        return weaknesses;
    }
    
    public float[][] getCalculationMatrix() {
        return calculationMatrix;
    }
    
    public Map<String, List<float[][]>> getSecondaryMatrixesByName() {
        return secondaryMatrixesByName;
    }
}
