package PricingStrategy;

import java.util.Map;

public class PricingStrategyFactory {
    private static Map<PricingStrategyEnum, PricingStragey> strategyMap;

    public static PricingStragey getPricingStragey(PricingStrategyEnum pricingStrategyEnum) {
        return strategyMap.get(pricingStrategyEnum);
    }

    static {
        strategyMap.put(PricingStrategyEnum.HOURLY, new HourlyPricingStrategy());
        strategyMap.put(PricingStrategyEnum.CUSTOM, new CustomPricingStrategy());
    }
}
