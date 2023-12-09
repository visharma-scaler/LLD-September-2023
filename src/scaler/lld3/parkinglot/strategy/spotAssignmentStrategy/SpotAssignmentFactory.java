package scaler.lld3.parkinglot.strategy.spotAssignmentStrategy;

import scaler.lld3.parkinglot.models.SpotAssignmentStrategyType;

public class SpotAssignmentFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategyByType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        return switch (spotAssignmentStrategyType) {
            case RANDOM -> new RandomSpotAssignmentStrategy();
            default -> new RandomSpotAssignmentStrategy();
        };
    }
}
