package scaler.lld3.tictactoe.factory;

import scaler.lld3.tictactoe.models.BotDifficultyLevel;
import scaler.lld3.tictactoe.strategies.botPlayingStrategies.BotPlayingStrategy;
import scaler.lld3.tictactoe.strategies.botPlayingStrategies.EasyBotPlayingStrategy;
import scaler.lld3.tictactoe.strategies.botPlayingStrategies.HardBotPlayingStrategy;
import scaler.lld3.tictactoe.strategies.botPlayingStrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyUsingDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        return switch (botDifficultyLevel) {
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
        };
    }
}
